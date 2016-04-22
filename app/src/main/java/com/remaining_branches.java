package com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.all.Testing;
import com.walchand.witchar16.R;


import android.widget.ImageView;
import android.widget.TextView;

import Fragements.Events;

public class remaining_branches extends AppCompatActivity implements View.OnClickListener {
    public static int remaining_sub_position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remainingall_sub_branche);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int p= Events.position;


        CardView cv1=(CardView)findViewById(R.id.cv1);
        CardView cv2=(CardView)findViewById(R.id.cv2);
        CardView cv3=(CardView)findViewById(R.id.cv3);
        CardView cv4=(CardView)findViewById(R.id.cv4);
        ImageView im1=(ImageView)findViewById(R.id.cim1);
        ImageView im2=(ImageView)findViewById(R.id.cim2);
        ImageView im3=(ImageView)findViewById(R.id.cim3);
        ImageView im4=(ImageView)findViewById(R.id.cim4);
        TextView tv1=(TextView)findViewById(R.id.tv1);
        TextView tv2=(TextView)findViewById(R.id.tv2);
        TextView tv3=(TextView)findViewById(R.id.tv3);
        TextView tv4=(TextView)findViewById(R.id.tv4);
        if(p==11)
        {
            setTitle("Paper Presentation");
            tv1.setText("Civil And Allied Branches");
            tv2.setText("Computer And Allied Branches");
            tv3.setText("Electronics And Allied Branches");
            tv4.setText("Mechanical And Allied Branches");

            im1.setImageResource(R.drawable.deptt);
            im2.setImageResource(R.drawable.cse);
            im3.setImageResource(R.drawable.entc);
            im4.setImageResource(R.drawable.mechanical);


        }

        else if(p==12)
        {
            setTitle("Project Competition");
            tv1.setText("Civil And Allied Branches");
            tv2.setText("Computer And Allied Branches");
            tv3.setText("Electronics And Allied Branches");
            tv4.setText("Mechanical And Allied Branches");
            im1.setImageResource(R.drawable.deptt);
            im2.setImageResource(R.drawable.cse);
            im3.setImageResource(R.drawable.entc);
            im4.setImageResource(R.drawable.mechanical);


        }

        else
        {

            setTitle("Robotics");
            tv1.setText("Line Seguidor");
            tv2.setText("If You Can ");
            tv3.setText("Pick And Place");
            tv4.setText("The Invincible");
           im1.setImageResource(R.drawable.line);
            im2.setImageResource(R.drawable.youcan);
            im3.setImageResource(R.drawable.pnpnew);
            im4.setImageResource(R.drawable.fight);

        }

        cv1.setOnClickListener(this);
        cv2.setOnClickListener(this);
        cv3.setOnClickListener(this);
        cv4.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.cv1:
                remaining_sub_position=0;
                Intent i= new Intent(remaining_branches.this, Testing.class);
                startActivity(i);
                break;


            case R.id.cv2:
                remaining_sub_position=1;
                Intent ii= new Intent(remaining_branches.this, Testing.class);
                startActivity(ii);
                break;


            case R.id.cv3:
                remaining_sub_position=2;
                Intent iii= new Intent(remaining_branches.this, Testing.class);
                startActivity(iii);
                break;



            case R.id.cv4:
                remaining_sub_position=3;
                Intent iiii= new Intent(remaining_branches.this, Testing.class);
                startActivity(iiii);
                break;

        }
    }

}

