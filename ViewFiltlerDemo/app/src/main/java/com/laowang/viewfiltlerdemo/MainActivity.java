package com.laowang.viewfiltlerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = findViewById(R.id.vf);
        viewFlipper.addView(LayoutInflater.from(this).inflate(R.layout.item_view_fipper1,null,false));
        viewFlipper.addView(LayoutInflater.from(this).inflate(R.layout.item_view_fipper2,null,false));
        viewFlipper.addView(LayoutInflater.from(this).inflate(R.layout.item_view_fipper3,null,false));
        viewFlipper.addView(LayoutInflater.from(this).inflate(R.layout.item_view_fipper4,null,false));
    }
}
