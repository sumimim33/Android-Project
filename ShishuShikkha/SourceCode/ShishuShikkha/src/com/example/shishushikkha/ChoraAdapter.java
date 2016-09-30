package com.example.shishushikkha;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ChoraAdapter extends ArrayAdapter<Chora_list>{

    Context context; 
    int layoutResourceId;    
    Chora_list data[] = null;
    
    public ChoraAdapter(Context context, int layoutResourceId, Chora_list[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ChoraHolder holder = null;
        
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new ChoraHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
            
            row.setTag(holder);
        }
        else
        {
            holder = (ChoraHolder)row.getTag();
        }
        
        Chora_list weather = data[position];
        holder.txtTitle.setText(weather.title);
        holder.imgIcon.setImageResource(weather.icon);
        
        return row;
    }
    
    static class ChoraHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}