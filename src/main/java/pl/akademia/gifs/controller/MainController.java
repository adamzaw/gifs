package pl.akademia.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademia.gifs.model.Gif;
import pl.akademia.gifs.repository.GifRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class MainController {



    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")
    public String hello(@RequestParam(value = "q", required = false) String q, ModelMap modelMap) {
        //1. wyciagniecie gifów
        List<Gif> gifList = gifRepository.findAll();
        if (q == null ){
            modelMap.put("gifs", gifList);
        } else {
            List<Gif> gifListByName = new ArrayList<>();
            for (Gif gif : gifList) {
                if (gif.getName().contains(q)){
                    gifListByName.add(gif);
                }
            }
            modelMap.put("gifs", gifListByName);
        }

        //2. przekazanie do viev
        //modelMap.put("gifs", gifList);

        //3. zwracanie widoku
        return "home";
    }


    @GetMapping("favorites")
    public String favoritesGifs(ModelMap modelMap) {
        //1. wyciagnięcie wartości
        List<Gif> allGifs = gifRepository.findAll();
        List<Gif> gifListFavorites = new ArrayList<>();
        for (Gif gif : allGifs) {
            if (gif.isFavorite()){
                gifListFavorites.add(gif);
            }
        }
        //2. przekazanie do view
        modelMap.put("gifs", gifListFavorites);
        //3. Zwracanie widoku
        return "favorites";
    }

    @GetMapping("gif/{name}")
    public String showGif(ModelMap modelMap, @PathVariable String name) {

        Optional<Gif> gifDetail = gifRepository.findByName(name);

        if (gifDetail.isPresent()) {
            modelMap.put("gif", gifDetail.get());
        }
        return "gif-details";
    }



}
