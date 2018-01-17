/*
 * Created on 16 janv. 2018 ( Time 22:40:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.web.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//--- Common classes
import com.dialogflow.web.common.AbstractController;
import com.dialogflow.web.common.FormMode;
import com.dialogflow.web.common.Message;
import com.dialogflow.web.common.MessageType;

//--- Entities
import com.dialogflow.bean.DossierCredit;
import com.dialogflow.bean.Dossier;

//--- Services 
import com.dialogflow.business.service.DossierCreditService;
import com.dialogflow.business.service.DossierService;

//--- List Items 
import com.dialogflow.web.listitem.DossierListItem;

/**
 * Spring MVC controller for 'DossierCredit' management.
 */
@Controller
@RequestMapping("/dossierCredit")
public class DossierCreditController extends AbstractController {

	//--- Variables names ( to be used in JSP with Expression Language )
	private static final String MAIN_ENTITY_NAME = "dossierCredit";
	private static final String MAIN_LIST_NAME   = "list";

	//--- JSP pages names ( View name in the MVC model )
	private static final String JSP_FORM   = "dossierCredit/form";
	private static final String JSP_LIST   = "dossierCredit/list";

	//--- SAVE ACTION ( in the HTML form )
	private static final String SAVE_ACTION_CREATE   = "/dossierCredit/create";
	private static final String SAVE_ACTION_UPDATE   = "/dossierCredit/update";

	//--- Main entity service
	@Resource
    private DossierCreditService dossierCreditService; // Injected by Spring
	//--- Other service(s)
	@Resource
    private DossierService dossierService; // Injected by Spring

	//--------------------------------------------------------------------------------------
	/**
	 * Default constructor
	 */
	public DossierCreditController() {
		super(DossierCreditController.class, MAIN_ENTITY_NAME );
		log("DossierCreditController created.");
	}

	//--------------------------------------------------------------------------------------
	// Spring MVC model management
	//--------------------------------------------------------------------------------------
	/**
	 * Populates the combo-box "items" for the referenced entity "Dossier"
	 * @param model
	 */
	private void populateListOfDossierItems(Model model) {
		List<Dossier> list = dossierService.findAll();
		List<DossierListItem> items = new LinkedList<DossierListItem>();
		for ( Dossier dossier : list ) {
			items.add(new DossierListItem( dossier ) );
		}
		model.addAttribute("listOfDossierItems", items ) ;
	}


	/**
	 * Populates the Spring MVC model with the given entity and eventually other useful data
	 * @param model
	 * @param dossierCredit
	 */
	private void populateModel(Model model, DossierCredit dossierCredit, FormMode formMode) {
		//--- Main entity
		model.addAttribute(MAIN_ENTITY_NAME, dossierCredit);
		if ( formMode == FormMode.CREATE ) {
			model.addAttribute(MODE, MODE_CREATE); // The form is in "create" mode
			model.addAttribute(SAVE_ACTION, SAVE_ACTION_CREATE); 			
			//--- Other data useful in this screen in "create" mode (all fields)
			populateListOfDossierItems(model);
		}
		else if ( formMode == FormMode.UPDATE ) {
			model.addAttribute(MODE, MODE_UPDATE); // The form is in "update" mode
			model.addAttribute(SAVE_ACTION, SAVE_ACTION_UPDATE); 			
			//--- Other data useful in this screen in "update" mode (only non-pk fields)
			populateListOfDossierItems(model);
		}
	}

	//--------------------------------------------------------------------------------------
	// Request mapping
	//--------------------------------------------------------------------------------------
	/**
	 * Shows a list with all the occurrences of DossierCredit found in the database
	 * @param model Spring MVC model
	 * @return
	 */
	@RequestMapping()
	public String list(Model model) {
		log("Action 'list'");
		List<DossierCredit> list = dossierCreditService.findAll();
		model.addAttribute(MAIN_LIST_NAME, list);		
		return JSP_LIST;
	}

	/**
	 * Shows a form page in order to create a new DossierCredit
	 * @param model Spring MVC model
	 * @return
	 */
	@RequestMapping("/form")
	public String formForCreate(Model model) {
		log("Action 'formForCreate'");
		//--- Populates the model with a new instance
		DossierCredit dossierCredit = new DossierCredit();	
		populateModel( model, dossierCredit, FormMode.CREATE);
		return JSP_FORM;
	}

