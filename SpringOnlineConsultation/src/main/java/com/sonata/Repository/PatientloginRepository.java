package com.sonata.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sonata.model.Patientlogin;



@Repository
public interface PatientloginRepository extends JpaRepository<Patientlogin, Long>{

	int updatePatientloginById(Long id, String password);
	

}