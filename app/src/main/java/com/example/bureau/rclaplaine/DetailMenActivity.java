package com.example.bureau.rclaplaine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailMenActivity extends AppCompatActivity {

    public static final String EXTRA_MEN_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_men);
        RcpDetailMenFragment frag = (RcpDetailMenFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int menId = (int) getIntent().getExtras().get(EXTRA_MEN_ID);
        frag.setMen(menId);
    }
}
