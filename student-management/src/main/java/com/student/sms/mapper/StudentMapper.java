package com.student.sms.mapper;

import com.student.sms.dto.StudentRequestDto;
import com.student.sms.dto.StudentResponseDto;
import com.student.sms.model.Student;

public class StudentMapper {

    public static Student toEntity(StudentRequestDto dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());
        student.setAge(dto.getAge());
        return student;
    }

    public static StudentResponseDto toDto(Student student) {
        StudentResponseDto dto = new StudentResponseDto();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        dto.setCourse(student.getCourse());
        dto.setAge(student.getAge());
        return dto;
    }
}
