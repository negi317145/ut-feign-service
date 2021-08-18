package com.feign.service;

import com.feign.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="studentService", url="${studentService}")
public interface StudentService {

    @PostMapping("/register-student")
    public StudentDTO registerUser(StudentDTO studentDTO);


    @GetMapping("/getStudentByUsername/{username}")
    public StudentDTO getStudentByUsername(@PathVariable("username") String username);


}
