package com.example.asad.reflect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);

    }
    public void onClick(View v)
    {
        if(v.getId()==R.id.b1)
        {
            Intent i=new Intent(this,Callclass.class);
            startActivity(i);
        }
        else
        {
            Intent i=new Intent(this,Callinterface.class);
            startActivity(i);
        }
    }



}
