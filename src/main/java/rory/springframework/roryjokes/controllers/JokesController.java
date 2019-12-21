package rory.springframework.roryjokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rory.springframework.roryjokes.services.JokeGenerator;

@Controller
public class JokesController {
    private JokeGenerator jokeGenerator;

    public JokesController (JokeGenerator jokeGenerator) {
        this.jokeGenerator = jokeGenerator;
    }
    @RequestMapping("/")
    public String getJokes(Model model){
        model.addAttribute("joke", jokeGenerator.getJoke());
        return "joke";
    }



}

