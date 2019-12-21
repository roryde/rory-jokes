package rory.springframework.roryjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeGeneratorImpl implements JokeGenerator {
    private String joke;

    @Override
    public String getJoke() {
        joke = new ChuckNorrisQuotes().getRandomQuote();
        return joke;
    }
}
