package com.decify.swaggerapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Contact {
    private int id;
    private String name;
    private String phoneNumber;
}
