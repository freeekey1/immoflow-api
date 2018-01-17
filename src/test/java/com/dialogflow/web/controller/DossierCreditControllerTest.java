package com.dialogflow.web.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

//--- Entities
import com.dialogflow.bean.DossierCredit;
import com.dialogflow.bean.Dossier;
import com.dialogflow.test.DossierCreditFactoryForTest;
import com.dialogflow.test.DossierFactoryForTest;

//--- Services 
import com.dialogflow.business.service.DossierCreditService;
import com.dialogflow.business.service.DossierService;

//--- List Items 
import com.dialogflow.web.listitem.DossierListItem;

import com.dialogflow.web.common.Message;
import com.dialogflow.web.common.MessageHelper;
import com.dialogflow.web.common.MessageType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.MessageSource;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RunWith(MockitoJUnitRunner.class)
public class DossierCreditControllerTest {
	
	@InjectMocks
	private DossierCreditController dossierCreditController;
	@Mock
	private DossierCreditService dossierCreditService;
	@Mock
	private MessageHelper messageHelper;
	@Mock
	private MessageSource messageSource;
	@Mock
	private DossierService dossierService; // Injected by Spring

	private DossierCreditFactoryForTest dossierCreditFactoryForTest = new DossierCreditFactoryForTest();
	private DossierFactoryForTest dossierFactoryForTest = new DossierFactoryForTest();

	List<Dossier> dossiers = new ArrayList<Dossier>();

	private void givenPopulateModel() {
		Dossier dossier1 = dossierFactoryForTest.newDossier();
		Dossier dossier2 = dossierFactoryForTest.newDossier();
		List<Dossier> dossiers = new ArrayList<Dossier>();
		dossiers.add(dossier1);
		dossiers.add(dossier2);
		when(dossierService.findAll()).thenReturn(dossiers);

	}

	@Test
	public void list() {
		// Given
		Model model = new ExtendedModelMap();
		
		List<DossierCredit> list = new ArrayList<DossierCredit>();
		when(dossierCreditService.findAll()).thenReturn(list);
		
		// When
		String viewName = dossierCreditController.list(model);
		
		// Then
		assertEquals("dossierCredit/list", viewName);
		Map<String,?> modelMap = model.asMap();
		assertEquals(list, modelMap.get("list"));
	}
	
	@Test
	public void formForCreate() {
		// Given
		Model model = new ExtendedModelMap();
		
		givenPopulateModel();
		
		// When
		String viewName = dossierCreditController.formForCreate(model);
		
		// Then
		assertEquals("dossierCredit/form", viewName);
		
		Map<String,?> modelMap = model.asMap();
		
		assertNull(((DossierCredit)modelMap.get("dossierCredit")).getId());
		assertEquals("create", modelMap.get("mode"));
		assertEquals("/dossierCredit/create", modelMap.get("saveAction"));
		
		@SuppressWarnings("unchecked")
		List<DossierListItem> dossierListItems = (List<DossierListItem>) modelMap.get("listOfDossierItems");
		assertEquals(2, dossierListItems.size());
		
	}
	
	@Test
	public void formForUpdate() {
		// Given
		Model model = new ExtendedModelMap();
		
		givenPopulateModel();
		
		DossierCredit dossierCredit = dossierCreditFactoryForTest.newDossierCredit();
		Integer id = dossierCredit.getId();
		when(dossierCreditService.findById(id)).thenReturn(dossierCredit);
		
		// When
		String viewName = dossierCreditController.formForUpdate(model, id);
		
		// Then
		assertEquals("dossierCredit/form", viewName);
		
		Map<String,?> modelMap = model.asMap();
		
		assertEquals(dossierCredit, (DossierCredit) modelMap.get("dossierCredit"));
		assertEquals("update", modelMap.get("mode"));
		assertEquals("/dossierCredit/update", modelMap.get("saveAction"));
		
		List<DossierListItem> dossierListItems = (List<DossierListItem>) modelMap.get("listOfDossierItems");
		assertEquals(2, dossierListItems.size());
		
	}
	
