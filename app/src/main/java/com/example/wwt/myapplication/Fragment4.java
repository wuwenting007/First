package com.example.wwt.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Carson_Ho on 16/7/22.
 */
public class Fragment4 extends Fragment{

    private Context mContext;

    public Fragment4(Context mContext) {
        this.mContext = mContext;
    }

    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment4, container, false);


        return v;


    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

    }


}

