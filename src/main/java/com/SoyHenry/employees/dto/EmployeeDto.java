package com.SoyHenry.employees.dto;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeDto {

    String name;
    String jobPosition;
    Date admissionDate;

}
