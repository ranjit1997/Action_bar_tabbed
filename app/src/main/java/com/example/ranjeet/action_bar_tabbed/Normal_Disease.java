package com.example.ranjeet.action_bar_tabbed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Normal_Disease extends AppCompatActivity {

    GridView gridview;
    ImageView IVProfile;


    public static String[] osNameList = {
            "cough",
            "Fever",
            "Headache",
            "Stomach-ache",
            "Cold",

    };

    public static int[] osImages = {
            R.mipmap.cough,
            R.mipmap.fever,
            R.mipmap.haedaches,
            R.mipmap.stomach,
            R.mipmap.cold,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal__disease);
        gridview = (GridView) findViewById(R.id.customgrid5);
        gridview.setAdapter(new Disease_Custom_Adapter(Normal_Disease.this, osNameList, osImages));

    }

}

