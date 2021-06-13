package com.compname.compnamevendorservice.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compname.compnamevendorservice.dao.VendorDao;
import com.compname.compnamevendorservice.entity.VendorEntity;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/vendorcontroller")
public class VendorController {

	@GetMapping("/ping")
	public String Greeting()
	{
		return "pong";
	}
	
	@Autowired
	VendorDao vendorRepository;
	
	//.................................................................
	@GetMapping("/showvendor")
	public List<VendorEntity> getvendor() 
	{
		return (List<VendorEntity>) vendorRepository.findAll();
	}

	//.................................................................
	@PostMapping("/savevendor")
	public String insertVendor(@RequestBody VendorEntity vendors) {
		vendorRepository.save(vendors);
		return "One Owner saved successfully!";

	}
	//.................................................................
	
	@PostMapping("/savevendors")
	public String insertVendor(@RequestBody List<VendorEntity> vendors) {
		vendorRepository.saveAll(vendors);
		return "Owner's saved successfully!";

	}
	
	//.................................................................
	
	@PutMapping("/updatevendor")
	public VendorEntity updatevendor(@RequestBody VendorEntity vendors) {
		return vendorRepository.save(vendors); 
	}
	
	//.................................................................
	
	@PutMapping("/updatevendors")
	public List<VendorEntity> updatevendor(@RequestBody List<VendorEntity> vendors) {
		return vendorRepository.saveAll(vendors); 
	}
	
	//.................................................................
	
	@DeleteMapping("/deletevendor")
	public String delete (@RequestBody VendorEntity vendors) {
		vendorRepository.deleteById(vendors.getId());
		return "Record deleted successfully !" ;
	}
	
	@DeleteMapping("/deletevendor1")
	public String delete1(@RequestBody VendorEntity vendors) {
		vendorRepository.deleteById(vendors.getId());
		return "Record deleted successfully !" ;
	}
	
	
}

