package com.example.cardapio.food;

import jakarta.persistence.*;

@Table(name = "foods")
@Entity(name = "foods")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();
    }
    
    public Food() {
    }
    
    public Food(String title, String image, Integer price) {
        this.title = title;
        this.image = image;
        this.price = price;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getImage() {
        return image;
    }
    
    public Integer getPrice() {
        return price;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
}