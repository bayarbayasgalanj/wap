package model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();

        // Add logic based on beer color to get recommendations
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("light")) {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        } else if (color.equals("brown")) {
            brands.add("Brown Bear Beer");
            brands.add("Bock Brown");
        } else {
            brands.add("Dark Horse");
            brands.add("Black Magic");
        }

        return brands;
    }
}
