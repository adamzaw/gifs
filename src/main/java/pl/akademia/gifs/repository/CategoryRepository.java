package pl.akademia.gifs.repository;

import org.springframework.stereotype.Repository;
import pl.akademia.gifs.model.Category;

import java.util.Arrays;
import java.util.List;

@Repository
public class CategoryRepository {

    private static List<Category> ALL_CATEGORIES = Arrays.asList(

            new Category(1,"funny"),
            new Category(2,"sport"),
            new Category(3,"it")
            );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
}
