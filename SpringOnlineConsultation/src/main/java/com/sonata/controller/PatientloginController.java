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



import com.sonata.model.Patientlogin;
import com.sonata.Repository.PatientloginRepository;



@RestController
public class PatientloginController {


Optional<Patientlogin>p1;

@Autowired
private PatientloginRepository prepository;

@GetMapping("/patientlogins")
public List<Patientlogin>getAllPatientlogins(){
return prepository.findAll();}

@GetMapping("/patientlogins/{id}")
public ResponseEntity getPatientloginbyId(@PathVariable(value="id")Long patId) {
	p1=prepository.findById(patId);
	return ResponseEntity.ok().body(p1);}

/*@PostMapping(value = "/Patientlogins")
public Patientlogin savePatientlogin(@RequestBody Patientlogin patlog) {
	return prepository.save(patlog);}*/

@PutMapping(value="/patientlogins/{id}")
public ResponseEntity updatePatientlogin(@PathVariable(value="id")Long patId, @RequestBody Patientlogin patlogdata) {
	
p1= prepository.findById(patId);
Patientlogin p2=p1.get();
p2.setPatId(patlogdata.getPatId());
p2.setPassword(patlogdata.getPassword());


Patientlogin updatePatientlogin = prepository.save(p2);
return ResponseEntity.ok(updatePatientlogin);

}

/*@DeleteMapping(value="/patientlogins/{id}")
public ResponseEntity deletePatientlogin(@PathVariable(value="id")Long patId) {
	prepository.deleteById(patId);
	return ResponseEntity.noContent().build();*/
}

