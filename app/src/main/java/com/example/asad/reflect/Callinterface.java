package com.example.asad.reflect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Asad on 05-03-2016.
 */
public class Callinterface extends AppCompatActivity implements View.OnClickListener {
    Button b;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.binterface);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}