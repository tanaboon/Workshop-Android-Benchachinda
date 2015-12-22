package com.example.aum.traffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by aum on 12/22/2015.
 */
public class MyAdapter extends BaseAdapter {
    //Exlicit
    private Context objContext;
    private String[] titilStrings, detailStrings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] titilStrings, String[] detailStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titilStrings = titilStrings;
        this.detailStrings = detailStrings;
        this.iconInts = iconInts;
    } //Constructor

    @Override
    public int getCount() {
        return titilStrings.length;

    }



    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View objView = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        // for Titile
        TextView titleTextView = (TextView) objView.findViewById(R.id.textView2);
        titleTextView.setText(titilStrings[position]);

        // For Detail
        TextView detailTextView = (TextView) objView.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[position]);

        // For Icon
        ImageView iconImageView = (ImageView) objView.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[position]);

        return objView;
    }
} // Main Class
