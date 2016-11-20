package com.example.hemantbansal.swealth;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    EditText input;
    Button logbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        input=(EditText)findViewById(R.id.mobile_input_);
        logbtn=(Button)findViewById(R.id.log_in_);
        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // MessageApi.getJSONFromUrl();
                String s=input.getText().toString();
                if(s.length()==10){
                    //will send an otp to verify the user!
                    MessageApi.hit("http://smsgateway.me/api/v3/contacts/create");

                }
                else{
                    Toast.makeText(LoginActivity.this,"Enter a valid Mobile No",Toast.LENGTH_SHORT);
                    input.setText("");
                }

            }
        });
    }
}
