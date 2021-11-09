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



import com.sonata.model.Prescription;
import com.sonata.Repository.PrescriptionRepository;



@RestController
public class PrescriptionController {

Optional<Prescription>p1;

@Autowired
private PrescriptionRepository prepository;

@GetMapping("/prescriptions")
public List<Prescription>getAllPrescriptions(){
return prepository.findAll();}

@GetMapping("/prescriptions/{id}")
public ResponseEntity getPrescriptionbyId(@PathVariable(value="id")Long slotId) {
	p1=prepository.findById(slotId);
	return ResponseEntity.ok().body(p1);}

@PostMapping(value = "/prescriptions")
public Prescription savePrescription(@RequestBody Prescription presc) {
	return prepository.save(presc);}

@PutMapping(value="/prescriptions/{id}")
public ResponseEntity updatePrescription(@PathVariable(value="id")Long slotId, @RequestBody Prescription prescdata) {
	
p1= prepository.findById(slotId);
Prescription p2=p1.get();
p2.setSlotId(prescdata.getSlotId());
p2.setPrescription(prescdata.getPrescription());


Prescription updatePrescription = prepository.save(p2);
return ResponseEntity.ok(updatePrescription);

}

@DeleteMapping(value="/Prescriptions/{id}")
public ResponseEntity deletePrescription(@PathVariable(value="id")Long slotId) {
	prepository.deleteById(slotId);
	return ResponseEntity.noContent().build();
}




}
