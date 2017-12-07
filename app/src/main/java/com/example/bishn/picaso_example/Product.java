package com.example.bishn.picaso_example;

/**
 * Created by bishn on 12/6/2017.
 */

public class Product {
    private String image;
    private String name;
    private String price;

    public Product(String image, String name, String price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
