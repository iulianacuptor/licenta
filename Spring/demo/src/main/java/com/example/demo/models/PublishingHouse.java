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
@Table(name= "PublishingHouse")
public class PublishingHouse {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idPublisher;
    private String publisherName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "publishingHouse")
    private List<Books> books;
}
