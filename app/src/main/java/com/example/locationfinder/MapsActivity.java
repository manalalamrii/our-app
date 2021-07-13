package com.example.locationfinder;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.locationfinder.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private static final int REQUEST_LOCATION_PERMISSION = 1;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.locationfinder.databinding.ActivityMapsBinding binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
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
mMap =googleMap;




        // Add a cafeteria marker in KAU and move the camera
        LatLng cafeteria01=new LatLng(21.4887765, 39.2413097);
        mMap.addMarker(new MarkerOptions().position(cafeteria01).title("الملتقئ الرئيسي رقم(18)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cafeteria01,13f));
        enableMyLocation();

        LatLng cafeteria02=new LatLng(21.4860071, 39.2403722);
        mMap.addMarker(new MarkerOptions().position(cafeteria02).title("الملتقئ الغربي داخل (بنينوس - كواليتي - منش - بريسو كافية )"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cafeteria02,13f));
        enableMyLocation();

        LatLng cafeteria03=new LatLng(21.4898631, 39.2403048);
        mMap.addMarker(new MarkerOptions().position(cafeteria03).title(" استراحة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cafeteria03,13f));
        enableMyLocation();



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return true;
    }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
                // Change the map type based on the user's selection.
                int itemId = item.getItemId();
                if (itemId == R.id.normal_map) {
                        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                        return true;
                } else if (itemId == R.id.hybrid_map) {
                        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                        return true;
                } else if (itemId == R.id.satellite_map) {
                        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                        return true;
                } else if (itemId == R.id.terrain_map) {
                        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                        return true;
                }
                return super.onOptionsItemSelected(item);
        }
    private void enableMyLocation() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            ActivityCompat.requestPermissions(this, new String[]
                            {Manifest.permission.ACCESS_FINE_LOCATION},
                    REQUEST_LOCATION_PERMISSION);
        }
    }
        @SuppressLint("MissingSuperCall")
        @Override
        public void onRequestPermissionsResult(int requestCode,
                                               @NonNull String[] permissions,
                                               @NonNull int[] grantResults) {
                // Check if location permissions are granted and if so enable the
                // location data layer.
                if (requestCode == REQUEST_LOCATION_PERMISSION) {
                        if (grantResults.length > 0
                                && grantResults[0]
                                == PackageManager.PERMISSION_GRANTED) {
                                enableMyLocation();
                        }
                }
        }
}
