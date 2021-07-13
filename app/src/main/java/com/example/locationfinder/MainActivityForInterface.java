package com.example.locationfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityForInterface extends AppCompatActivity {
public MaterialCardView materialCardView;
    //for Cafeteria
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_for_interface);

        materialCardView = findViewById(R.id.CardOfCafeteria);

        materialCardView.setOnClickListener(v -> {
            Intent intent=new Intent(MainActivityForInterface.this, CafActivity.class);
            startActivity(intent);
        });
    }

    //for Aid
    public void OpenAid(View view){
    setContentView(R.layout.activity_main_for_interface);

    materialCardView = findViewById(R.id.CardOfAid);
Intent OpenAid=new Intent(MainActivityForInterface.this, TestActivity.class);
    startActivity(OpenAid);


}

    //for machine
    public void OpenMachine(View view){
        setContentView(R.layout.activity_main_for_interface);

        materialCardView = findViewById(R.id.CardOfMachine);
        Intent OpenMachine=new Intent(MainActivityForInterface.this, MachineActivity.class);
        startActivity(OpenMachine);


    }

    //for Libraries
    public void OpenLaibrary(View view){
        setContentView(R.layout.activity_main_for_interface);

        materialCardView = findViewById(R.id.CardOfCLaibrary);
        Intent OpenLaibrary=new Intent(MainActivityForInterface.this, LibrariesActivity.class);
        startActivity(OpenLaibrary);


    }

    //for ATMs
    public void OpenAtm(View view){
        setContentView(R.layout.activity_main_for_interface);

        materialCardView = findViewById(R.id.CardOfAtm);
        Intent OpenAtm=new Intent(MainActivityForInterface.this, ATMActivity.class);
        startActivity(OpenAtm);


    }

    //for People care
    public void OpenCareP(View view){
        setContentView(R.layout.activity_main_for_interface);

        materialCardView = findViewById(R.id.CardOfCareP);
        Intent OpenCareP=new Intent(MainActivityForInterface.this, CarePeopleActivity.class);
        startActivity(OpenCareP);


    }

    //for Stationery
    public void OpenSan(View view){
        setContentView(R.layout.activity_main_for_interface);

        materialCardView = findViewById(R.id.CardOfSan);
        Intent OpenSan=new Intent(MainActivityForInterface.this, StationeryActivity.class);
        startActivity(OpenSan);


    }

    //for Medical Administration
    public void OpenMAdmin(View view){
        setContentView(R.layout.activity_main_for_interface);

        materialCardView = findViewById(R.id.CardOfMAdmin);
        Intent OpenMAdmin=new Intent(MainActivityForInterface.this, MedicalAActivity.class);
        startActivity(OpenMAdmin);


    }

    //for Breaks
    public void OpenBreak(View view){
        setContentView(R.layout.activity_main_for_interface);

        materialCardView = findViewById(R.id.CardOfBreak);
        Intent OpenBreak=new Intent(MainActivityForInterface.this, MapsActivity.class);
        startActivity(OpenBreak);


    }





}