	/**
	 * Shows a form page in order to update an existing DossierCredit
	 * @param model Spring MVC model
	 * @param id  primary key element
	 * @return
	 */
	@RequestMapping(value = "/form/{id}")
	public String formForUpdate(Model model, @PathVariable("id") Integer id ) {
		log("Action 'formForUpdate'");
		//--- Search the entity by its primary key and stores it in the model 
		DossierCredit dossierCredit = dossierCreditService.findById(id);
		populateModel( model, dossierCredit, FormMode.UPDATE);		
		return JSP_FORM;
	}

	/**
	 * 'CREATE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param dossierCredit  entity to be created
	 * @param bindingResult Spring MVC binding result
	 * @param model Spring MVC model
	 * @param redirectAttributes Spring MVC redirect attributes
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/create" ) // GET or POST
	public String create(@Valid DossierCredit dossierCredit, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		log("Action 'create'");
		try {
			if (!bindingResult.hasErrors()) {
				DossierCredit dossierCreditCreated = dossierCreditService.create(dossierCredit); 
				model.addAttribute(MAIN_ENTITY_NAME, dossierCreditCreated);

				//---
				messageHelper.addMessage(redirectAttributes, new Message(MessageType.SUCCESS,"save.ok"));
				return redirectToForm(httpServletRequest, dossierCredit.getId() );
			} else {
				populateModel( model, dossierCredit, FormMode.CREATE);
				return JSP_FORM;
			}
		} catch(Exception e) {
			log("Action 'create' : Exception - " + e.getMessage() );
			messageHelper.addException(model, "dossierCredit.error.create", e);
			populateModel( model, dossierCredit, FormMode.CREATE);
			return JSP_FORM;
		}
	}

	/**
	 * 'UPDATE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param dossierCredit  entity to be updated
	 * @param bindingResult Spring MVC binding result
	 * @param model Spring MVC model
	 * @param redirectAttributes Spring MVC redirect attributes
	 * @param httpServletRequest
	 * @return
	 */
	@RequestMapping(value = "/update" ) // GET or POST
	public String update(@Valid DossierCredit dossierCredit, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes, HttpServletRequest httpServletRequest) {
		log("Action 'update'");
		try {
			if (!bindingResult.hasErrors()) {
				//--- Perform database operations
				DossierCredit dossierCreditSaved = dossierCreditService.update(dossierCredit);
				model.addAttribute(MAIN_ENTITY_NAME, dossierCreditSaved);
				//--- Set the result message
				messageHelper.addMessage(redirectAttributes, new Message(MessageType.SUCCESS,"save.ok"));
				log("Action 'update' : update done - redirect");
				return redirectToForm(httpServletRequest, dossierCredit.getId());
			} else {
				log("Action 'update' : binding errors");
				populateModel( model, dossierCredit, FormMode.UPDATE);
				return JSP_FORM;
			}
		} catch(Exception e) {
			messageHelper.addException(model, "dossierCredit.error.update", e);
			log("Action 'update' : Exception - " + e.getMessage() );
			populateModel( model, dossierCredit, FormMode.UPDATE);
			return JSP_FORM;
		}
	}

	/**
	 * 'DELETE' action processing. <br>
	 * This action is based on the 'Post/Redirect/Get (PRG)' pattern, so it ends by 'http redirect'<br>
	 * @param redirectAttributes
	 * @param id  primary key element
	 * @return
	 */
	@RequestMapping(value = "/delete/{id}") // GET or POST
	public String delete(RedirectAttributes redirectAttributes, @PathVariable("id") Integer id) {
		log("Action 'delete'" );
		try {
			dossierCreditService.delete( id );
			//--- Set the result message
			messageHelper.addMessage(redirectAttributes, new Message(MessageType.SUCCESS,"delete.ok"));	
		} catch(Exception e) {
			messageHelper.addException(redirectAttributes, "dossierCredit.error.delete", e);
		}
		return redirectToList();
	}

}