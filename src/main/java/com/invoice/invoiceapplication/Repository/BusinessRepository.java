package com.invoice.invoiceapplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.invoice.invoiceapplication.Entity.BusinessEntity;

import jakarta.transaction.Transactional;

public interface BusinessRepository extends JpaRepository<BusinessEntity, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM business WHERE business_name =:businessName", nativeQuery=true)
	int deleteBusiness(@Param("businessName") String businessName);
}
