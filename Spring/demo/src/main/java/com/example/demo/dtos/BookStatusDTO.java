package com.example.demo.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class BookStatusDTO {
    private Long idStatus;
    private String bookStatus;
    private Date startDate;
    private Date endDate;
}
