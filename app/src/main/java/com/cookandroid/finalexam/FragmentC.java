package com.cookandroid.finalexam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentC extends Fragment {
    EditText edtRec;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_c,container,false);
        edtRec = v.findViewById(R.id.edtRecieve);

        return v;
    }
    public void updateFragCEditText(CharSequence newText){
        edtRec.setText(newText);
    }
}
