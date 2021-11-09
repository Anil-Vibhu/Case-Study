package com.sonata.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sonata.model.Patientfeedback;



@Repository
public interface PatientfeedbackRepository extends JpaRepository<Patientfeedback, Long>{



}