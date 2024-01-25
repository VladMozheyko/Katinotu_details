package com.example.katinotu_details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BoilerDetails extends Fragment implements View.OnClickListener {

    ImageView imageView;
    ImageView imageView2;
    int count = 1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.boiler_details_fragment, container, false);
        imageView = view.findViewById(R.id.charact);
        imageView2 = view.findViewById(R.id.charact_pressed);
        imageView2.setVisibility(View.GONE);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);



        return view;
    }

    @Override
    public void onClick(View v) {
        if(count == 1) {
            imageView.setVisibility(View.GONE);
            imageView2.setVisibility(View.VISIBLE);
            count = 2;
        }
        else {
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.GONE);
            count = 1;
        }
    }
}
