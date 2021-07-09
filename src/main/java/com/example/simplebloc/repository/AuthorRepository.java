package com.example.simplebloc.repository;

import com.example.simplebloc.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  AuthorRepository extends JpaRepository<Author,Integer> {
}
