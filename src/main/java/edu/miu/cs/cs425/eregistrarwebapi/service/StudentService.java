package edu.miu.cs.cs425.eregistrarwebapi.service;



import edu.miu.cs.cs425.eregistrarwebapi.model.Student;

import java.util.List;

public interface StudentService {
    Student addNewStudent(Student student);
    Student getStudentById(Long studentId);
    Student updateStudent(Long studentId, Student student);
    void deleteStudentById(Long studentId);
    List<Student> getAllStudents();
//    List<Student> getStudentsByGpa( double cgpa);

}



