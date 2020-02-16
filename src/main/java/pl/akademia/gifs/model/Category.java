package pl.akademia.gifs.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Category {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;


}
