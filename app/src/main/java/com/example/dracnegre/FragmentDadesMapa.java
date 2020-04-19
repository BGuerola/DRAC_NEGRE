package com.example.dracnegre;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dracnegre.Model.MySQLiteHelper;


public class FragmentDadesMapa extends Fragment {

    MySQLiteHelper connexion;
    SQLiteDatabase db;

    TextView ciutat, club, direccio, telf;
    String nomCiutatTriada;
    static double paslat, paslot;
    static String pasClub;

    public FragmentDadesMapa() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nomCiutatTriada=LocalsJoc.nomPoble;
        Log.d("hola","poble2="+nomCiutatTriada);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_fragment_dades_mapa, container, false);

        ciutat = root.findViewById(R.id.nomCiutat);
        club = root.findViewById(R.id.nomClub);
        direccio = root.findViewById(R.id.adreçaClub);
        telf = root.findViewById(R.id.numTelf);


        connexion = new MySQLiteHelper(getContext());
        db = connexion.getWritableDatabase();

        Cursor c = db.rawQuery("SELECT nomCiutat, nomClub, direccio, numTelf, latitut, longitut FROM Poblacions WHERE nomCiutat='" + nomCiutatTriada + "'", null);

            if (c.moveToFirst()) {
                ciutat.setText(c.getString(0));
                club.setText(c.getString(1));
                direccio.setText(c.getString(2));
                telf.setText(c.getString(3));
                paslat=c.getDouble(4);
                paslot=c.getDouble(5);
                pasClub=c.getString(1);
            }

        return root;
        }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}