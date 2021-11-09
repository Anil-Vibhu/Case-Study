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



import com.sonata.model.Patientfeedback;
import com.sonata.Repository.PatientfeedbackRepository;



@RestController
public class PatientfeedbackController { 

Optional<Patientfeedback>p1;

@Autowired
private PatientfeedbackRepository prepository;

@GetMapping("/patientfeedbacks")
public List<Patientfeedback>getAllPatientfeedbacks(){
return prepository.findAll();}

@GetMapping("/patientfeedbacks/{id}")
public ResponseEntity getPatientfeedabckbyId(@PathVariable(value="id")Long feedbackId) {
	p1=prepository.findById(feedbackId);
	return ResponseEntity.ok().body(p1);}

@PostMapping(value = "/patientfeedbacks")
public Patientfeedback savePratientfeedback(@RequestBody Patientfeedback patfed) {
	return prepository.save(patfed);}

@PutMapping(value="/patientfeedbacks/{id}")
public ResponseEntity updatePatientfeedback(@PathVariable(value="id")Long feedbackId, @RequestBody Patientfeedback patfeddata) {
	
p1= prepository.findById(feedbackId);
Patientfeedback p2=p1.get();
p2.setFeedbackId(patfeddata.getFeedbackId());
p2.setDocId(patfeddata.getDocId());
p2.setPatId(patfeddata.getPatId());
p2.setFeedback(patfeddata.getFeedback());
p2.setDate(patfeddata.getDate());



Patientfeedback updatePatientfeedback = prepository.save(p2);
return ResponseEntity.ok(updatePatientfeedback);

}

@DeleteMapping(value="/patientfeedbacks/{id}")
public ResponseEntity deleteProduct(@PathVariable(value="id")Long feedbackId) {
	prepository.deleteById(feedbackId);
	return ResponseEntity.noContent().build();
}





}



