package com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.all.Testing;
import com.walchand.witchar16.R;

public class coding_sub_B extends AppCompatActivity implements View.OnClickListener {
     public static int sub_position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_sub_branche);
        setTitle("Cool Code Events");


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        CardView cv1=(CardView)findViewById(R.id.cv1);
        CardView cv2=(CardView)findViewById(R.id.cv2);
        CardView cv3=(CardView)findViewById(R.id.cv3);
        cv1.setOnClickListener(this);
        cv2.setOnClickListener(this);
        cv3.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.cv1:
                        sub_position=0;
                        Intent i= new Intent(coding_sub_B.this, Testing.class);
                        startActivity(i);
                        break;


                    case R.id.cv2:
                        sub_position=1;
                        Intent ii= new Intent(coding_sub_B.this, Testing.class);
                        startActivity(ii);
                        break;


                    case R.id.cv3:
                        sub_position=2;
                        Intent iii= new Intent(coding_sub_B.this, Testing.class);
                        startActivity(iii);
                        break;

                }
         }

    }

