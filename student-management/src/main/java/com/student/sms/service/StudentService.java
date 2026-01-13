package com.student.sms.service;

//import com.student.sms.model.Student;

import com.student.sms.dto.StudentRequestDto;
import com.student.sms.dto.StudentResponseDto;

import java.util.List;

public interface StudentService {

    StudentResponseDto createStudent(StudentRequestDto dto);

    List<StudentResponseDto> getAllStudents();

    StudentResponseDto getStudentById(Long id);

    StudentResponseDto updateStudent(Long id, StudentRequestDto dto);

    void deleteStudent(Long id);
}
