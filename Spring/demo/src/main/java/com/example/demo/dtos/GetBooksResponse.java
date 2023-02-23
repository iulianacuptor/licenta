package com.example.demo.dtos;

import lombok.Data;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Data
public class GetBooksResponse {
    private Long idBook;
    private String bookName;
    private Integer rating;
    private String synopsis;
    private Integer pages;
    private String genre;

    private UserDTO user;
    private PublishingHouseDTO publishingHouse;
    private SeriesDTO series;
    private List<ImageDTO> images;
    private List<AuthorsDTO> authors; //!!!!
    private List<ReviewDTO> reviews;

    public GetBooksResponse(){
        images= new ArrayList<>();
        authors=new ArrayList<>();
        reviews=new ArrayList<>();
    }
}
