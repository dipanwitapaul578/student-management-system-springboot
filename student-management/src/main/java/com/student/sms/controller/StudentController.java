package com.student.sms.controller;

import com.student.sms.dto.StudentRequestDto;
import com.student.sms.dto.StudentResponseDto;
import com.student.sms.model.Student;
import com.student.sms.service.StudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;


import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public ResponseEntity<StudentResponseDto> createStudent(@Valid @RequestBody StudentRequestDto dto) {
        return new ResponseEntity<>(studentService.createStudent(dto), HttpStatus.CREATED);
    }



    @GetMapping
    public List<StudentResponseDto> getAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping("/{id}")
    public StudentResponseDto getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }


    @PutMapping("/{id}")
    public StudentResponseDto updateStudent(
            @PathVariable Long id,
            @Valid @RequestBody StudentRequestDto dto) {

        return studentService.updateStudent(id, dto);
    }



    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
