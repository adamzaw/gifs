package pl.akademia.gifs.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Gif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String username;
    private boolean favorite;
    private int category;

    public Gif(String name, String username, boolean favorite, int category) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
        this.category = category;
    }
}
