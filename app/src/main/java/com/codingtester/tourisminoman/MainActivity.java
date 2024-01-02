package com.codingtester.tourisminoman;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.codingtester.tourisminoman.category.CatAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.imgProfile);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PersonActivity.class));
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CatAdapter adapter = new CatAdapter(getAllCat());
        recyclerView.setAdapter(adapter);
    }

    public List<Category> getAllCat() {
        Category category = new Category(
                "Tourist Areas",
                R.drawable.national_museum
        );

        Category category2 = new Category(
                "Restaurants",
                R.drawable.slider
        );

        Category category3 = new Category(
                "Hotels",
                R.drawable.royaltulip
        );

        Category category4 = new Category(
                "City Transportation",
                R.drawable.buses
        );

        List<Category> list = new ArrayList<>();
        list.add(category);
        list.add(category2);
        list.add(category3);
        list.add(category4);
        return list;
    }

}