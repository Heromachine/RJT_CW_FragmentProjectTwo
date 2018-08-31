package com.example.herotruth.fragmentprojecttwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityFragment extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        getSupportFragmentManager().beginTransaction().add()
    }

    public void myMethod (string data)
    {
        //getFragmentManager().findFragmentById(R.id.fragmentTwo);
        //fragmentTwo.myDataMethod(data);

        FragmentTwo fragmenttwo = new FragmentTwo();
        Bundle bundle = new Bundle();
        bundle.putString("mykey", data);
        fragmenttwo.setArguments(bundle);

        getFragmentManager().beginTransaction().replace(R.id)
    }
}
