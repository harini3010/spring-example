package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;

@Service
public class DoctorService {
	
	private DoctorRepository repo;

	@Autowired
	public DoctorService(DoctorRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<Doctor> findAll(){
		
		return this.repo.findAll();
	}
	
	public List<Doctor> findByCity(String srchCity){
		
		return this.repo.findByCity(srchCity);
	}
	
	

		
}
