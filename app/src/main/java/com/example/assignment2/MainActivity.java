package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String PREF_NAME = "georgePref";
    private static final String KEY_OBJECTS = "countries";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Country> items = getArrayList(this);
        if(items == null){
            items = new ArrayList<>();
            //add the objects if there isn't any data
            items.add(new Country("Algeria",R.drawable.algeria,"Algeria", "Egypt", "Iraq", "Jordan"));
            items.add(new Country("Egypt", R.drawable.egypt,"Tunis","Iraq","Egypt","Lebanon"));
            items.add(new Country("Iraq", R.drawable.iraq,"Tunis","Egypt","Palestine","Iraq"));
            items.add(new Country("Jordan", R.drawable.jordan,"Morocco","Iraq","Jordan","Lebanon"));
            items.add(new Country("Kuwait", R.drawable.kuwait,"Saudi Arabia","Syria","Kuwait","Tunis"));
            items.add(new Country("Lebanon", R.drawable.lebanon,"Tunis","Iraq","Egypt","Lebanon"));
            items.add(new Country("Morocco", R.drawable.morocco,"Algeria","Morocco","Egypt","Lebanon"));
            items.add(new Country("Palestine", R.drawable.palestine,"Palestine","Iraq","Tunis","Lebanon"));
            items.add(new Country("Qatar", R.drawable.qatar,"Qatar","Kuwait","Algeria","Egypt"));
            items.add(new Country("Saudi Arabia", R.drawable.saudi,"Lebanon","Jordan","Saudi Arabia","Palestine"));
            items.add(new Country("Syria", R.drawable.syria,"Syria","Qatar","Palestine","Jordan"));
            items.add(new Country("Tunis", R.drawable.tunis,"Tunis","Syria","Iraq","Lebanon"));
            saveArrayList(this,items);
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        saveArrayList(this,items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }

    public static void saveArrayList(Context context, ArrayList<Country> objects) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(objects);
        editor.putString(KEY_OBJECTS, json);
        editor.apply();
    }
    public static ArrayList<Country> getArrayList(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        String json = sharedPreferences.getString(KEY_OBJECTS, null);
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Country>>() {}.getType();
        return gson.fromJson(json, type);
    }
}