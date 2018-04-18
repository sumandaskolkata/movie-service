package com.movie.deatils.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieDetails {
    @RequestMapping("/")
    public String getDetails () {
        return "First movie";
    }
}
