package sn.abk.jpaap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.abk.jpaap.entities.Patient;
import sn.abk.jpaap.repositories.PatientRepository;

import java.util.List;

@SpringBootApplication
public class JpaApApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaApApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Amadou", true, 7));
        patientRepository.save(new Patient(null, "Sidi", false, 2));
        patientRepository.save(new Patient(null, "Binta", true, 9));
        patientRepository.save(new Patient(null, "Fatou", false, 1));

        List<Patient> patients = patientRepository.search("a", true);
        patients.forEach(patient -> {
            System.out.println(patient.getName());
            System.out.println(patient.getIs_ill());
            System.out.println(patient.getScore());
            System.out.println("------------------------");
        });

    }
}
