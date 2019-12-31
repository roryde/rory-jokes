package rory.springframework.roryjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeGeneratorImpl implements JokeGenerator {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeGeneratorImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();

    }
}
