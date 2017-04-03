package com.ynov.android.gluciddiab.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ynov.android.gluciddiab.R;
import com.ynov.android.gluciddiab.Restaurant;

import java.util.ArrayList;

/**
 * Created by alix on 02/04/2017.
 */

public class RestoAdapter extends BaseAdapter {
    Context context;
    ArrayList<Restaurant> restaurants;

    public RestoAdapter(Context context, ArrayList<Restaurant> restaurants) {
        this.context = context;
        this.restaurants = restaurants;
    }

    @Override
    public int getCount() {
        return restaurants.size();
    }

    @Override
    public Object getItem(int i) {
        return restaurants.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.cardview,viewGroup,false);
        }

        final Restaurant r = (Restaurant) this.getItem(i);

        ImageView imgResto = (ImageView) view.findViewById(R.id.imageResto);
        TextView nomResto = (TextView) view.findViewById(R.id.nomResto);

        nomResto.setText(r.getNom());
        imgResto.setImageResource(r.getImage());

        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context, r.getNom(), Toast.LENGTH_SHORT).show();
            }

        });

        return view;
    }
}
