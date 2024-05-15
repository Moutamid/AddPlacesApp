package com.moutamid.addplacesapp.Activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.moutamid.addplacesapp.Helper.Config;
import com.moutamid.addplacesapp.R;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng defaultLocation = new LatLng(-34, 151);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(defaultLocation, 10));

        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng latLng) {
                showCoordinatesDialog(latLng);
            }
        });
    }

    private void showCoordinatesDialog(LatLng latLng) {
        Config.lat=latLng.latitude;
        Config.lng=latLng.longitude;
        String message = "Latitude: " + latLng.latitude + "\nLongitude: " + latLng.longitude;
        new AlertDialog.Builder(this)
                .setTitle("Selected Coordinates")
                .setMessage(message)
                .setPositiveButton("Next", (dialog, which) -> {
                    finish();
                })
                .setNegativeButton("Cancel", null)
                .show();
    }
}
