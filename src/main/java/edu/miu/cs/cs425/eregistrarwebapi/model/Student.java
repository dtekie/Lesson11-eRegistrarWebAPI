package edu.miu.cs.cs425.eregistrarwebapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column(nullable = false, unique = true)
    @NotBlank(message = "Student Number is required")
    private String studentNumber;
    @NotBlank(message = "First Name is required and it should not be empty, null or blank")
    private String firstName;
    private String middleName;
    @NotBlank(message = "Last Name is required and it should not be empty, null or blank")
    private String lastName;
    private Double cgpa;
    @Column(nullable = false)
    private LocalDate enrollmentDate;
    private Boolean isInternational;
//    @JsonManagedReference
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "classroom_id", referencedColumnName = "classroomId")
//    private Classroom classroom;
}

