package com.example.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
    private Long idUser;
    private String firstName;
    private String lastName;
    private String email;
}
