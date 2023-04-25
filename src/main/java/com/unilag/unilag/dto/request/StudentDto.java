package com.unilag.unilag.dto.request;

import com.unilag.unilag.model.StudentCardNumber;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private  int age;
private String studentCardNumber;


}
