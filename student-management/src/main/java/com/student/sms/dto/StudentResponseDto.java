package com.student.sms.dto;

public class StudentResponseDto {

    private Long id;
    private String name;
    private String email;
    private String course;
    private int age;

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // ✅ Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ✅ Getter and Setter for email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // ✅ Getter and Setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // ✅ Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

