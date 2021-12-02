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
import com.sonata.Model.Slot;
import com.sonata.Repository.SlotRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/slot")
public class SlotController {
	
	@Autowired
	private SlotRepository sr;
	
	@GetMapping("/show")
	public List<Slot> showAll(){
		return sr.findAll();
	}
	
	@PostMapping("/add")
	public Slot add(@RequestBody Slot s) {
		return sr.save(s);
	}
	
}