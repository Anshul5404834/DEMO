package com.example.mylenovo.bealert;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class customadapter extends ArrayAdapter {
    private Context mcontext;
    private ArrayList<country> countries;

    public customadapter(Context context, ArrayList<country>mcountries) {
        super(context,0, mcountries);
        this.mcontext=context;
        this.countries=mcountries;

    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View m = convertView;
        if (m==null){
            m=LayoutInflater.from(mcontext).inflate(R.layout.layout,parent,false);
        }
        country a = countries.get(position);
        TextView A= (TextView)m.findViewById(R.id.a1);
        A.setText(a.getCapital());
        TextView B= (TextView)m.findViewById(R.id.a2);
        B.setText(a.getCountryname());
        return m;
    }
}
