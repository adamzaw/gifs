package pl.akademia.gifs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.akademia.gifs.model.Category;
import pl.akademia.gifs.model.Gif;
import pl.akademia.gifs.repository.CategoryRepository;
import pl.akademia.gifs.repository.GifRepository;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class GifsApplication implements CommandLineRunner {

    @Autowired
    GifRepository gifRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(GifsApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        gifRepository.save(new Gif("android-explosion", "main", true, 1));
        gifRepository.save(new Gif("ben-and-mike", "baks", true, 2));
        gifRepository.save(new Gif("book-dominos", "mika", true, 3));
        gifRepository.save(new Gif("compiler-bot", "bot", true, 2));
        gifRepository.save(new Gif("cowboy-coder", "cage", true, 1));
        gifRepository.save(new Gif("infinite-andrew", "ecopower", false, 3));
        categoryRepository.save(new Category("funny"));
        categoryRepository.save(new Category("sport"));
        categoryRepository.save(new Category("it"));

    }
}

