package edu.miu.cs.cs425.eregistrarwebapi.controller;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/eregistrar/api/student")
public class StudentController {

    final private StudentService studentService;

    @GetMapping(value = "/list")
    public ResponseEntity<List<Student>> AllStudents(){

        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    };

     @PostMapping(value = "/register")
      public ResponseEntity<Student> addNewStudent(@RequestBody Student student){
       return ResponseEntity.ok(studentService.addNewStudent(student));
};
//    @GetMapping(value = "/{gpa}")
//    public ResponseEntity<List<Student>> getStudentByGpa(@PathVariable double gpa) {
//        return new ResponseEntity<>(studentService.getStudentsByGpa(gpa), HttpStatus.OK);
//    };
    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return new ResponseEntity<>(studentService.getStudentById(id), HttpStatus.OK);
    };
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return new ResponseEntity<>(studentService.updateStudent(id, student), HttpStatus.OK);
    };
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    };
}

