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

public class MachineActivity extends AppCompatActivity implements OnMapReadyCallback {

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




        // Add a machine marker in KAU and move the camera
        LatLng Machine=new LatLng(21.4899174, 39.2371619);
        mMap.addMarker(new MarkerOptions().position(Machine).title("آلة بيع ذاتي الدور الثاني ٢٣٥"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine,13f));
        enableMyLocation();

        LatLng Machine2=new LatLng(21.4900865, 39.2354799);
        mMap.addMarker(new MarkerOptions().position(Machine2).title("آلة بيع ذاتي ببوابة غربية ٣"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine2,13f));
        enableMyLocation();

        LatLng Machine3=new LatLng(21.4898940, 39.2402991);
        mMap.addMarker(new MarkerOptions().position(Machine3).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine3,13f));
        enableMyLocation();

        LatLng Machine4=new LatLng(21.4895830, 39.2399930);
        mMap.addMarker(new MarkerOptions().position(Machine4).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine4,13f));
        enableMyLocation();

        LatLng Machine5=new LatLng(21.4894248, 39.2401167);
        mMap.addMarker(new MarkerOptions().position(Machine5).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine5,13f));
        enableMyLocation();

        LatLng Machine6=new LatLng(21.4891088, 39.2443979);
        mMap.addMarker(new MarkerOptions().position(Machine6).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine6,13f));
        enableMyLocation();

        LatLng Machine7=new LatLng(21.4893278, 39.2433696);
        mMap.addMarker(new MarkerOptions().position(Machine7).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine7,13f));
        enableMyLocation();

        LatLng Machine8=new LatLng(21.4855607, 39.2403256);
        mMap.addMarker(new MarkerOptions().position(Machine8).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine8,13f));
        enableMyLocation();

        LatLng Machine9=new LatLng(21.4861853, 39.2397251);
        mMap.addMarker(new MarkerOptions().position(Machine9).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine9,13f));
        enableMyLocation();

        LatLng Machine10=new LatLng(21.4862902, 39.2395071);
        mMap.addMarker(new MarkerOptions().position(Machine10).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine10,13f));
        enableMyLocation();

        LatLng Machine11=new LatLng(21.4858748, 39.2438534);
        mMap.addMarker(new MarkerOptions().position(Machine11).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine11,13f));
        enableMyLocation();

        LatLng Machine12=new LatLng(21.4860496, 39.2410636);
        mMap.addMarker(new MarkerOptions().position(Machine12).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine12,13f));
        enableMyLocation();

        LatLng Machine13=new LatLng(21.4855354, 39.2403548);
        mMap.addMarker(new MarkerOptions().position(Machine13).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine13,13f));
        enableMyLocation();

        LatLng Machine14=new LatLng(21.4870485, 39.2414096);
        mMap.addMarker(new MarkerOptions().position(Machine14).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine14,13f));
        enableMyLocation();

        LatLng Machine15=new LatLng(21.4870485, 39.2414096);
        mMap.addMarker(new MarkerOptions().position(Machine15).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine15,13f));
        enableMyLocation();

        LatLng Machine16=new LatLng(21.4882531, 39.2404035);
        mMap.addMarker(new MarkerOptions().position(Machine16).title("آلة بيع ذاتي كلية الحقوق ٢ البوابة الرئيسية"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine16,13f));
        enableMyLocation();

        LatLng Machine17=new LatLng(21.4879004, 39.2396483);
        mMap.addMarker(new MarkerOptions().position(Machine17).title("آلة بيع ذاتي المبنى الرابع الدور الأرضي (ايس كريم، كوفي، اكل، تين ميد)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Machine17));
        enableMyLocation();

        LatLng Machine18=new LatLng(21.4873347, 39.2395909);
        mMap.addMarker(new MarkerOptions().position(Machine18).title("آلة بيع ذاتي تين ميد المبنى الخامس الدور الارضي المدخل الرئيسي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine18,13f));
        enableMyLocation();

        LatLng Machine19=new LatLng(21.4884064, 39.2395396);
        mMap.addMarker(new MarkerOptions().position(Machine19).title("آلة بيع ذاتي المبنى الثالث الدور الارضي (تين ميد، كوفي، اكل)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine19,13f));
        enableMyLocation();

        LatLng Machine20=new LatLng(21.4897896, 39.2424793);
        mMap.addMarker(new MarkerOptions().position(Machine20).title("آلة بيع ذاتي مبنى ٦٥ الدور الارضي بوابة رئيسية (ميد، كوفي، ايس كريم)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine20,13f));
        enableMyLocation();

        LatLng Machine21=new LatLng(21.4888931, 39.2426632);
        mMap.addMarker(new MarkerOptions().position(Machine21).title("آلة بيع ذاتي مبنى ٤٢٠ الدور الارضي جانب غرفة المشرفة ١١٩"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine21,13f));
        enableMyLocation();

        LatLng Machine22=new LatLng(21.4888336, 39.2427354);
        mMap.addMarker(new MarkerOptions().position(Machine22).title("آلة بيع ذاتي مبنى ٤٢٠ الدور الارضي جانب المسرح"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine22,13f));
        enableMyLocation();

        LatLng Machine23=new LatLng(21.4898016, 39.2425939);
        mMap.addMarker(new MarkerOptions().position(Machine23).title("آلة بيع ذاتي كوفي مبنى ٦٥ الدور الارضي جانب معمل الاحتياجات الخاصة ١ب-١"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine23,13f));
        enableMyLocation();

        LatLng Machine24=new LatLng(21.4890692, 39.2434058);
        mMap.addMarker(new MarkerOptions().position(Machine24).title("آلة بيع ذاتي مبنى ٤٢٠ الدور الاول جوار المصعد (ميد، كوفي)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine24,13f));
        enableMyLocation();

        LatLng Machine25=new LatLng(21.4884409, 39.2430253);
        mMap.addMarker(new MarkerOptions().position(Machine25).title("آلة بيع ذاتي ميد مبنى ٦٣ الدور الارضي امام مصعد ١"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine25,13f));
        enableMyLocation();

        LatLng Machine26=new LatLng(21.4891609, 39.2430839);
        mMap.addMarker(new MarkerOptions().position(Machine26).title("آلة بيع ذاتي بوابة شمالية ٣ بجوار دورات المياة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine26,13f));
        enableMyLocation();

        LatLng Machine27=new LatLng(21.4900422, 39.2405191);
        mMap.addMarker(new MarkerOptions().position(Machine27).title("آلة بيع ذاتي بوابة شمالية ١ بجوار آخر باب خارجي في البوابة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine27,13f));
        enableMyLocation();

        LatLng Machine28=new LatLng(21.4857313, 39.2424372);
        mMap.addMarker(new MarkerOptions().position(Machine28).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine28,13f));
        enableMyLocation();

        LatLng Machine29=new LatLng(21.4854639, 39.2429338);
        mMap.addMarker(new MarkerOptions().position(Machine29).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine29,13f));
        enableMyLocation();

        LatLng Machine30=new LatLng(21.4864047, 39.2420627);
        mMap.addMarker(new MarkerOptions().position(Machine30).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine30,13f));
        enableMyLocation();

        LatLng Machine31=new LatLng(21.4867654, 39.2405543);
        mMap.addMarker(new MarkerOptions().position(Machine31).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine31,13f));
        enableMyLocation();

        LatLng Machine32=new LatLng(21.4869295, 39.2420560);
        mMap.addMarker(new MarkerOptions().position(Machine32).title("آلة بيع ذاتي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine32,13f));
        enableMyLocation();

        LatLng Machine33=new LatLng(21.4935097, 39.2352324);
        mMap.addMarker(new MarkerOptions().position(Machine33).title("آلة بيع ذاتي مبنى ٩ جانب مكتب ٩٢٢ في المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine33,13f));
        enableMyLocation();

        LatLng Machine34=new LatLng(21.4932033, 39.2355908);
        mMap.addMarker(new MarkerOptions().position(Machine34).title("آلة بيع ذاتي مبنى ٩ الدور الازضي جانب المصعد في المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine34,13f));
        enableMyLocation();

        LatLng Machine35=new LatLng(21.4928792, 39.2360639);
        mMap.addMarker(new MarkerOptions().position(Machine35).title("آلة بيع ذاتي مبنى ٨ الدور الاول امام الباب الرئيسي في كلية الطب (كوفي، ميد)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine35,13f));
        enableMyLocation();

        LatLng Machine36=new LatLng(21.4928726, 39.2359385);
        mMap.addMarker(new MarkerOptions().position(Machine36).title("آلة بيع ذاتي مبنى ٨ الدور الارضي آلة حلويات في الركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine36,13f));
        enableMyLocation();

        LatLng Machine37=new LatLng(21.4941358, 39.2355801);
        mMap.addMarker(new MarkerOptions().position(Machine37).title("آلة بيع ذاتي مبنى ١٠ الدور الارضي (آلة حلويات، ميد، كوفي) في المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine37,13f));
        enableMyLocation();

        LatLng Machine38=new LatLng(21.4935271, 39.2356887);
        mMap.addMarker(new MarkerOptions().position(Machine38).title("آلة بيع ذاتي حلويات مبنى ١٠ الدور الاول في المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine38,13f));
        enableMyLocation();

        LatLng Machine39=new LatLng(21.4936631, 39.2358772);
        mMap.addMarker(new MarkerOptions().position(Machine39).title("آلة بيع ذاتي مبنى ١١ الدور الارضي (حلويات، كوفي) في المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine39,13f));
        enableMyLocation();

        LatLng Machine40=new LatLng(21.4940461, 39.2369840);
        mMap.addMarker(new MarkerOptions().position(Machine40).title("آلة بيع ذاتي مبنى ١٢ الدور الارضي (حلويات، كوفي) في المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine40,13f));
        enableMyLocation();

        LatLng Machine41=new LatLng(21.4936226, 39.2365155);
        mMap.addMarker(new MarkerOptions().position(Machine41).title("آلة بيع ذاتي مبنى ١٢ الدور الاول (عصيرات، موية) في المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine41,13f));
        enableMyLocation();

        LatLng Machine42=new LatLng(21.4925850, 39.2379498);
        mMap.addMarker(new MarkerOptions().position(Machine42).title("آلة بيع ذاتي مبنى ٤ مقابل ٤٧٠/أ في المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine42,13f));
        enableMyLocation();

        LatLng Machine43=new LatLng(21.4925142, 39.2380856);
        mMap.addMarker(new MarkerOptions().position(Machine43).title("آلة بيع ذاتي مبنى ٤ بجانب ٤٠٢/أ في المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine43,13f));
        enableMyLocation();

        LatLng Machine44=new LatLng(21.4914201, 39.2376156);
        mMap.addMarker(new MarkerOptions().position(Machine44).title("آلة بيع ذاتي مبنى ٤٣١ بجانب ٨ المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine44,13f));
        enableMyLocation();

        LatLng Machine45=new LatLng(21.4915836, 39.2373779);
        mMap.addMarker(new MarkerOptions().position(Machine45).title("آلة بيع ذاتي مبنى ٤٣١ بجانب ٢/١٩ المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine45,13f));
        enableMyLocation();

        LatLng Machine46=new LatLng(21.4930189, 39.2374198);
        mMap.addMarker(new MarkerOptions().position(Machine46).title("آلة بيع ذاتي مبنى ٢ بجانب ٢٢٠/أ المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine46,13f));
        enableMyLocation();

        LatLng Machine47=new LatLng(21.4929463, 39.2374469);
        mMap.addMarker(new MarkerOptions().position(Machine47).title("آلة بيع ذاتي مبنى ٢ بجانب ٢٤٠/١ المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine47,13f));
        enableMyLocation();

        LatLng Machine48=new LatLng(21.4929135, 39.2374795);
        mMap.addMarker(new MarkerOptions().position(Machine48).title("آلة بيع ذاتي مبنى ٢ بجانب ٢٤٠/أ المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine48,13f));
        enableMyLocation();

        LatLng Machine49=new LatLng(21.49300024, 39.2377926);
        mMap.addMarker(new MarkerOptions().position(Machine49).title("آلة بيع ذاتي مبنى ٣ مقابل الباب الرئيسي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine49,13f));
        enableMyLocation();

        LatLng Machine50=new LatLng(21.4924318, 39.2374976);
        mMap.addMarker(new MarkerOptions().position(Machine50).title("آلة بيع ذاتي مبنى ٥ بجانب ٥٠٦/أ المركز"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine50,13f));
        enableMyLocation();

        LatLng Machine51=new LatLng(21.4931562, 39.2364867);
        mMap.addMarker(new MarkerOptions().position(Machine51).title("آلة بيع ذاتي حلويات مبنى ١٣ الدور الأول المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine51,13f));
        enableMyLocation();

        LatLng Machine52=new LatLng(21.4930402, 39.2363861);
        mMap.addMarker(new MarkerOptions().position(Machine52).title("آلة بيع ذاتي قهوة مبنى ١٣ الدور الأول المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine52,13f));
        enableMyLocation();

        LatLng Machine53=new LatLng(21.4926511, 39.2369507);
        mMap.addMarker(new MarkerOptions().position(Machine53).title("آلة بيع ذاتي مبنى ٦ مقابل المصعد المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine53,13f));
        enableMyLocation();

        LatLng Machine56=new LatLng(21.4927538, 39.2369732);
        mMap.addMarker(new MarkerOptions().position(Machine56).title("آلة بيع ذاتي مبنى ٦ بجانب ٦١٠ المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine56,13f));
        enableMyLocation();

        LatLng Machine57=new LatLng(21.4916919, 39.2373172);
        mMap.addMarker(new MarkerOptions().position(Machine57).title("آلة بيع ذاتي مبنى ٤٣١ المركز الطبي"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine57,13f));
        enableMyLocation();

        LatLng Machine58=new LatLng(21.4886935, 39.2444724);
        mMap.addMarker(new MarkerOptions().position(Machine58).title("آلة بيع ذاتي في الدوار الثالث مبنى ٦٧ مقابل قسم الخدمات الصحية (كوفي، شبس)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine58,13f));
        enableMyLocation();

        LatLng Machine59=new LatLng(21.4891090, 39.2451613);
        mMap.addMarker(new MarkerOptions().position(Machine59).title("آلة بيع ذاتي مبنى ٦١ الدور الارضي بجانب المسرح ١١٤ وأخرى بجوار معمل الحاسب ١٧٣"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine59,13f));
        enableMyLocation();

        LatLng Machine60=new LatLng(21.4886935, 39.2444724);
        mMap.addMarker(new MarkerOptions().position(Machine60).title("آلة بيع ذاتي مبنى ٦٧ الدور الارضي مقابل المصاعد"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine60,13f));
        enableMyLocation();

        LatLng Machine61=new LatLng(21.4885724, 39.2444944);
        mMap.addMarker(new MarkerOptions().position(Machine61).title("آلة بيع ذاتي مبنى ٦٧ مقابل الدرج ج٦٥ (ميد اكل وكوفي)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine61,13f));
        enableMyLocation();

        LatLng Machine62=new LatLng(21.4892108, 39.2400286);
        mMap.addMarker(new MarkerOptions().position(Machine62).title("آلة بيع ذاتي مبنى ٩ الدور الارضي بجوار قاعة ٩٠٢"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine62,13f));
        enableMyLocation();

        LatLng Machine63=new LatLng(21.4891058, 39.2398084);
        mMap.addMarker(new MarkerOptions().position(Machine63).title("آلة بيع ذاتي مبنى ٩ الدور الارضي بالقرب من المصعد ومستودع الصيانة رقم ١"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine63,13f));
        enableMyLocation();

        LatLng Machine64=new LatLng(21.4892927, 39.2397019);
        mMap.addMarker(new MarkerOptions().position(Machine64).title("آلة بيع ذاتي ميد مبنى ٩ الدور الارضي المصعد الشمالي يوجد"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine64,13f));
        enableMyLocation();

        LatLng Machine65=new LatLng(21.4894952, 39.2402296);
        mMap.addMarker(new MarkerOptions().position(Machine65).title("آلة بيع ذاتي مبنى ١٢ بقرب من قاعة ١٢٢٠"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine65,13f));
        enableMyLocation();

        LatLng Machine66=new LatLng(21.4899756, 39.2393181);
        mMap.addMarker(new MarkerOptions().position(Machine66).title("آلة بيع ذاتي قهوة مبنى ١٢ بجانب قاعة ١٢٠٣"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Machine66,13f));
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
