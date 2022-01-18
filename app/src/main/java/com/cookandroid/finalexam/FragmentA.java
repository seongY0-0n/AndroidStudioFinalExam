package com.cookandroid.finalexam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {
    Button btnUp, btnDown;
    int count = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a,container,false);
        btnUp = (Button)v.findViewById(R.id.btnUp);
        btnDown = (Button)v.findViewById(R.id.btnDown);
        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.getDataFromA(count);
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.getDataFromA(count);
            }
        });

        return v;
    }

}
