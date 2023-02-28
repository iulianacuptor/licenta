package com.example.demo.service;

import com.example.demo.repository.BooksRepository;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private UsersRepository usersRepository;
}
