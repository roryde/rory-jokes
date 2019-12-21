package rory.springframework.roryjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeGenerator {
    private String joke;

    public String getJoke() {
        joke = new ChuckNorrisQuotes().getRandomQuote();
        return joke;
    }
}
