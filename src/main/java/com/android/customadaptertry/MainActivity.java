package com.android.customadaptertry;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] text={"1st","2nd","3rd","4th","5th","6th"};
        int[] image={R.mipmap.ic_launcher, R.mipmap.ic_launcher_round,
                R.mipmap.ic_launcher, R.mipmap.ic_launcher_round
                ,R.mipmap.ic_launcher, R.mipmap.ic_launcher_round};
        String[] price={"10","20","30","40","50","60"};
        String[] seller={"Aryan","Lokesh","Soumya","RUM","Mayank","Bho bho"};
        ListAdapter customAdapter=new Adapter(this,text,image,price,seller);
        ListAdapter list=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,text);
        ListView lv=(ListView)findViewById(R.id.listView);
        lv.setAdapter(customAdapter);
    }
}
