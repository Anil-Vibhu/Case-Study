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



import com.sonata.model.Disease;
import com.sonata.Repository.DiseaseRepository;



@RestController
public class DiseaseController {

Optional<Disease>p1;

@Autowired
private DiseaseRepository prepository;

@GetMapping("/diseases")
public List<Disease>getAllDiseases(){
return prepository.findAll();}

@GetMapping("/diseases/{id}")
public ResponseEntity getDiseasebyId(@PathVariable(value="id")Long disId) {
	p1=prepository.findById(disId);
	return ResponseEntity.ok().body(p1);}

@PostMapping(value = "/diseases")
public Disease saveDisease(@RequestBody Disease dis) {
	return prepository.save(dis);}

@PutMapping(value="/diseases/{id}")
public ResponseEntity updateDisease(@PathVariable(value="id")Long disId, @RequestBody Disease disdata) {
	
p1= prepository.findById(disId);
Disease p2=p1.get();
p2.setDisId(disdata.getDisId());
p2.setDisName(disdata.getDisName());


Disease updateDisease = prepository.save(p2);
return ResponseEntity.ok(updateDisease);

}

@DeleteMapping(value="/diseases/{id}")
public ResponseEntity deleteDisease(@PathVariable(value="id")Long disId) {
	prepository.deleteById(disId);
	return ResponseEntity.noContent().build();
}




}