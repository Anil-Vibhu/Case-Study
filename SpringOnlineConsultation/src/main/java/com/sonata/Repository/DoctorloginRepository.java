package com.sonata.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sonata.model.Doctorlogin;



@Repository
public interface DoctorloginRepository extends JpaRepository<Doctorlogin, Long>{



}