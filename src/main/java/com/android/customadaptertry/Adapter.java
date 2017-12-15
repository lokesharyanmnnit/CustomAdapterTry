package com.android.customadaptertry;

import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import static android.widget.Toast.LENGTH_LONG;

public class Adapter extends BaseAdapter{
    public static LayoutInflater inflator;
    String[] t,p,s;
    int[] i;
    Context cont;
    public Adapter(MainActivity context,String[] text,int[] image,String[] price,String[] seller) {
        cont=context;
        inflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //inflator=LayoutInflater.from(getContext());
        t=text;
        p=price;
        s=seller;
        i=image;
    }

    @Override
    public int getCount() {
        return t.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        View rowView;
        rowView=inflator.inflate(R.layout.single_row_item, null);
        TextView text,price,seller;
        ImageView image;
        text=(TextView)rowView.findViewById(R.id.text);
        price=(TextView)rowView.findViewById(R.id.price);
        seller=(TextView)rowView.findViewById(R.id.seller);
        image=(ImageView)rowView.findViewById(R.id.image);
        text.setText(t[position]);
        price.setText(p[position]);
        seller.setText(s[position]);
        image.setImageResource(i[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cont,"You Selected "+t[position],LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}