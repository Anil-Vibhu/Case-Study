package com.sonata.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sonata.model.Patient1;



@Repository
public interface Patient1Repository extends JpaRepository<Patient1, Long>{



}