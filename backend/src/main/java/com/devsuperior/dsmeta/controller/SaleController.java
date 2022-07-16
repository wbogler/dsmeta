package com.devsuperior.dsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.sevice.SaleService;
import com.devsuperior.dsmeta.sevice.SmsService;

@RestController
public class SaleController {
	
	@Autowired
	SaleService saleService;
	
	@Autowired
	SmsService smsService;
	
	@GetMapping(value = "/allsales")
	public ResponseEntity<List<Sale>> allSales(){
		return ResponseEntity.ok(saleService.findAll());
	}
	
	
	@GetMapping(value = "/sale")
	public Page<Sale> returnAll(@RequestParam(value = "minDate", defaultValue = "") String minDate, 
								@RequestParam(value = "maxDate", defaultValue = "")String maxDate, 
								Pageable pageable){
		return saleService.findDate(minDate, maxDate, pageable);
	}
	
	@GetMapping(value = "/{id}/notification")
	public void notifySms(@PathVariable Long id) {
		smsService.sendSms(id);
	}

}
