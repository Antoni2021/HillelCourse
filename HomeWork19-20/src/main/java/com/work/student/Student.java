package com.work.student;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private int id;
    private String full_name;
    private int group_number;
    private int year;

}
