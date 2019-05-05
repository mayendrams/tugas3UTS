package com.mayendrams.mayendramsapps;

//NIM               : 10116513
//NAMA              : Mayendra Muhammad Shiddiq
//Tanggal Dibuat    : 30-04-2019

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);



    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()){
            case R.id.home_menu:
                fragment = new HomeFragment();
                break;
            case R.id.daily_menu:
                fragment = new DailyFragment();
                break;
            case R.id.gallery_menu:
                fragment = new GaleryFragment();
                break;
            case R.id.favorite_menu:
                fragment = new FavoriteFragment();
                break;
            case R.id.profile_menu:
                fragment = new ProfileFragment();
                break;
        }
        return loadFragment(fragment);
    }

    public void myPhone (View view) {
        Intent PHONEintent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:082218140136"));
        startActivity(PHONEintent);

    }

    public void myEmail (View view) {
        Intent Emailintent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:mayendrams"));
        startActivity(Emailintent);
    }

    public void myFB (View view) {
        Intent FBintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/people/Mayendra-Muhammad-Shiddiq/100009642665926"));
        startActivity(FBintent);

    }

    public void myIG (View view) {
        Intent IGintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mayendrams/"));
        startActivity(IGintent);

    }


}

