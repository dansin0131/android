package com.ourincheon.app_center;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends FragmentActivity {
  //  ViewFlipper flipper;
    ViewPager pager;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calender);

       // pager=(ViewPager)findViewById(R.id.pager);
        //CustomAdapter adapter=new CustomAdapter(getLayoutInflater());
        //pager.setAdapter(adapter);


/*
        flipper=(ViewFlipper)findViewById(R.id.flipper);
        Animation showln= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        flipper.setInAnimation(showln);

        flipper.setOutAnimation(this,android.R.anim.slide_out_right);

        flipper.setFlipInterval(2000);  //2초마다 변경
        flipper.startFlipping();*/
    }
}
