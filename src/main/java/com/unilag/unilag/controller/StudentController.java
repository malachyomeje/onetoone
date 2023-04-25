package com.unilag.unilag.controller;

import com.unilag.unilag.dto.request.StudentDto;
import com.unilag.unilag.dto.response.StudentResponse;
import com.unilag.unilag.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Lag")

public class StudentController {

private final StudentService studentService;
@PostMapping("/registerStudent")
public StudentResponse registerStudent(@RequestBody StudentDto studentDto){
   return studentService.registerStudent(studentDto);
}
@GetMapping("/found")
public StudentResponse find ( @RequestParam String cardNo){
  return studentService.findCard(cardNo);
}
@DeleteMapping("/delete")
   public StudentResponse deleteByCardNumber(@RequestParam String cadNo){
   return studentService.deleteByCardNumber(cadNo);
   }
}
