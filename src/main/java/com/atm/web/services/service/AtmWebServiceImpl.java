package com.atm.web.services.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atm.web.services.model.Central;
import com.atm.web.services.model.Contact;
import com.atm.web.services.model.ContactDetail;
import com.atm.web.services.model.ContactType;
import com.atm.web.services.model.Detail;
import com.atm.web.services.model.Group;
import com.atm.web.services.model.GroupDetail;
import com.atm.web.services.model.Plan;
import com.atm.web.services.model.PlanDetail;
import com.atm.web.services.model.PlanGroup;
import com.atm.web.services.model.Product;
import com.atm.web.services.model.ProductPlan;
import com.atm.web.services.model.Social;
import com.atm.web.services.dto.CentralInfo;
import com.atm.web.services.dto.ContactDetailInfo;
import com.atm.web.services.dto.ContactInfo;
import com.atm.web.services.dto.DetailGroupInfo;
import com.atm.web.services.dto.DetailsInfo;
import com.atm.web.services.dto.MenuCentralInfo;
import com.atm.web.services.dto.PlanInfo;
import com.atm.web.services.dto.ProductInfo;
import com.atm.web.services.dto.SocialInfo;

@Service
public class AtmWebServiceImpl implements AtmWebService {

	@SuppressWarnings("unused")
	private static final Log log = LogFactory.getLog(AtmWebServiceImpl.class);

	@Autowired
	private ProductService productService;

	@Autowired
	private PlanService planService;

	@Autowired
	private GroupService groupService;

	@Autowired
	private DetailService detailService;
	
	@Autowired
	private SocialService socialService;
	
	@Autowired
	private CentralService centralService;
	
	@Autowired
	private ContactService contactlService;

	@Override
	public List<ProductInfo> getProducts() {
		List<ProductInfo> listProducts = new ArrayList<>();
		for (Product product : productService.list()) {
			ProductInfo item = new ProductInfo();
			item.setId(product.getId());
			item.setName(product.getName());
			item.setImage(product.getImage());
			listProducts.add(item);
		}
		return listProducts;
	}

	@Override
	public List<PlanInfo> getPlans(Long product) {
		List<PlanInfo> listProductPlans = new ArrayList<>();
		List<Plan> listPlans = planService.list();
		for (ProductPlan productplan : productService.listPlans(product)) {
			Plan plan = listPlans.stream().filter(p -> p.getId().equals(productplan.getPlan())).findAny().orElse(null);
			PlanInfo item = new PlanInfo();
			item.setId(plan.getId());
			item.setName(plan.getName());
			listProductPlans.add(item);
		}
		return listProductPlans;
	}

