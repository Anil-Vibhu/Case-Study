package com.sonata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Diseases;
import com.sonata.Repository.DiseasesRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/dis")
public class DiseasesController {

	@Autowired
	private DiseasesRepository disRepo;

	@GetMapping("show")
	public List<Diseases> showAll() {
		return disRepo.findAll();
	}

	@PostMapping("/add")
	public Diseases add(@RequestBody Diseases d) {
		return disRepo.save(d);
	}

	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Diseases> delete(@PathVariable Long id) {
		disRepo.deleteById(id);
		return ResponseEntity.status(200).build();
	}

}