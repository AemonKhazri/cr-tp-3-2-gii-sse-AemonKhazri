package com.example.cr_tp_3_2_gii_sse_aemonkhazri;

public class Recipe {
    private final String title;
    private final String description;
    private final int imageResId;
    private final String ingredients;

    public Recipe(String title, String description, int imageResId, String ingredients) {
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
        this.ingredients = ingredients;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getIngredients() {
        return ingredients;
    }
}
