package pl.akademia.gifs.repository;

import org.springframework.stereotype.Repository;
import pl.akademia.gifs.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class GifRepository {

    private static List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion","main",true,1),
            new Gif("ben-and-mike","baks",true,2),
            new Gif("book-dominos","mika",true,6),
            new Gif("compiler-bot","bot",true,2),
            new Gif("cowboy-coder","cage",true,1),
            new Gif("infinite-andrew","ecopower",false,5)
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

    public List<Gif> getFavoriteGifs(){

        return ALL_GIFS.stream().filter(gif -> gif.isFavorite()).collect(Collectors.toList());
    }
}
