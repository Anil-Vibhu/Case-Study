package com.sonata.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.validation.annotation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.sonata.model.Doctor;
import com.sonata.Repository.DoctorRepository;



@RestController
public class DoctorController {

Optional<Doctor>p1;

@Autowired
private DoctorRepository prepository;

@GetMapping("/doctors")
public List<Doctor>getAllDoctors(){
return prepository.findAll();}

@GetMapping("/doctors/{id}")
public ResponseEntity getDoctorbyId(@PathVariable(value="id")Long docId) {
	p1=prepository.findById(docId);
	return ResponseEntity.ok().body(p1);}

@PostMapping(value = "/doctors")
public Doctor saveDoctor(@RequestBody Doctor doc) {
	return prepository.save(doc);}

@PutMapping(value="/doctors/{id}")
public ResponseEntity updateDoctor(@PathVariable(value="id")Long docId, @RequestBody Doctor docdata) {
	
p1= prepository.findById(docId);
Doctor p2=p1.get();
p2.setDocId(docdata.getDocId());
p2.setDname(docdata.getDname());
p2.setAge(docdata.getAge());
p2.setEmail(docdata.getEmail());
p2.setPhNumber(docdata.getPhNumber());
p2.setSpecialization(docdata.getSpecialization());

Doctor updateDoctor = prepository.save(p2);
return ResponseEntity.ok(updateDoctor);

}

@DeleteMapping(value="/doctors/{id}")
public ResponseEntity deleteDoctor(@PathVariable(value="id")Long docId) {
	prepository.deleteById(docId);
	return ResponseEntity.noContent().build();
}



}

