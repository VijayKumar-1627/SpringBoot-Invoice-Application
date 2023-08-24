package com.invoice.invoiceapplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invoice.invoiceapplication.Entity.ResourcesEntity;
import com.invoice.invoiceapplication.Entity.UsersEntity;

@Repository
public interface ResourceRepository extends JpaRepository<ResourcesEntity, Integer> {

}
