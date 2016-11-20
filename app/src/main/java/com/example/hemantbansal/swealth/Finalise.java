package com.example.hemantbansal.swealth;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Finalise extends AppCompatActivity {
TextView detailing;
    Button confirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalise);
        confirm=(Button)findViewById(R.id.confirm_);
        detailing=(TextView)findViewById(R.id.detailing_);
        detailing.setText(Html.fromHtml("<pre><h2>Physical Characterstics</h2><br>" +
                "<b>Physique</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Muscular<br>" +
                "<b>Height</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   167<br>" +
                "<b>Weight</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;57<br>" +
                "<b>HairColor</b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Black<br>" +
                "<b>Complexion</b> &nbsp;&nbsp;&nbsp;Fair<br>" +
                "<h2>Medical Information</h2><br>" +
                "<b>Blood Group:</b>&nbsp;&nbsp;&nbsp; O+<br>" +
                "<b>Disease:</b>   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;None&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</pre>"
                    ));

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog progress;
                progress = new ProgressDialog(Finalise.this);
                progress.setTitle("Please Wait!!");
                progress.setMessage("Wait!!");
                progress.setCancelable(true);
                progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress.show();
                Handler handler=new Handler();
                Runnable runnable=new Runnable() {
                    @Override
                    public void run() {
                        progress.cancel();
                        final AlertDialog alertDialog = new AlertDialog.Builder(Finalise.this)
                                .setTitle("Successful")
                                .setMessage("We Have recieved yor request.Our agent will cotact you soon")
                                .setPositiveButton("Thank You!", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                        Intent i=new Intent(Finalise.this,SearchDonorActivity.class);
                                        startActivity(i);
                                    }
                                })
                                .setCancelable(false)
                                .create();

                        alertDialog.show();


                    }
                };
                handler.postDelayed(runnable,2000);
            }

        });

    }



}
