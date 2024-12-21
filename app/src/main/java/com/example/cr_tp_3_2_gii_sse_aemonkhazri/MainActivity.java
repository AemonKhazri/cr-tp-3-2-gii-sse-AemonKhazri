package com.example.cr_tp_3_2_gii_sse_aemonkhazri;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.cr_tp_1_1_gii_sse_aemonkhazri.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecipeAdapter adapter;
    private List<Recipe> recipeList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recipeList  = new ArrayList<>();
        recipeList.add(new Recipe("Pasto", "The pasta served at the restaurant is made from perfectly cooked durum wheat semolina, with each strand of pasta cooked to al dente perfection. It is drenched in a smooth and velvety Alfredo sauce,", R.drawable.pasta,  "1. Pizza dough (flour, water, yeast, salt, olive oil)\n" +
                "2. Tomato sauce (tomatoes, garlic, olive oil, salt, oregano)\n" +
                "3. Mozzarella cheese\n" +
                "4. Fresh basil leaves\n" +
                "5. Pepperoni (sliced)\n" +
                "6. Oregano"));

        recipeList.add(new Recipe("Pizza", "The pizza at the restaurant features a golden, crispy crust topped with a rich, tangy tomato sauce and a generous layer of creamy mozzarella cheese. Fresh basil leaves are scattered across the pizza, adding a fragrant, herbal note", R.drawable.pizza,  "1. Durum wheat semolina (for the pasta)\n" +
                "2. Butter\n" +
                "3. Heavy cream\n" +
                "4. Parmesan cheese (freshly grated)\n" +
                "5. Garlic (optional)\n" +
                "6. Freshly ground black pepper\n" +
                "7. Salt"));
        adapter = new RecipeAdapter(recipeList, this::openRecipeDetails);
        recyclerView.setAdapter(adapter);
    }

  private void openRecipeDetails(Recipe recipe){
        Intent intent = new Intent(this, RecipeDetailsActivity.class);
      intent.putExtra("title", recipe.getTitle());
      intent.putExtra("imageResId", recipe.getImageResId());
      intent.putExtra("ingredients", recipe.getIngredients());
      startActivity(intent);
  }




}