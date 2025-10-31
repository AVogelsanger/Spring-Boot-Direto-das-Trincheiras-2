package academy.devdojo.domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Anime {

    private Long id;
    private String name;

    public Anime(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Anime() { }

    public static List<Anime> getAnimes() {
        var Akira = new Anime(1L,"Akira");
        var SaintSeya = new Anime(2L,"Saint Seya");
        var Zilion = new Anime(3L,"Zilion");
        return List.of(Akira, SaintSeya, Zilion);
    }


    // public static List<String> ANIMES = List.of("Akira","Saint Seya", "Zilion");



}
