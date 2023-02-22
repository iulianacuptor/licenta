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
@Table(name= "Series")
public class Series {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idSerie;
    private String serieName;


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "serie")
    private List<Books> books;
}
