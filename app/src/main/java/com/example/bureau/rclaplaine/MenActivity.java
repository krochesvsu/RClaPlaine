package com.example.bureau.rclaplaine;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenActivity extends AppCompatActivity implements MenListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            RcpDetailMenFragment details = new RcpDetailMenFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setMen(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, DetailMenActivity.class);
            intent.putExtra(DetailMenActivity.EXTRA_MEN_ID, (int)id);
            startActivity(intent);
        }
    }

    public void onClickMen (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
