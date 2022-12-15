package com.example.gestiondelistes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=(ListView)findViewById(R.id.listView);

        Article myObject = new Article(1, "Pan", 11);
        Article myObject2 = new Article(2, "Sucre", 22);
        Article myObject3 = new Article(3, "Cafe", 33);
        Article myObject4 = new Article(4, "Thé", 44);
        Article myObject5 = new Article(5, "Huile", 55);
        Article myObject6 = new Article(6, "Farine", 66);
        List articles =new ArrayList<>();
        articles.add(myObject);
        articles.add(myObject2);
        articles.add(myObject3);
        articles.add(myObject4);
        articles.add(myObject5);
        articles.add(myObject6);
        ArrayAdapter<Article>arrayAdapter =
                new ArrayAdapter<Article>(this, android.R.layout.simple_list_item_1,articles);
listview.setAdapter(arrayAdapter);







}}