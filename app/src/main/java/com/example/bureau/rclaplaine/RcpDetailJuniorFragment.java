package com.example.bureau.rclaplaine;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RcpDetailJuniorFragment extends Fragment {
    private long juniorId;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            juniorId = savedInstanceState.getLong("juniorId");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rcp_detail_junior, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Junior junior = Junior.juniors[(int) juniorId];
            title.setText(junior.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(junior.getDescription());
            TextView description2 = (TextView) view.findViewById(R.id.textDescription2);
            description2.setText(junior.getDescription2());
            TextView description3 = (TextView) view.findViewById(R.id.textDescription3);
            description3.setText(junior.getDescription3());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("juniorId", juniorId);
    }

    public void setJunior(long id) {
        this.juniorId = id;
    }

}
