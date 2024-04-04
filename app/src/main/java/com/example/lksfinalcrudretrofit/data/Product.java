package com.example.lksfinalcrudretrofit.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Class sebagai representasi Product, untuk format Product json
 * Example:
 * {
 *     "id": 4,
 *     "title": "Handmade Fresh Table",
 *     "price": 687,
 *     "description": "Andy shoes are designed to keeping in...",
 *     "category": {
 *         "id": 5,
 *         "name": "Others",
 *         "image": "https://placeimg.com/640/480/any?r=0.591926261873231"
 *     },
 *     "images": [
 *         "https://placeimg.com/640/480/any?r=0.9178516507833767",
 *         "https://placeimg.com/640/480/any?r=0.9300320592588625",
 *         "https://placeimg.com/640/480/any?r=0.8807778235430017"
 *     ]
 * }
 */
public class Product {
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("price")
    @Expose
    private int price;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("images")
    @Expose
    private ArrayList<String> images;

    public Product(int id, String title, int price, String description, ArrayList<String> images) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }
}
