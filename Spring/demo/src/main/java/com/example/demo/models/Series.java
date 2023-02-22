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
@Table(name= "Series")
public class Series {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idSerie;
    private String serieName;


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "serie")
    private List<Books> books;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(idSerie, series.idSerie) && serieName.equals(series.serieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSerie, serieName);
    }

    @Override
    public String toString() {
        return "Series{" +
                "idSerie=" + idSerie +
                ", serieName='" + serieName + '\'' +
                '}';
    }
}
