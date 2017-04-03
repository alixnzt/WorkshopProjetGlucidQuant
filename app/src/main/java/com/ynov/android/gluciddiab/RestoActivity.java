package com.ynov.android.gluciddiab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import com.ynov.android.gluciddiab.Adapter.RestoAdapter;

import java.util.ArrayList;

public class RestoActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        GridView restoGridView = (GridView) findViewById(R.id.restoGridView);
        RestoAdapter gridViewAdapter = new RestoAdapter(this,getData());
        restoGridView.setAdapter(gridViewAdapter);
    }

    private ArrayList<Restaurant> getData() {

        ArrayList<Restaurant> restaurant = new ArrayList<>();

        Restaurant r = new Restaurant();
        r.setImage(R.drawable.mcdo);
        r.setNom("McDonald's");
        restaurant.add(r);

        r = new Restaurant();
        r.setImage(R.drawable.kfc);
        r.setNom("KFC");
        restaurant.add(r);

        r = new Restaurant();
        r.setImage(R.drawable.bk);
        r.setNom("Burger King");
        restaurant.add(r);

        return restaurant;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_settings:
                Toast.makeText(RestoActivity.this, "Paramètre" , Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
