package com.hfad.starbuzzzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceID;

    //drinks is array of drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple o fespresso shots with steamed milk", R.drawable.latte),
            new Drink("Capuccino", "Espresso, hot milk, and steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)

    };

    //each Drink has  a name, description, and an image resource
    private Drink(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceID(){
        return imageResourceID;
    }

    public String toString(){
        return this.name;
    }
}
