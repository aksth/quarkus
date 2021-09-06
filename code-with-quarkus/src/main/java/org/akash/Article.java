package org.akash;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Article {
    private Long id;
    private String description;
    private Double price;

    public Article(Long id, String description, Double price){
        this.id = id;
        this.description = description;
        this.price = price;
    }
}
