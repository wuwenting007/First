package com.example.wwt.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carson_Ho on 16/7/22.
 */
public class Fragment1 extends Fragment {

    private EditText et1;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private EditText et6;
    private Button btn;
    private RadioGroup group;
    private RadioButton b1,b2,b3;
    private Spinner spinner;
    private List<String> data_list;
    private ArrayAdapter<String> arr_adapter;




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();//初始化控件
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment1, container, false);

        return  view;




    }


    private void initView() {
        //获取控件对象实例化

        et1 = (EditText) getActivity().findViewById(R.id.et1);

        et3 = (EditText) getActivity().findViewById(R.id.et3);
        et4 = (EditText) getActivity().findViewById(R.id.et4);
        et5 = (EditText) getActivity().findViewById(R.id.et5);
        et6 = (EditText) getActivity().findViewById(R.id.add_content);
        btn= (Button) getActivity().findViewById(R.id.btn);
        group= (RadioGroup) getActivity().findViewById(R.id.radioGroup);
        b1= (RadioButton) getActivity().findViewById(R.id.radioMale);
        b2= (RadioButton) getActivity().findViewById(R.id.radioFemale);
        b3= (RadioButton) getActivity().findViewById(R.id.radioFemale1);



    }



}
