package com.example.bureau.rclaplaine;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JuniorActivity extends AppCompatActivity implements JuniorListFragment.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior);
    }

    @Override
    public void itemClicked(long id) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            RcpDetailJuniorFragment details = new RcpDetailJuniorFragment();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            details.setJunior(id);
            ft.replace(R.id.fragment_container, details);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.addToBackStack(null);
            ft.commit();
        }
        else {
            Intent intent = new Intent(this, DetailJuniorActivity.class);
            intent.putExtra(DetailJuniorActivity.EXTRA_JUNIOR_ID, (int)id);
            startActivity(intent);
        }
    }

    public void onClickJunior (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
