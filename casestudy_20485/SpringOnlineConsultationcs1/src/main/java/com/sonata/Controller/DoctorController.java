package com.sonata.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Doctor;
import com.sonata.Repository.DoctorRepository;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorRepository dr;
	
	@GetMapping("/getDoc")
	public List<Doctor> getAllDoc(){
		return dr.findAll();
	}
	
	@PostMapping("/updatedetails")
	public int updateDetails(@RequestBody Doctor doc) {
		return dr.updateDeails(doc.getDrID(), doc.getDrName(), doc.getPhoneNumber(), doc.getSpecialization());
	}
	
	
}