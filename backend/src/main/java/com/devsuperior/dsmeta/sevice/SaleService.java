package com.devsuperior.dsmeta.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repository.SalesRepository;

@Service
public class SaleService {
	
	@Autowired
	SalesRepository repository;
	
	public List <Sale> findAll(){
		List<Sale> result = repository.findAll();
		return result;
	}

}