	@Override
	public DetailsInfo getDetails(Long plan) {
		DetailsInfo item = new DetailsInfo();
		List<DetailGroupInfo> listCoberturas = new ArrayList<>();
		List<DetailGroupInfo> listDias = new ArrayList<>();
		List<DetailGroupInfo> listAnios = new ArrayList<>();

		List<Group> listGroups = groupService.list();
		List<String> detailsCobertura = new ArrayList<>();
		List<String> detailsDias = new ArrayList<>();
		List<String> detailsAnios = new ArrayList<>();
		
		List<PlanGroup> listPlanGroups = planService.listGroup(plan);

		for (PlanGroup planGroup : listPlanGroups) {
			Group group = listGroups.stream().filter(p -> p.getId().equals(planGroup.getGroup())).findAny()
					.orElse(null);
			if (group.getType() == 1) {
				detailsCobertura.add(group.getName());
			} else if (group.getType() == 2) {
				detailsDias.add(group.getName());
			} else {
				detailsAnios.add(group.getName());
			}
		}

		DetailGroupInfo detailInfo = new DetailGroupInfo("", detailsCobertura);
		listCoberturas.add(detailInfo);
		detailInfo = new DetailGroupInfo("", detailsDias);
		listDias.add(detailInfo);
		detailInfo = new DetailGroupInfo("", detailsAnios);
		listAnios.add(detailInfo);

		List<Detail> listDetails = detailService.list();
		for (PlanDetail planDetail : planService.listDetail(plan)) {
			Detail detail = listDetails.stream().filter(p -> p.getId().equals(planDetail.getDetail())).findAny()
					.orElse(null);

			detailsCobertura = new ArrayList<>();
			detailsDias = new ArrayList<>();
			detailsAnios = new ArrayList<>();

			List<GroupDetail> listGroupDetail = groupService.listDetails(detail.getId());
			for (PlanGroup planGroup : listPlanGroups) {
				Group group = listGroups.stream().filter(p -> p.getId().equals(planGroup.getGroup())).findAny()
						.orElse(null);
				GroupDetail groupDetail = listGroupDetail.stream().filter(p -> p.getGroup().equals(group.getId()))
						.findAny().orElse(null);
				if (groupDetail != null) {
					if (group.getType() == 1) {
						detailsCobertura.add(groupDetail.getDescription());
					} else if (group.getType() == 2) {
						detailsDias.add(groupDetail.getDescription());
					} else {
						detailsAnios.add(groupDetail.getDescription());
					}
				}
			}

			if (detail.getType() == 1) {
				detailInfo = new DetailGroupInfo(detail.getName(), detailsCobertura);
			} else {
				if (detail.getType() == 2) {
					detailInfo = new DetailGroupInfo(detail.getName(), detailsDias);
				} else {
					detailInfo = new DetailGroupInfo(detail.getName(), detailsAnios);
				}
			}

			if (detail.getType() == 1) {
				listCoberturas.add(detailInfo);
			} else {
				if (detail.getType() == 2) {
					listDias.add(detailInfo);
				} else {
					listAnios.add(detailInfo);
				}
			}
		}
		item.setCoberturas(listCoberturas);
		item.setDias(listDias);
		item.setAnios(listAnios);
		return item;
	}

	@Override
	public MenuCentralInfo getMenuCentrals() {
		MenuCentralInfo menuCentralInfo = new MenuCentralInfo();
		
		List<SocialInfo> listSocials = new ArrayList<>();
		for (Social social : socialService.list()) {
			SocialInfo item = new SocialInfo();
			item.setId(social.getId());
			item.setName(social.getName());
			item.setIcon(social.getIcon());
			item.setUrl(social.getUrl());
			listSocials.add(item);
		}
		menuCentralInfo.setRedesSociales(listSocials);
		
		List<CentralInfo> listCentrals = new ArrayList<>();
		for (Central central: centralService.list()) {
			CentralInfo item = new CentralInfo();
			item.setId(central.getId());
			item.setName(central.getName());
			item.setImage(central.getImage());
			item.setPhone(central.getPhone());
			listCentrals.add(item);
		}
		menuCentralInfo.setCentrales(listCentrals);
		
		return menuCentralInfo;
	}

	@Override
	public List<ContactInfo> getContacts() {
		List<ContactInfo> listContacts = new ArrayList<>();
		for (Contact contact : contactlService.list()) {
			ContactInfo item = new ContactInfo();
			item.setId(contact.getId());
			item.setName(contact.getName());
			item.setImage(contact.getImage());
			listContacts.add(item);
		}
		return listContacts;
	}

	@Override
	public List<ContactDetailInfo> getContactDetails(Long contact) {
		List<ContactDetailInfo> listContactDetails = new ArrayList<>();
		for (ContactType contactType : contactlService.listTypes(contact)) {
			ContactDetailInfo item = new ContactDetailInfo();
			item.setIcon(contactType.getIcon());
			item.setDescription(contactType.getDescription());
			item.setId(contactType.getId());
			List<String> items = new ArrayList<>();
			for (ContactDetail contactDetail : contactlService.listDetails(item.getId())) {
				items.add(contactDetail.getName());
			}
			item.setDetails(items);
			listContactDetails.add(item);
		}
		return listContactDetails;
	}

}
