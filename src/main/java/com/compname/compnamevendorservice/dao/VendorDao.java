package com.compname.compnamevendorservice.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.compname.compnamevendorservice.entity.VendorEntity;



public interface VendorDao extends JpaRepository<VendorEntity, Integer> {

}

