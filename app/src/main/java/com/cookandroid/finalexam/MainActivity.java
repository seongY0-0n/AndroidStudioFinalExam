package com.cookandroid.finalexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentC fragmentC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentA = new FragmentA();
        fragmentB = new FragmentB();
        fragmentC = new FragmentC();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container_a, fragmentA);
        fragmentTransaction.add(R.id.container_b, fragmentB);
        fragmentTransaction.add(R.id.container_c, fragmentC);
        fragmentTransaction.hide(fragmentC);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }


    public void getDataFromA(int input){
        fragmentB.updateFragBEditText(input);
    }

    public void getDataFromB(CharSequence input){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.show(fragmentC).commit();

        fragmentC.updateFragCEditText(input);
    }

    @Override
    public void onBackPressed() {
        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.hide(fragmentC);
        fragmentTransaction1.commit();
    }
}