package com.unilag.unilag.service;

import com.unilag.unilag.dto.request.StudentDto;
import com.unilag.unilag.dto.response.StudentResponse;

public interface StudentService {
    StudentResponse registerStudent(StudentDto studentDto);

    StudentResponse findCard(String cardNo);


    StudentResponse deleteByCardNumber(String cadNo);
}
