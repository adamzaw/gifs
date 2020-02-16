package pl.akademia.gifs.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Gif {

    private String name;
    private String username;
    private boolean favorite;
    private int category;


}
