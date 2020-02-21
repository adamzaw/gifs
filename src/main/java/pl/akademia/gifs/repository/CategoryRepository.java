package pl.akademia.gifs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.akademia.gifs.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category getOne(Long id);

//    private static List<Category> ALL_CATEGORIES = Arrays.asList(
//
//            new Category(1,"funny"),
//            new Category(2,"sport"),
//            new Category(3,"it")
//            );
//
//    public List<Category> getAllCategories() {
//        return ALL_CATEGORIES;
//    }
//
//    public Category getCategoriesById(int id) {
//        for (Category category : ALL_CATEGORIES) {
//            if (category.getId() == id){
//                return category;
//            }
//        }
//
//        return null;
//    }
}
