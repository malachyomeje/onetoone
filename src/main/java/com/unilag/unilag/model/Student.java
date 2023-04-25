package com.unilag.unilag.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Student")
@Table(name = "student")
@ToString
public class Student {
    @Id
@GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private  int age;
    @OneToOne(mappedBy = "student",
            orphanRemoval = true)
    @JoinColumn( name = "student id",
    referencedColumnName = "id",foreignKey = @ForeignKey(name ="student fk"))
private StudentCardNumber studentCardNumber;
}
