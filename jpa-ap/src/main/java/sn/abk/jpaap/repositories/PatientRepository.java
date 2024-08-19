package sn.abk.jpaap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sn.abk.jpaap.entities.Patient;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    public List<Patient> findByNameContainsIgnoreCase(String kw);
    @Query("select p from Patient p where p.name like %:kw% and p.is_ill=:bool")
    public List<Patient> search(@Param("kw") String kw, @Param("bool") boolean bool);

}
