package com.example.wwt.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Carson_Ho on 16/7/22.
 */
public class Fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2, container, false);

        ArrayList<ListviewContactItem> listContact = GetlistContact();
        ListView lv = (ListView)rootView.findViewById(R.id.listview);
        lv.setAdapter(new ListviewContactAdapter(getActivity(), listContact));

        return rootView;
    }
    private ArrayList<ListviewContactItem> GetlistContact(){
        ArrayList<ListviewContactItem> contactlist = new ArrayList<ListviewContactItem>();

        ListviewContactItem contact = new ListviewContactItem();
        for(int i=0;i<=100;i++){

        contact.setTopher("Topher");
        contact.setS("01213113568");
        contactlist.add(contact);}

        contact = new ListviewContactItem();
        contact.setTopher("Jean");
        contact.setS("01213869102");
        contactlist.add(contact);

        contact = new ListviewContactItem();
        contact.setTopher("Andrew");
        contact.setS("01213123985");
        contactlist.add(contact);

        return contactlist;
    }
}

