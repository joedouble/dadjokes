package com.detroitlabs.dadjoke.service;

import com.detroitlabs.dadjoke.model.Joke;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class JokeService {

    public Joke fetchJoke(){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "spring");

        HttpEntity entity = new HttpEntity(headers);
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Joke> response = restTemplate.exchange("https://icanhazdadjoke.com/", HttpMethod.GET, entity, Joke.class);
        return response.getBody();
    }

}
