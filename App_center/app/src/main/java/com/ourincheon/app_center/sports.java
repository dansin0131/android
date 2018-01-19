package com.ourincheon.app_center;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * Created by doyeon on 2018-01-16.
 */

public class sports extends Activity{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports);
        TextView tv = (TextView)findViewById(R.id.place);
        String str = tv.getText().toString();
        SpannableStringBuilder ssb = new SpannableStringBuilder(str);
        ssb.setSpan(new ForegroundColorSpan(Color.parseColor("#7474df")), 5, 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(ssb);


        TextView tv1 = (TextView)findViewById(R.id.place1);
        String str1 = tv1.getText().toString();
        SpannableStringBuilder ssb1 = new SpannableStringBuilder(str1);
        ssb1.setSpan(new ForegroundColorSpan(Color.parseColor("#7474df")), 5, 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1.setText(ssb1);

        final ViewGroup layout = (ViewGroup) findViewById(R.id.perfectButton);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(sports.this,perfect.class);
                startActivity(intent);
            }
        });
    }


}
