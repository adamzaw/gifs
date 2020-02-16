package pl.akademia.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademia.gifs.repository.GifRepository;


@Controller
public class MainController {

    @Autowired
    GifRepository gifRepository;

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return gifRepository.getAllGifs().toString();
    }

    @GetMapping("/showgifsinbrowser")
    @ResponseBody
    public String showGifNames(){
        return gifRepository.getGifsNames();
    }

}
