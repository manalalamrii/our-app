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

public class CafActivity extends AppCompatActivity implements OnMapReadyCallback {

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
        LatLng caf1 = new LatLng(21.4899080, 39.2369829);
        mMap.addMarker(new MarkerOptions().position(caf1).title("الكافيتيريا 235"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf1,13f));
        enableMyLocation();

        LatLng caf2 = new LatLng(21.4896837, 39.2363694);
        mMap.addMarker(new MarkerOptions().position(caf2).title("كافتيريا 237 الدور الارضي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf2,13f));
        enableMyLocation();

        LatLng caf3 = new LatLng(21.4899785, 39.2357635);
        mMap.addMarker(new MarkerOptions().position(caf3).title("كافتيريا 204 الدور الارضي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf3,13f));
        enableMyLocation();

        LatLng caf4 = new LatLng(21.4904995, 39.2360374);
        mMap.addMarker(new MarkerOptions().position(caf4).title("كافتيريا مبنى 205 الدور الارضي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf4,13f));
        enableMyLocation();

        LatLng caf5 = new LatLng(21.4902085, 39.2363744);
        mMap.addMarker(new MarkerOptions().position(caf5).title("كافتيريا مبنى 236 الدور الارضي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf5,13f));
        enableMyLocation();

        LatLng caf6 = new LatLng(21.4925763, 39.2375696);
        mMap.addMarker(new MarkerOptions().position(caf6).title("قهوة بونون خارج مبنى 1 المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf6,13f));
        enableMyLocation();

        LatLng caf7 = new LatLng(21.4931019, 39.2377141);
        mMap.addMarker(new MarkerOptions().position(caf7).title("موفنبيك مبنى 3 مقابل مصعد المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf7,13f));
        enableMyLocation();

        LatLng caf8 = new LatLng(21.4930982, 39.2378164);
        mMap.addMarker(new MarkerOptions().position(caf8).title("بينينوس مبنى 3 المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf8,13f));
        enableMyLocation();

        LatLng caf9 = new LatLng(21.4928620, 39.2364934);
        mMap.addMarker(new MarkerOptions().position(caf9).title("بارنيز خارج مبنى 7 المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf9,13f));
        enableMyLocation();

        LatLng caf10 = new LatLng(21.4890454, 39.2443888);
        mMap.addMarker(new MarkerOptions().position(caf10).title("كافتيريا بيتزا الان خلف مبنى(420)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf10,13f));
        enableMyLocation();

        LatLng caf11 = new LatLng(21.4889016, 39.2462339);
        mMap.addMarker(new MarkerOptions().position(caf11).title("قهوة بونون داخل مبنى (61)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf11,13f));
        enableMyLocation();

        LatLng caf12 = new LatLng(21.4887765, 39.2413097);
        mMap.addMarker(new MarkerOptions().position(caf12).title("الملتقى الرئيسي رقم (18)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf12,13f));
        enableMyLocation();

        LatLng caf13 = new LatLng(21.4871330, 39.2397882);
        mMap.addMarker(new MarkerOptions().position(caf13).title("كافتيريا داخل مبنى (8)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf13,13f));
        enableMyLocation();

        LatLng caf14 = new LatLng(21.4866420, 39.2398210);
        mMap.addMarker(new MarkerOptions().position(caf14).title("كافتيريا كنز مقابل بوابة غربية 1 "));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf14,13f));
        enableMyLocation();

        LatLng caf15 = new LatLng(21.4860071, 39.2403722);
        mMap.addMarker(new MarkerOptions().position(caf15).title("الملتقى الغربي داخله (بنينوس- كواليتي - منش - بريسو كافيه - مكتبة الشقري"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf15,13f));
        enableMyLocation();

        LatLng caf16 = new LatLng(21.4862077, 39.2398931);
        mMap.addMarker(new MarkerOptions().position(caf16).title("المطعم المركزي في مبنى الخنساء"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf16,13f));
        enableMyLocation();

        LatLng caf17 = new LatLng(21.4874594, 39.2419326);
        mMap.addMarker(new MarkerOptions().position(caf17).title("كافتيريا رابيس بجوار مبنى (6)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf17,13f));
        enableMyLocation();

        LatLng caf18 = new LatLng(21.4863038, 39.2438500);
        mMap.addMarker(new MarkerOptions().position(caf18).title("كافتيريا بيتزا الان داخل استراحة مبنى الهندسة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(caf18,13f));
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
