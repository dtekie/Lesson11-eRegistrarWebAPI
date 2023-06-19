//package edu.miu.cs.cs425.eregistrarwebapi.model;
//
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.List;
//
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Table(name = "classrooms")
//public class Classroom {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long classroomId;
//    private String buildingName;
//    private String classRoomNumber;
//
//    @OneToMany(mappedBy = "classroom")
//    @JsonBackReference
//    private List<Student> students;
//}
