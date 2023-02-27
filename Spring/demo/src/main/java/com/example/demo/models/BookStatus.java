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
@Table(name= "bookStatus")
public class BookStatus {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id Long idStatus;
    private String bookStatus;
    private Date startDate;
    private Date endDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "bookStatus")
    private List<Books> book;

    @Override
    public String toString() {
        return "BookStatus{" +
                "idStatus=" + idStatus +
                ", bookStatus='" + bookStatus + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", book=" + book +
                '}';
    }

}
