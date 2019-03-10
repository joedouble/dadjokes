package com.detroitlabs.dadjoke.controller;

import com.detroitlabs.dadjoke.model.Joke;
import com.detroitlabs.dadjoke.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @ResponseBody
    @RequestMapping("/")
    public String displayJoke(){
        Joke joke = jokeService.fetchJoke();
        return joke.getJoke();
    }
}
