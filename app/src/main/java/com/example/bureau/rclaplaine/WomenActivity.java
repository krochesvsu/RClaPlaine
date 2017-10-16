package com.example.bureau.rclaplaine;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WomenActivity extends AppCompatActivity implements WomenListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            RcpDetailWomenFragment details = new RcpDetailWomenFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setWomen(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, DetailWomenActivity.class);
            intent.putExtra(DetailWomenActivity.EXTRA_WOMEN_ID, (int)id);
            startActivity(intent);
        }
    }

    public void onClickWomen (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}