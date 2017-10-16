package com.example.bureau.rclaplaine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RcpDetailMenFragment extends Fragment {

    private long menId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            menId = savedInstanceState.getLong("menId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rcp_detail_men, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Men men = Men.mens[(int) menId];
            title.setText(men.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(men.getDescription());
            TextView description2 = (TextView) view.findViewById(R.id.textDescription2);
            description2.setText(men.getDescription2());
            TextView description3 = (TextView) view.findViewById(R.id.textDescription3);
            description3.setText(men.getDescription3());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("menId", menId);
    }

    public void setMen(long id) {
        this.menId = id;
    }

}
