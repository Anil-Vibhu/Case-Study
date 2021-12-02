package com.sonata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Doctor;
import com.sonata.Model.Patient;
import com.sonata.Model.PatientFeedback;
import com.sonata.Model.Slot;
import com.sonata.Repository.PatientFeedbackRepository;

@RestController
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:3000" })
@RequestMapping("/feedback")
public class PatientFeedbackController {

	@Autowired
	private PatientFeedbackRepository fbRepo;

	@GetMapping("/show")
	public List<PatientFeedback> showAll() {
		return fbRepo.findAll();
	}

	@PostMapping("/add")
	public PatientFeedback add(@RequestBody PatientFeedback fb) {
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		fb.setDate(date);
		return fbRepo.save(fb);
	}

	@PostMapping("/bydoc")
	public List<PatientFeedback> byDoc(@RequestBody Doctor doc) {
		return fbRepo.findByDoc(doc.getDrID());
	}

	

}