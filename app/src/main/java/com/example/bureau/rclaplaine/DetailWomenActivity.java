package com.example.bureau.rclaplaine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailWomenActivity extends AppCompatActivity {

    public static final String EXTRA_WOMEN_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_women);
        RcpDetailWomenFragment frag = (RcpDetailWomenFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int womenId = (int) getIntent().getExtras().get(EXTRA_WOMEN_ID);
        frag.setWomen(womenId);
    }
}
