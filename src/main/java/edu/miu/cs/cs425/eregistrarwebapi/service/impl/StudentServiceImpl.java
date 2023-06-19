package edu.miu.cs.cs425.eregistrarwebapi.service.impl;


import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.eregistrarwebapi.repository.StudentRepository;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
//    @Autowired
    final private StudentRepository studentRepository;
    @Override
    public Student addNewStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

//    @Override
//    public List<Student> getStudentsByGpa(double cgpa) {
//        return studentRepository.getALLByCgpaGreaterThanOrCgpaEquals(cgpa);
//    }


    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }


    public Student updateStudent(Long studentId, Student student) {
        var existingStudent = studentRepository.findById(studentId).orElse(null);
        if (existingStudent == null) {
            throw new IllegalArgumentException("student with id " + studentId + " does not exist");
        }
        existingStudent.setStudentNumber(student.getStudentNumber());
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setMiddleName(student.getMiddleName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setCgpa(student.getCgpa());
        existingStudent.setEnrollmentDate(student.getEnrollmentDate());
        existingStudent.setIsInternational(student.getIsInternational());
        return studentRepository.save(existingStudent);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        var existingStudent = studentRepository.findById(studentId).orElse(null);
        if (existingStudent == null) {
            throw new IllegalArgumentException("student with id " + studentId + " does not exist");
        }
        studentRepository.deleteById(studentId);
    }
}
