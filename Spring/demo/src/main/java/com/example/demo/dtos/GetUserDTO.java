package com.example.demo.dtos;

import lombok.Data;
import lombok.Setter;

@Setter
@Data
public class GetUserDTO {
    private Long idUser;
    private String firstName;
    private String lastName;
    private String email;
}
