package pl.akademia.gifs.repository;

import org.springframework.stereotype.Repository;
import pl.akademia.gifs.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion","main",true,1),
            new Gif("coyote","baks",true,2),
            new Gif("stranger-things","mika",true,6),
            new Gif("arni-is-beck","bot",true,2),
            new Gif("sixty-seconds","cage",true,1),
            new Gif("greta-shout","ecopower",true,5)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public String getGifsNames() {
        String result = "";
        for (Gif gif : ALL_GIFS) {
            result += gif.getName();
        }
        return result;
    }
}
