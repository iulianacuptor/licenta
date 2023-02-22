package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "Authors")
public class Authors {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idAuthor;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name="MultipleAuthors",
        joinColumns = @JoinColumn(name="idAuthor"),
        inverseJoinColumns = @JoinColumn(name="idBook")
    )
    private List<Books> booksList= new ArrayList<>();
}
