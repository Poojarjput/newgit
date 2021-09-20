package com.htc.clinicmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.clinicmanagement.entity.Doctor;

public interface IDoctor extends JpaRepository<Doctor, Long> {
	
	
	

}
