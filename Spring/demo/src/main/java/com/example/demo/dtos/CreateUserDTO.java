package com.example.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateUserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String pass;
    private Long idRole;
}
