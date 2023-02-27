package com.example.demo.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "review")
public class Review {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idReview;
    private String reviewDescription;
    private Integer rating;
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name="idUser")
    private User user;

    @ManyToOne
    @JoinColumn(name="idBook")
    private Books book;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(idReview, review.idReview) && reviewDescription.equals(review.reviewDescription) && rating.equals(review.rating) && createdAt.equals(review.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReview, reviewDescription, rating, createdAt);
    }

    @Override
    public String toString() {
        return "Review{" +
                "idReview=" + idReview +
                ", reviewDescription='" + reviewDescription + '\'' +
                ", rating=" + rating +
                ", createdAt=" + createdAt +
                '}';
    }
}
