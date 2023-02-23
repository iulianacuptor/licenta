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
@Table(name= "Books")
public class Books {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idBook;
    private String bookName;
    private Integer rating;
    private String synopsis;
    private Integer pages;
    private String genre;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "book")
    private List<Review> reviews;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "bookImage")
    private List<Images> images;

    @ManyToOne
    @JoinColumn(name="idPublisher")
    private PublishingHouse publishingHouse;

    @ManyToOne
    @JoinColumn(name = "idSerie")
    private Series serie;

    @ManyToOne
    @JoinColumn(name="idUser")
    private User users;

    @ManyToMany(mappedBy = "booksList")
    private List<Authors> authorsList = new ArrayList<>();

    @Override
    public String toString() {
        return "Books{" +
                "idBook=" + idBook +
                ", bookName='" + bookName + '\'' +
                ", rating=" + rating +
                ", synopsis='" + synopsis + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return idBook.equals(books.idBook) && bookName.equals(books.bookName) && Objects.equals(rating, books.rating) && synopsis.equals(books.synopsis) && pages.equals(books.pages) && Objects.equals(genre, books.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBook, bookName, rating, synopsis, pages, genre);
    }
}
