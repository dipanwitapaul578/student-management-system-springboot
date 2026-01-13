package com.student.sms.dto;

import jakarta.validation.constraints.*;

public class StudentRequestDto {

    @NotBlank(message = "Name must not be empty")
    private String name;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email must not be empty")
    private String email;

    @NotBlank(message = "Course must not be empty")
    private String course;

    @Min(value = 1, message = "Age must be at least 1")
    @Max(value = 120, message = "Age must be less than 120")
    private int age;

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
