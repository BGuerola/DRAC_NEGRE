package com.example.dracnegre;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.MenuItem;

import com.example.dracnegre.Model.Punts;

import java.util.Comparator;

public class MainActivity extends MainMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //return super.onOptionsItemSelected(item);
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Home) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    static class MySort implements Comparator<Object> {
        public int compare(Object o1, Object o2) {
            return ((Punts) o1).getPuntsEquip() - ((Punts) o2).getPuntsEquip() ;
        }
    }


    public void GetCompetition(View view) {

        Intent intent = new Intent (this, OrdreForza.class);
        startActivity(intent);

    }
}
