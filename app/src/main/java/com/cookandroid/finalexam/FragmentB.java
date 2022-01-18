package com.cookandroid.finalexam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
    EditText edtCount;
    Button btnSend;
    FragmentC fragmentC;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b,container,false);
        edtCount = v.findViewById(R.id.edtCount);
        edtCount.setText("0");
        btnSend = v.findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity mainActivity = (MainActivity)getActivity();
                String s = edtCount.getText().toString();
                mainActivity.getDataFromB(s);
            }
        });
        return v;
    }

    public void updateFragBEditText(int newText){
        String sum = String.valueOf(newText);
        edtCount.setText(sum);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}
