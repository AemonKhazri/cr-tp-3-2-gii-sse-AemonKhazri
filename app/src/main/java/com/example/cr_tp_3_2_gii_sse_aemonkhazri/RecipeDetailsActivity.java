package com.example.cr_tp_3_2_gii_sse_aemonkhazri;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.cr_tp_1_1_gii_sse_aemonkhazri.R;


public class RecipeDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);

        TextView titleTextView = findViewById(R.id.recipeTitleDetails);
        ImageView imageView = findViewById(R.id.recipeImageDetails);
        TextView ingredientsTextView = findViewById(R.id.recipeIngredientsDetails);

        // Get the recipe details passed from MainActivity
        String title = getIntent().getStringExtra("title");
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        String ingredients = getIntent().getStringExtra("ingredients");

        // Populate the views with the recipe details
        titleTextView.setText(title);
        imageView.setImageResource(imageResId);
        ingredientsTextView.setText(ingredients);
    }
}