	@Test
	public void createOk() {
		// Given
		Model model = new ExtendedModelMap();
		
		DossierCredit dossierCredit = dossierCreditFactoryForTest.newDossierCredit();
		BindingResult bindingResult = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
		
		DossierCredit dossierCreditCreated = new DossierCredit();
		when(dossierCreditService.create(dossierCredit)).thenReturn(dossierCreditCreated); 
		
		// When
		String viewName = dossierCreditController.create(dossierCredit, bindingResult, model, redirectAttributes, httpServletRequest);
		
		// Then
		assertEquals("redirect:/dossierCredit/form/"+dossierCredit.getId(), viewName);

		Map<String,?> modelMap = model.asMap();
		
		assertEquals(dossierCreditCreated, (DossierCredit) modelMap.get("dossierCredit"));
		assertEquals(null, modelMap.get("mode"));
		assertEquals(null, modelMap.get("saveAction"));
		
		Mockito.verify(messageHelper).addMessage(redirectAttributes, new Message(MessageType.SUCCESS,"save.ok"));
	}

	@Test
	public void createBindingResultErrors() {
		// Given
		Model model = new ExtendedModelMap();
		
		givenPopulateModel();
		
		DossierCredit dossierCredit = dossierCreditFactoryForTest.newDossierCredit();
		BindingResult bindingResult = mock(BindingResult.class);
		when(bindingResult.hasErrors()).thenReturn(true);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
		
		// When
		String viewName = dossierCreditController.create(dossierCredit, bindingResult, model, redirectAttributes, httpServletRequest);
		
		// Then
		assertEquals("dossierCredit/form", viewName);

		Map<String,?> modelMap = model.asMap();
		
		assertEquals(dossierCredit, (DossierCredit) modelMap.get("dossierCredit"));
		assertEquals("create", modelMap.get("mode"));
		assertEquals("/dossierCredit/create", modelMap.get("saveAction"));
		
		@SuppressWarnings("unchecked")
		List<DossierListItem> dossierListItems = (List<DossierListItem>) modelMap.get("listOfDossierItems");
		assertEquals(2, dossierListItems.size());
		
	}

	@Test
	public void createException() {
		// Given
		Model model = new ExtendedModelMap();
		
		givenPopulateModel();
		
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
		BindingResult bindingResult = mock(BindingResult.class);
		when(bindingResult.hasErrors()).thenReturn(false);

		DossierCredit dossierCredit = dossierCreditFactoryForTest.newDossierCredit();
		
		Exception exception = new RuntimeException("test exception");
		when(dossierCreditService.create(dossierCredit)).thenThrow(exception);
		
		// When
		String viewName = dossierCreditController.create(dossierCredit, bindingResult, model, redirectAttributes, httpServletRequest);
		
		// Then
		assertEquals("dossierCredit/form", viewName);

		Map<String,?> modelMap = model.asMap();
		
		assertEquals(dossierCredit, (DossierCredit) modelMap.get("dossierCredit"));
		assertEquals("create", modelMap.get("mode"));
		assertEquals("/dossierCredit/create", modelMap.get("saveAction"));
		
		Mockito.verify(messageHelper).addException(model, "dossierCredit.error.create", exception);
		
		@SuppressWarnings("unchecked")
		List<DossierListItem> dossierListItems = (List<DossierListItem>) modelMap.get("listOfDossierItems");
		assertEquals(2, dossierListItems.size());
		
	}

	@Test
	public void updateOk() {
		// Given
		Model model = new ExtendedModelMap();
		
		DossierCredit dossierCredit = dossierCreditFactoryForTest.newDossierCredit();
		Integer id = dossierCredit.getId();

		BindingResult bindingResult = mock(BindingResult.class);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
		
		DossierCredit dossierCreditSaved = new DossierCredit();
		dossierCreditSaved.setId(id);
		when(dossierCreditService.update(dossierCredit)).thenReturn(dossierCreditSaved); 
		
		// When
		String viewName = dossierCreditController.update(dossierCredit, bindingResult, model, redirectAttributes, httpServletRequest);
		
		// Then
		assertEquals("redirect:/dossierCredit/form/"+dossierCredit.getId(), viewName);

		Map<String,?> modelMap = model.asMap();
		
		assertEquals(dossierCreditSaved, (DossierCredit) modelMap.get("dossierCredit"));
		assertEquals(null, modelMap.get("mode"));
		assertEquals(null, modelMap.get("saveAction"));
		
		Mockito.verify(messageHelper).addMessage(redirectAttributes, new Message(MessageType.SUCCESS,"save.ok"));
	}

