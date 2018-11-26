package com.example.pei.map;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    public void addEvent(View view)
    {
        Intent intent = new Intent(this, addEventActivity1.class);
        startActivity(intent);
    }

    public void viewEvents(View view)
    {
        Intent intent = new Intent(this, viewEventActivity.class);
        startActivity(intent);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng BostonUniversity = new LatLng(42.3504997, -71.1075878);
        //mMap.addMarker(new MarkerOptions().position(BostonUniversity).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BostonUniversity));

        LatLng GSU = new LatLng(42.3509182,-71.1111392);
        mMap.addMarker(new MarkerOptions().position(GSU).title("GSU"));

        LatLng CAS = new LatLng(42.3502584,-71.1070807);
        mMap.addMarker(new MarkerOptions().position(CAS).title("CAS"));

        LatLng Questrom = new LatLng(42.349605,-71.1019157);
        mMap.addMarker(new MarkerOptions().position(Questrom).title("Questrom"));

        LatLng FitRec = new LatLng(42.3518687,-71.1186489);
        mMap.addMarker(new MarkerOptions().position(FitRec).title("FitRec"));
    }


}
