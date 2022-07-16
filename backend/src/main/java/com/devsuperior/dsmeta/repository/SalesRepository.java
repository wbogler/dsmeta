package com.devsuperior.dsmeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}
