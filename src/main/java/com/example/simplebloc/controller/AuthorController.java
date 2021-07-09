package com.example.simplebloc.controller;

import com.example.simplebloc.entity.Author;
import com.example.simplebloc.service.AuthorService;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/author")
    public String create(Model model) {
        //first phase
        model.addAttribute("author", new Author());
        return "admin/authorForm";
    }

    @PostMapping("/author")
    public String process(@Valid Author author, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "admin/authorForm";
        }
        authorService.createAuthor(author);
        return "redirect:/authors";
    }

    @GetMapping("/authors")
    public String showAllAuthor(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "admin/authors";
    }

    @GetMapping("/layout")
    public String testLaoyut() {
        return "admin/layout/adminlayout";
    }
}
