package com.example.minizomato_project;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class mylistadapter extends ArrayAdapter {
private final Activity context;
String maintitle[];
String subtitle[];
int imageid[];


    public mylistadapter(Activity context, String maintitle[], String subtitle[], int imageid[]) {
        super(context, R.layout.mycustomlistview, maintitle);

        this.context= context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imageid=imageid;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // return super.getView(position, convertView, parent);

    LayoutInflater inflater= context.getLayoutInflater();

        View view=inflater.inflate(R.layout.mycustomlistview, null, false);
        ImageView imageView=view.findViewById(R.id.images);
        TextView textView=  view.findViewById(R.id.maintitle);
        TextView textView1= view.findViewById(R.id.subtitle);

        textView.setText(maintitle[position]);
        textView1.setText(subtitle[position]);
        imageView.setImageResource(imageid[position]);


        return view;

    }
}
