package com.ourincheon.app_center;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by doyeon on 2018-01-16.
 */

public class login extends AppCompatActivity{
    EditText et_id,et_pw;
    String s_id,s_pw;
    Button login;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        et_id=(EditText)findViewById(R.id.HakbunEdit);
        et_pw=(EditText)findViewById(R.id.PasswordEdit);
        login=(Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(intent);
            }

        });
    }

    public void bt_login(View view)
    {
        s_id=et_id.getText().toString();
        s_pw=et_pw.getText().toString();

        if (s_pw.equals(1) && s_id.equals(1))
        {

        }
    }
}
