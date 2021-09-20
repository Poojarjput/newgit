package com.htc.clinicmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.clinicmanagement.dao.IDoctor;
import com.htc.clinicmanagement.entity.Doctor;


@RestController
@RequestMapping("/api")
public class DoctorController {
	
	@Autowired
	private IDoctor repo;

	
	 @GetMapping("/doctors")
	  public List<Doctor> getAllDoctordetails() {
	   
	    List<Doctor> list = new ArrayList<>();
	    Iterable<Doctor> customers = repo.findAll();
	 
	    customers.forEach(list::add);
	    return list;
	  }
	 
	
	@GetMapping("/doctors/{doctorId}")
	Doctor getDoctorbyId(@PathVariable Long doctorId)
	{
		Doctor doctor=null;
		doctor=repo.findById(doctorId).get();//Due to lazy loading in JPA instead of repo.getOne(id)
		return doctor;
		
	}
	
	
	
	@PostMapping("/doctors")
	Doctor createDoctordetails(@RequestBody Doctor doctor)
	{
		return repo.save(doctor);
		
	}

}
