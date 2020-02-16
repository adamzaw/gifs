package pl.akademia.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademia.gifs.model.Category;
import pl.akademia.gifs.model.Gif;
import pl.akademia.gifs.repository.CategoryRepository;
import pl.akademia.gifs.repository.GifRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @GetMapping("categories")
    public String allCategories(ModelMap modelMap){

        List<Category> categoryList = categoryRepository.getAllCategories();

        modelMap.put("categories",categoryList);

        return "categories";
    }

    @GetMapping("category/{id}")
    public String showInCategory(@PathVariable int id, ModelMap modelMap){

        Category category = categoryRepository.getCategoriesById(id);

        List<Gif> gifList = gifRepository.findAll();
        List<Gif> gifById = new ArrayList<>();
        for (Gif gif : gifList) {
            if (gif.getId() == id){
                gifById.add(gif);
            }
        }



        modelMap.put("category",category);
        modelMap.put("gifs",gifById);


        return "category";
    };




}
