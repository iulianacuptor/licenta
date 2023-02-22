package com.example.demo.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "Review")
public class Review {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idReview;
    private String reviewDescription;
    private Integer rating;
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name="idUser")
    private Users user;

    @ManyToOne
    @JoinColumn(name="idBook")
    private Books book;
}
