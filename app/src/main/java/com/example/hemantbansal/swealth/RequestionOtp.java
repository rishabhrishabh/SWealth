package com.example.hemantbansal.swealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RequestionOtp extends AppCompatActivity {
Button sentOTP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requestion_otp);
        sentOTP=(Button)findViewById(R.id.sen_otp);
        sentOTP.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       // MessageApi.getJSONFromUrl();
                    }
                }
        );
    }
}
