package com.smartbyte.edubookschedulerbackend.domain;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    Long id;
    Date dateAndTime;
    String description;
    Student student;
    Tutor tutor;
}