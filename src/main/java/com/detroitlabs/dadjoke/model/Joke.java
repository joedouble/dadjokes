package com.detroitlabs.dadjoke.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Array;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Joke {

    private String joke;
    private String question;
    private String answer;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void splitString(){
        String[] arrOfStr;

        if(joke.contains("?")) {
            arrOfStr = joke.split("\\?", 2);
            this.question = arrOfStr[0] + "?";
            this.answer = arrOfStr[1];
        } else {
            this.question = joke;
        }
    }
}
