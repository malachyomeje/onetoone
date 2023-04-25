package com.unilag.unilag.model;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "StudentIdCard")
@Table(name = "studentCardNumber")
@ToString

public class StudentCardNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cardNumber;
    @OneToOne(cascade = CascadeType.ALL
            ,fetch = FetchType.EAGER)
    @JoinColumn(name = "studentId",
            referencedColumnName = "id")

    private Student student;

//    public StudentCardNumber(String cardNumber, Student student) {
//        this.cardNumber = cardNumber;
//        this.student = student;
//    }
}
