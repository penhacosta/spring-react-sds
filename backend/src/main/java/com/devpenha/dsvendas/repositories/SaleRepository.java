package com.devpenha.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devpenha.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
