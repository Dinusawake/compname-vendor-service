package compname.admin.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import compname.admin.service.dao.AdminDao;
import compname.admin.service.entity.AdminEntity;
import compname.admin.service.entity.AdminLabourRequest;


@RestController
@RequestMapping("/admincontroller")
public class AdminController {
	
		
	@Autowired
	AdminDao adminRepository;

	@GetMapping("/ping")
	public String Greeting()
	{
		return "pong";
	}
	
	@GetMapping("/showadmin")
	public List<AdminEntity> getlabour1() 
	{
		return (List<AdminEntity>) adminRepository.findAll();
	}
	
	

	@PostMapping("/saveadmin")
	public String insertadmin(@RequestBody AdminEntity Admins) {
		adminRepository.save(Admins);
		return "Admin saved successfully!";

	}
	
	
	@PostMapping("/changelaborrequest")
	
	public String updatelabourrequest(@RequestBody AdminLabourRequest adminLabourRequest  ) {
		adminLabourRequest.setStatusOfRequest("pending");
	return "status changed successfully!";

	}

	
	
	@PutMapping("/updateadmin")
	public AdminEntity updateadmin(@RequestBody AdminEntity Admins) {
		return adminRepository.save(Admins); 
	}
	
		
	@DeleteMapping("/deleteadmin")
	public String delete (@RequestBody AdminEntity Admins) {
		adminRepository.deleteById(Admins.getAdminId());
		return "Record deleted successfully !" ;
	}
	
	
}
