package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PublishingHouse that = (PublishingHouse) o;
        return Objects.equals(idPublisher, that.idPublisher) && publisherName.equals(that.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPublisher, publisherName);
    }

    @Override
    public String toString() {
        return "PublishingHouse{" +
                "idPublisher=" + idPublisher +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }


}
