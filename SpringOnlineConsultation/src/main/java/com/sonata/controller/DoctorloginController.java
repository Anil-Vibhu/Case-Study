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



import com.sonata.model.Doctorlogin;
import com.sonata.Repository.DoctorloginRepository;



@RestController
public class DoctorloginController {


Optional<Doctorlogin>p1;

@Autowired
private DoctorloginRepository prepository;

@GetMapping("/doctorlogins")
public List<Doctorlogin>getAllDoctorlogins(){
return prepository.findAll();}

@GetMapping("/doctorlogins/{id}")
public ResponseEntity getDoctorloginbyId(@PathVariable(value="id")Long docId) {
	p1=prepository.findById(docId);
	return ResponseEntity.ok().body(p1);}

/*@PostMapping(value = "/doctorlogins")
public Doctorlogin saveDoctorlogin(@RequestBody Doctorlogin doclog) {
	return prepository.save(doclog);}*/

@PutMapping(value="/doctorlogins/{id}")
public ResponseEntity updateDoctorlogin(@PathVariable(value="id")Long docId, @RequestBody Doctorlogin doclogdata) {
	
p1= prepository.findById(docId);
Doctorlogin p2=p1.get();
p2.setDocId(doclogdata.getDocId());
p2.setPassword(doclogdata.getPassword());


Doctorlogin updateDoctorlogin = prepository.save(p2);
return ResponseEntity.ok(updateDoctorlogin);

}

/*@DeleteMapping(value="/doctorlogins/{id}")
public ResponseEntity deleteDoctorlogin(@PathVariable(value="id")Long docId) {
	prepository.deleteById(docId);
	return ResponseEntity.noContent().build();*/
}








