package edu.miu.cs.cs425.eregistrarwebapi.repository;


import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
//    @Query("SELECT s FROM Student s WHERE s.cgpa >= :cgpa")
//    List<Student> getAllStudentsWithGpaGreaterThan(@PathVariable("cgpa") Double cgpa);
//List<Student> getALLByCgpaGreaterThanOrCgpaEquals(@PathVariable("cgpa") Double cgpa);

}
