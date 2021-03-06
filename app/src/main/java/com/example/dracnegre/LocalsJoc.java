package com.example.dracnegre;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class LocalsJoc extends MainMenu {

    ListView localsview;
    String[] clubs;
    static String nomPoble;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locals_joc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setContentView(R.layout.content_locals_joc);
        clubs = new String[]{"Alaquás", "Alborache", "Aldaia", "Alzira", "Basilio", "Benimaclet", "Buñol", "Burjassot", "Ciutat Vella", "Dama Roja", "Gandia", "Massanassa", "Mislata", "MOncada", "Monserrat", "Quart", "Torrefiel", "Xativa", "Xeraco"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, clubs);
        localsview = findViewById(R.id.listlocals);
        localsview.setAdapter(adapter);

        final Intent intent = new Intent(this, MapsClubsFragments.class);

        localsview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick (AdapterView < ? > parent, View v,int position, long id){
              nomPoble =clubs[position];
              Log.d("hola","poble="+nomPoble);


                startActivity(intent);
            }
        });



}

}