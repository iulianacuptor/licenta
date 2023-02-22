package com.example.demo.repository;

import com.example.demo.models.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorsRepository extends JpaRepository<Authors, Long> {
}
