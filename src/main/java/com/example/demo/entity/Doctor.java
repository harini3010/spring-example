package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "vh_doctor1")


public class Doctor {
	@Id //for primary key
	@Column(name="doctorid")
	int doctorId;
	@Column(name="doctornmae")//for column name
	 String doctornmae;
	@Column(name="handphone")	
	long handPhone;
	@Column(name="email")
	 String email;
	@Column(name="specilization")
	 String specialization;
	@Column(name="city")
	 String city;
	

}
