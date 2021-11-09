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



import com.sonata.model.Patient1;
import com.sonata.Repository.Patient1Repository;



@RestController
public class Patient1Controller {

Optional<Patient1>p1;

@Autowired
private Patient1Repository prepository;

@GetMapping("/patient1s")
public List<Patient1>getAllPatient1s(){
return prepository.findAll();}

@GetMapping("/patient1s/{id}")
public ResponseEntity getPatient1byId(@PathVariable(value="id")Long patId) {
	p1=prepository.findById(patId);
	return ResponseEntity.ok().body(p1);}

@PostMapping(value = "/patient1s")
public Patient1 savePatient1(@RequestBody Patient1 pat) {
	return prepository.save(pat);}

@PutMapping(value="/patient1s/{id}")
public ResponseEntity updatePatient1(@PathVariable(value="id")Long patId, @RequestBody Patient1 patdata) {
	
p1= prepository.findById(patId);
Patient1 p2=p1.get();
p2.setPatId(patdata.getPatId());
p2.setName(patdata.getName());
p2.setAge(patdata.getAge());
p2.setSex(patdata.getSex());
p2.setEmail(patdata.getEmail());
p2.setPhoneNumber(patdata.getPhoneNumber());
p2.setBloodGroup(patdata.getBloodGroup());

Patient1 updatePatient1 = prepository.save(p2);
return ResponseEntity.ok(updatePatient1);

}

@DeleteMapping(value="/patient1s/{id}")
public ResponseEntity deleteProduct(@PathVariable(value="id")Long patId) {
	prepository.deleteById(patId);
	return ResponseEntity.noContent().build();
}





}