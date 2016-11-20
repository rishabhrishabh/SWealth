package com.example.hemantbansal.swealth;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchDonorActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView recyclerView,recyclerView1;
    SharedPrefUtil sharedPrefUtil;
    DonorDetails dnr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_donor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /***************************************/
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        //dnr=sharedPrefUtil.getdata();
        LinearLayoutManager layoutManager=new LinearLayoutManager(SearchDonorActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        DonorDetails d1=new DonorDetails(103,"Muscular",170,80,"Black","Fair");
        DonorDetails d2=new DonorDetails(53,"Muscular",165,75,"Black","Brown");
        DonorDetails d3=new DonorDetails(152,"Swimmer",175,58,"Brown","Dark");
        DonorDetails d4=new DonorDetails(163,"Athelete",179,55,"Blonde","Fair");
        DonorDetails d5=new DonorDetails(183,"Athelete",180,52,"Brown","Dark");
        ArrayList<DonorDetails> donorDetails=new ArrayList<>();
        donorDetails.add(d1);
        donorDetails.add(d2);
        donorDetails.add(d3);
        donorDetails.add(d4);
        donorDetails.add(d5);

        recyclerView.setAdapter(new RecyclerViewAdapter(donorDetails,SearchDonorActivity.this));





    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_donor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.exit_opt) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home_) {

        } else if (id == R.id.filters_) {
            Toast.makeText(SearchDonorActivity.this,"Work in progress",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.about_us_) {
            Intent i=new Intent(SearchDonorActivity.this,AboutUsActivity.class);
            startActivity(i);

        } else if (id == R.id.help_) {
            Intent i=new Intent(SearchDonorActivity.this,HelpActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
