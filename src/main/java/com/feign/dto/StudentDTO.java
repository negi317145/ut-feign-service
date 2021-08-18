package com.feign.dto;

public class StudentDTO {

    private int studentId;

    private String name;

    private String email;

    private String password;

    private int age;

    private String role;


    public StudentDTO(){
        super();
    }

    public StudentDTO(int studentId, String name, String email, String password, int age, String role) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.role = role;
    }

    public StudentDTO(String name, String email, String password, int age, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.role = role;
    }

    public StudentDTO(String email) {
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
