package com.example.demo.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class ReviewDTO {
    private Long idReview;
    private String reviewDescription;
    private Integer rating;
    private Date createAt;
}
