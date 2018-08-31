package com.example.herotruth.fragmentprojecttwo;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {

    Button button;

    FragmentInterface myinterface;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        myinterface =(FragmentInterface) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmentone,container, false);
        button = view.findViewById(R.id.btnFragone1);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                myinterface.MyMethod("MyData");

            }
        });

        return view;

    }
}
