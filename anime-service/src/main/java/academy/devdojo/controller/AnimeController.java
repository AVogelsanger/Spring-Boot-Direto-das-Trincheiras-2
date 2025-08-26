package academy.devdojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("animes")
public class AnimeController {

    @GetMapping
    public List<String> animesList() {
        List<String> database = new ArrayList<>() {{
            add("Seya");
            add("Mickey Mouse");
            add("Shogun");
            add("Akira");
            add("Benimaru");
        }};
        return database;
    }
}
