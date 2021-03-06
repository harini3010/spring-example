package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	public List<Doctor> findByCity(String srchCity);

}
