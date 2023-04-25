package com.unilag.unilag.service;


import com.unilag.unilag.Repository.CardRepository;
import com.unilag.unilag.Repository.StudentRepository;
import com.unilag.unilag.dto.request.StudentDto;
import com.unilag.unilag.dto.response.StudentResponse;
import com.unilag.unilag.model.Student;
import com.unilag.unilag.model.StudentCardNumber;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Transactional
@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {
    private final StudentRepository studentRepository;
    private final CardRepository cardRepository;

    @Override
    public StudentResponse registerStudent(StudentDto studentDto) {
        Optional<Student> student = studentRepository.findByEmail(studentDto.getEmail());
        if (student.isPresent()) {
            return new StudentResponse("STUDENT ALREADY EXIST");
        }
        if (!studentDto.getEmail().contains("@")) {
            return new StudentResponse(" email mot correct");

        }

        Student student1 = new Student();
        student1.setFirstName(studentDto.getFirstName());
        student1.setLastName(studentDto.getLastName());
        student1.setEmail(studentDto.getEmail());
        student1.setAge(studentDto.getAge());


      StudentCardNumber cardNumber = new StudentCardNumber( );
       cardNumber.setCardNumber(studentDto.getStudentCardNumber());
       cardNumber.setStudent(student1);
        cardRepository.save(cardNumber);

        return new StudentResponse("REGISTRATION COMPLETE");
   }
@Override
    public StudentResponse findCard(String cardNo) {
        Optional<StudentCardNumber> cad = cardRepository.findByCardNumber(cardNo);
        if (cad.isPresent()) {
            cardRepository.findByCardNumber(cardNo);
            return new StudentResponse(" cad found");

        }
        return new StudentResponse(" card does not exizst");
   }
   @Override
public StudentResponse deleteByCardNumber(String cadNo){
        Optional<StudentCardNumber> number= cardRepository.deleteByCardNumber(cadNo);
        if(number.isPresent()){
            cardRepository.deleteByCardNumber(cadNo);
            return new StudentResponse(" student deleted");
        }
        return new StudentResponse(" card not found");
}


}