	@Test
	public void updateBindingResultErrors() {
		// Given
		Model model = new ExtendedModelMap();
		
		givenPopulateModel();
		
		DossierCredit dossierCredit = dossierCreditFactoryForTest.newDossierCredit();
		BindingResult bindingResult = mock(BindingResult.class);
		when(bindingResult.hasErrors()).thenReturn(true);
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
		
		// When
		String viewName = dossierCreditController.update(dossierCredit, bindingResult, model, redirectAttributes, httpServletRequest);
		
		// Then
		assertEquals("dossierCredit/form", viewName);

		Map<String,?> modelMap = model.asMap();
		
		assertEquals(dossierCredit, (DossierCredit) modelMap.get("dossierCredit"));
		assertEquals("update", modelMap.get("mode"));
		assertEquals("/dossierCredit/update", modelMap.get("saveAction"));
		
		@SuppressWarnings("unchecked")
		List<DossierListItem> dossierListItems = (List<DossierListItem>) modelMap.get("listOfDossierItems");
		assertEquals(2, dossierListItems.size());
		
	}

	@Test
	public void updateException() {
		// Given
		Model model = new ExtendedModelMap();
		
		givenPopulateModel();
		
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
		BindingResult bindingResult = mock(BindingResult.class);
		when(bindingResult.hasErrors()).thenReturn(false);

		DossierCredit dossierCredit = dossierCreditFactoryForTest.newDossierCredit();
		
		Exception exception = new RuntimeException("test exception");
		when(dossierCreditService.update(dossierCredit)).thenThrow(exception);
		
		// When
		String viewName = dossierCreditController.update(dossierCredit, bindingResult, model, redirectAttributes, httpServletRequest);
		
		// Then
		assertEquals("dossierCredit/form", viewName);

		Map<String,?> modelMap = model.asMap();
		
		assertEquals(dossierCredit, (DossierCredit) modelMap.get("dossierCredit"));
		assertEquals("update", modelMap.get("mode"));
		assertEquals("/dossierCredit/update", modelMap.get("saveAction"));
		
		Mockito.verify(messageHelper).addException(model, "dossierCredit.error.update", exception);
		
		@SuppressWarnings("unchecked")
		List<DossierListItem> dossierListItems = (List<DossierListItem>) modelMap.get("listOfDossierItems");
		assertEquals(2, dossierListItems.size());
		
	}
	

	@Test
	public void deleteOK() {
		// Given
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		
		DossierCredit dossierCredit = dossierCreditFactoryForTest.newDossierCredit();
		Integer id = dossierCredit.getId();
		
		// When
		String viewName = dossierCreditController.delete(redirectAttributes, id);
		
		// Then
		verify(dossierCreditService).delete(id);
		assertEquals("redirect:/dossierCredit", viewName);
		Mockito.verify(messageHelper).addMessage(redirectAttributes, new Message(MessageType.SUCCESS,"delete.ok"));
	}

	@Test
	public void deleteException() {
		// Given
		RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
		
		DossierCredit dossierCredit = dossierCreditFactoryForTest.newDossierCredit();
		Integer id = dossierCredit.getId();
		
		Exception exception = new RuntimeException("test exception");
		doThrow(exception).when(dossierCreditService).delete(id);
		
		// When
		String viewName = dossierCreditController.delete(redirectAttributes, id);
		
		// Then
		verify(dossierCreditService).delete(id);
		assertEquals("redirect:/dossierCredit", viewName);
		Mockito.verify(messageHelper).addException(redirectAttributes, "dossierCredit.error.delete", exception);
	}
	
	
}
