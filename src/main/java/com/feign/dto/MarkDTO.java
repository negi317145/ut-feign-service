package com.feign.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class MarkDTO {

    private int markId;

    private String subject;

    private int mark;

    private int studentId;



}
