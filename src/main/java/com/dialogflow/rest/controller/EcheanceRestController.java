/*
 * Created on 16 janv. 2018 ( Time 22:40:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package com.dialogflow.rest.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.dialogflow.bean.Echeance;
import com.dialogflow.business.service.EcheanceService;
import com.dialogflow.web.listitem.EcheanceListItem;

/**
 * Spring MVC controller for 'Echeance' management.
 */
@Controller
public class EcheanceRestController {

	@Resource
	private EcheanceService echeanceService;
	
	@RequestMapping( value="/items/echeance",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<EcheanceListItem> findAllAsListItems() {
		List<Echeance> list = echeanceService.findAll();
		List<EcheanceListItem> items = new LinkedList<EcheanceListItem>();
		for ( Echeance echeance : list ) {
			items.add(new EcheanceListItem( echeance ) );
		}
		return items;
	}
	
	@RequestMapping( value="/echeance",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Echeance> findAll() {
		return echeanceService.findAll();
	}

	@RequestMapping( value="/echeance/{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Echeance findOne(@PathVariable("id") Integer id) {
		return echeanceService.findById(id);
	}
	
	@RequestMapping( value="/echeance",
			method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Echeance create(@RequestBody Echeance echeance) {
		return echeanceService.create(echeance);
	}

	@RequestMapping( value="/echeance/{id}",
			method = RequestMethod.PUT,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Echeance update(@PathVariable("id") Integer id, @RequestBody Echeance echeance) {
		return echeanceService.update(echeance);
	}

	@RequestMapping( value="/echeance/{id}",
			method = RequestMethod.DELETE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void delete(@PathVariable("id") Integer id) {
		echeanceService.delete(id);
	}
	
}
