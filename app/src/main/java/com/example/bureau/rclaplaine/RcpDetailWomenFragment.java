package com.example.bureau.rclaplaine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RcpDetailWomenFragment extends Fragment {

    private long womenId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            womenId = savedInstanceState.getLong("womenId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rcp_detail_women, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Women women = Women.womens[(int) womenId];
            title.setText(women.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(women.getDescription());
            TextView description2 = (TextView) view.findViewById(R.id.textDescription2);
            description2.setText(women.getDescription2());
            TextView description3 = (TextView) view.findViewById(R.id.textDescription3);
            description3.setText(women.getDescription3());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("womenId", womenId);
    }

    public void setWomen(long id) {
        this.womenId = id;
    }

}
