package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "authors")
public class Authors {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idAuthor;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name="multipleAuthors",
        joinColumns = @JoinColumn(name="idAuthor"),
        inverseJoinColumns = @JoinColumn(name="idBook")
    )
    private List<Books> booksList= new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authors authors = (Authors) o;
        return Objects.equals(idAuthor, authors.idAuthor) && firstName.equals(authors.firstName) && lastName.equals(authors.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAuthor, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Authors{" +
                "idAuthor=" + idAuthor +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
