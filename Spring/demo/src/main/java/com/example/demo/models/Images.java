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
@Table(name= "images")
public class Images {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idImage;
    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "idBook")
    private Books bookImage;
}
