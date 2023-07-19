package com.myapplicationdev.android.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView itemList;
    ArrayList<ToDoItem> alItemList;
    ArrayAdapter<ToDoItem> aaItemList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemList = findViewById(R.id.itemList);

        ToDoItem item1 = new ToDoItem("Go for movie", 1/8/2020);
        ToDoItem item2 = new ToDoItem("Go for haircut", 2/8/2020);

        alItemList.add(item1);
        alItemList.add(item2);

        aaItemList = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alItemList);

        adapter = new CustomAdapter(this, R.layout.row, alItemList);

        itemList.setAdapter(aaItemList);

        itemList.setAdapter(adapter);
    }
}