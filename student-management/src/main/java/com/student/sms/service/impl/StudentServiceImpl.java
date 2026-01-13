package com.student.sms.service.impl;

import com.student.sms.dto.StudentRequestDto;
import com.student.sms.dto.StudentResponseDto;
import com.student.sms.exception.ResourceNotFoundException;
import com.student.sms.mapper.StudentMapper;
import com.student.sms.model.Student;
import com.student.sms.repository.StudentRepository;
import com.student.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentResponseDto createStudent(StudentRequestDto dto) {
        Student student = StudentMapper.toEntity(dto);
        Student saved = studentRepository.save(student);
        return StudentMapper.toDto(saved);
    }

    @Override
    public List<StudentResponseDto> getAllStudents() {

        return studentRepository.findAll()
                .stream()
                .map(StudentMapper::toDto)
                .toList();
    }

    @Override
    public StudentResponseDto getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
        return StudentMapper.toDto(student);
    }

    @Override
    public StudentResponseDto updateStudent(Long id, StudentRequestDto dto) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id" + id));

        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());
        student.setAge(dto.getAge());

        return StudentMapper.toDto(studentRepository.save(student));
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Student not found with id: " + id));

        studentRepository.delete(student);
    }
}
