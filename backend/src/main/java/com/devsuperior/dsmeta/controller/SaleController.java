package com.devsuperior.dsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.sevice.SaleService;

@RestController
public class SaleController {
	
	@Autowired
	SaleService saleService;
	
	
	@GetMapping(value = "/sales")
	public ResponseEntity<List<Sale>> returnAll(){
		List<Sale> result =saleService.findAll();
		return ResponseEntity.ok(result);
	}

}
