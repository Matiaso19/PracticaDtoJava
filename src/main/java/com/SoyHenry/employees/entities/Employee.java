package com.SoyHenry.employees.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {

    //'id', 'name', 'position',

     Long id;
     String name;
     String jobPosition;
     Date admissionDate;


}
