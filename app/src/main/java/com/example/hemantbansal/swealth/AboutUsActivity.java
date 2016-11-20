package com.example.hemantbansal.swealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {
TextView desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        desc=(TextView)findViewById(R.id.desc_);
        desc.setText(Html.fromHtml("Swealth is a cross platform portal aimed at providing a common ground to  sperm Banks in India and wishful Couples to find suitable matches of sperm . Simple Search! All you need to do is register your personal needs and then browse through our comprehensive database of profiles.<br><br><h2><b> Why Us?</b></h2><br> We understand the human desire to borne a child and ensure that our members are able to find suitable matches as per their prerequisites."));

    }
}
