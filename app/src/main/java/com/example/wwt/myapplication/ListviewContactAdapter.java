package com.example.wwt.myapplication;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wwt on 2017/4/14.
 */
public class ListviewContactAdapter extends BaseAdapter {
    private static ArrayList<ListviewContactItem> listContact;

    private LayoutInflater mInflater;
    public ListviewContactAdapter(Context photosFragment, ArrayList<ListviewContactItem> results){
        listContact = results;
        mInflater = LayoutInflater.from(photosFragment);
    }

    @Override
    public int getCount() {
        return listContact.size();
    }

    @Override
    public Object getItem(int position) {
        return listContact.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.item, null);
            holder = new ViewHolder();
            holder.txtname = (TextView) convertView.findViewById(R.id.lv_contact_item_name);
            holder.txtphone = (TextView) convertView.findViewById(R.id.lv_contact_item_phone);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtname.setText(listContact.get(position).getTopher());
        holder.txtphone.setText(listContact.get(position).getS());

        return convertView;
    }

    static class ViewHolder{
        TextView txtname, txtphone;
    }
}
