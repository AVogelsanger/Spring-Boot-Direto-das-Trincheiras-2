package academy.devdojo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Anime {

    private Long id;
    private String name;
    private static List<Anime> animes = new ArrayList<>();

    static {
        var Akira = new Anime(1L,"Akira");
        var SaintSeya = new Anime(2L,"Saint Seya");
        var Zilion = new Anime(3L,"Zilion");
        animes.addAll(List.of(Akira, SaintSeya, Zilion));
    }

    public static List<Anime> getAnimes() {
        return animes;
    }
}
