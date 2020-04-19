package com.example.dracnegre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class FragmentMapa extends SupportMapFragment implements OnMapReadyCallback {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        getMapAsync(this);

        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap map) {

        LatLng latLng = new LatLng(FragmentDadesMapa.paslat, FragmentDadesMapa.paslot);

        float zoom = 17;
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom));
        map.addMarker(new MarkerOptions()
                .position(latLng)
                .title(FragmentDadesMapa.pasClub)
        );


    }

}