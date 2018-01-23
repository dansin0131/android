package com.ourincheon.app_center;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

public class MainActivity extends FragmentActivity {

    ViewPager pager;
    ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        b1=(ImageButton)findViewById(R.id.category1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(
                        getApplicationContext(),
                        sports.class);
                startActivity(intent);
            }
        });



        pager=(ViewPager)findViewById(R.id.pager);
        CustomAdapter adapter=new CustomAdapter(getLayoutInflater());
        pager.setAdapter(adapter);



    }
}
