package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment; //this have to be same on the all other fragment java files
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ashik, shafiq, akash;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ashik = (Button) findViewById(R.id.ashik);
        shafiq = (Button) findViewById(R.id.shafiq);



        ashik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment myFragment = new AshikFragment();

                FragmentManager fragmentManager = getFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.fragmentId, myFragment);

                fragmentTransaction.commit();



            }
        });

        shafiq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment myFragment = new ShafiqFragment();

                FragmentManager fragmentManager = getFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.fragmentId, myFragment);

                fragmentTransaction.commit();
            }
        });

    }


}
