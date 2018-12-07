package com.andresleonel09.ejerciciomercadopago.Adapter;

/**
 * Created by Andres-PC on 2018-12-05.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.andresleonel09.ejerciciomercadopago.Models.ItemComboData;
import com.andresleonel09.ejerciciomercadopago.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ComboAdapter extends ArrayAdapter<ItemComboData> {
    int groupid;
    Activity context;
    ArrayList<ItemComboData> list;
    LayoutInflater inflater;
    public ComboAdapter(Activity context, int groupid, int id, ArrayList<ItemComboData>
            list){
        super(context,id,list);
        this.list=list;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.groupid=groupid;
    }

    public View getView(int position, View convertView, ViewGroup parent ){
        View itemView=inflater.inflate(groupid,parent,false);

        ImageView imageView=(ImageView)itemView.findViewById(R.id.img);
        //imageView.setImageResource(list.get(position).getImageId());

        Picasso.with(parent.getContext()).load(list.get(position).getImageURL()).into(imageView);

        TextView textView=(TextView)itemView.findViewById(R.id.txt);
        textView.setText(list.get(position).getText());
        return itemView;
    }

    public View getDropDownView(int position, View convertView, ViewGroup
            parent){
        return getView(position,convertView,parent);

    }
}