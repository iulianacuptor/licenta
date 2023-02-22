package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "Users")
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  @Id Long idUser;
    private String firstName;
    private String lastName;
    private String email;
    private String pass;

    @ManyToOne
    @JoinColumn(name="idRole")
    private Roles role;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Review> reviews;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "users")
    private List<Books> books;


    @Override
    public String toString() {
        return "Users{" +
                "idUser=" + idUser +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
