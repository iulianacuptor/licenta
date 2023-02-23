package com.example.demo.dtos;

import lombok.Data;
import lombok.Setter;

import java.util.Date;

@Setter
@Data
public class GetReviewResponse {
    private Long idReview;
    private String reviewDescription;
    private Integer rating;
    private Date createAt;

    private UserDTO user;
}
