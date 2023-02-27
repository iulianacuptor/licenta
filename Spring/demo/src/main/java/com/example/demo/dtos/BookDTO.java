package com.example.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDTO {
    private Long idBook;
    private String bookName;
    private Integer rating;
    private String synopsis;
    private Integer pages;
    private String genre;
}
