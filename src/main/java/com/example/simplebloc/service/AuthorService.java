package com.example.simplebloc.service;

import com.example.simplebloc.entity.Author;
import com.example.simplebloc.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {

     Author createAuthor(Author author);
     List<Author> findAll();

}

