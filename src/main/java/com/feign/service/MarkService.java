package com.feign.service;

import com.feign.dto.MarkDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@FeignClient(name="markService" , url="${markService}")
public interface MarkService {

    @PostMapping("/add-mark")
    MarkDTO addMark( MarkDTO markDTO);

    @GetMapping("/get-mark/{studentId}")
    List<MarkDTO> getMark(@PathVariable(name = "studentId") int studentId);


}
