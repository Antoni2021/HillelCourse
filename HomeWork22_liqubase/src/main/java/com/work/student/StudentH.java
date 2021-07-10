package com.work.student;

import lombok.*;
import lombok.experimental.Accessors;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Getter
@Setter
@Accessors(chain = true)

public class StudentH {

    @Id
    @GeneratedValue
    private long id;
    private String full_name;
    private long group_number;
    private long year;
    private boolean deleted;

    @Override
    public String toString() {
        return "id: " + id +
                ", full name: " + full_name +
                ", group number: " + group_number +
                ", year: " + year;
    }
}
