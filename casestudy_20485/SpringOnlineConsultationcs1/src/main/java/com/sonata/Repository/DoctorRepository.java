package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sonata.Model.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

	@Modifying
	@Transactional
	@Query(value = "UPDATE doctor SET dr_name = :name, phone_number=:pNumber, specialization=:spec  WHERE drid = :id", nativeQuery = true)
	int updateDeails(Long id, String name, String pNumber, String spec);
	
	Doctor findByeMail(String eMail);
}