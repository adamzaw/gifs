package pl.akademia.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademia.gifs.model.Gif;
import pl.akademia.gifs.repository.GifRepository;

import java.util.List;


@Controller
public class MainController {

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")
    public String hello(ModelMap modelMap){
        //1. wyciagniecie gifów
        List<Gif> gifList = gifRepository.getAllGifs();
        //2. przekazanie do viev
        modelMap.put("gifs",gifList);
        //3. zwracanie widoku
        return "home";
    }

    @GetMapping("/showgifsinbrowser")
    @ResponseBody
    public String showGifNames(){
        return gifRepository.getGifsNames();
    }

    @GetMapping("favorites")
    public String favoritesGifs(ModelMap modelMap){
        //1. wyciagnięcie wartości
        List<Gif> gifListFavorites = gifRepository.getFavoriteGifs();
        //2. przekazanie do view
        modelMap.put("gifs",gifListFavorites);
        //3. Zwracanie widoku
        return "favorites";
    }

}
