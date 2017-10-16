package com.example.bureau.rclaplaine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailJuniorActivity extends AppCompatActivity {

    public static final String EXTRA_JUNIOR_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_junior);
        RcpDetailJuniorFragment frag = (RcpDetailJuniorFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int juniorId = (int) getIntent().getExtras().get(EXTRA_JUNIOR_ID);
        frag.setJunior(juniorId);
    }
}
