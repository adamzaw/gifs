package pl.akademia.gifs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.akademia.gifs.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public interface GifRepository extends JpaRepository<Gif, Long> {

    Optional<Gif> findByName(String name);
    List<Gif> findAllByCategory(Long id);





//    public static List<Gif> getAllGifs() {
//        return ALL_GIFS;
//    }
//
//    public String getGifsNames() {
//        String result = "";
//        for (Gif gif : ALL_GIFS) {
//            result += gif.getName();
//        }
//        return result;
//    }
//
//    public List<Gif> getFavoriteGifs() {
//
//        return ALL_GIFS.stream().filter(gif -> gif.isFavorite()).collect(Collectors.toList());
//    }
//
//    public Gif getGifByName(String name) {
//
//        Gif result = null;
//
//        for (Gif gif : ALL_GIFS) {
//            if (gif.getName().equals(name)) {
//                result = gif;
//            }
//        }
//        return result;
//    }
//
//    public List<Gif> getGifByCategory(int id) {
//        return ALL_GIFS.stream().filter(g -> g.getCategory() == id).collect(Collectors.toList());
//    }
}
