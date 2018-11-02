package com.example.satiga.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: " );
        ImageView iv = (ImageView) findViewById(R.id.shoes);
        CheckBox checkbox = (CheckBox) v;
        switch (checkbox.getId()) {
            case R.id.cb_arms:
                iv = findViewById(R.id.arms);
                break;
            case R.id.cb_shoes:
                iv = findViewById(R.id.shoes);
                break;
            case R.id.cb_eyes:
                iv = findViewById(R.id.eyes);
                break;
            case R.id.cb_nose:
                iv = findViewById(R.id.nose);
                break;
            case R.id.cb_mouth:
                iv = findViewById(R.id.mouth);
                break;
            case R.id.cb_ears:
                iv = findViewById(R.id.ears);
                break;
            case R.id.cb_eyebrows:
                iv = findViewById(R.id.eyebrows);
                break;
            case R.id.cb_glasses:
                iv = findViewById(R.id.glasses);
                break;
            case R.id.cb_hat:
                iv = findViewById(R.id.hat);
                break;
            case R.id.cb_mustache:
                iv = findViewById(R.id.mustache);
                break;
        }
        if (checkbox.isChecked()) {
            iv.setVisibility(View.VISIBLE);
        }
        if (!checkbox.isChecked()) {
            iv.setVisibility(View.INVISIBLE);
        }
    }
}
