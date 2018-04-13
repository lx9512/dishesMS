package com.dishesMS.model;

/**
 * Created by aa123 on 2018/2/25.
 */
public class Dishes {
    private int id;
    private String name;
    private float price;
    private int varietyId;
    private int acridity;
    private String photo;
    private DishesVariety dishesVariety;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAcridity() {
        return acridity;
    }

    public void setAcridity(int acridity) {
        this.acridity = acridity;
    }

    public DishesVariety getDishesVariety() {
        return dishesVariety;
    }

    public void setDishesVariety(DishesVariety dishesVariety) {
        this.dishesVariety = dishesVariety;
    }


    public String getPhotoPath() {
        return photo;
    }

    public void setPhotoPath(String photo) {
        this.photo = photo;
    }

    public int getVarietyId() {
        return varietyId;
    }

    public void setVarietyId(int varietyId) {
        this.varietyId = varietyId;
    }
}
