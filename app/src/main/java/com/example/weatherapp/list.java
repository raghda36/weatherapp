package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class list extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView =(ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("iPhone");
        arrayList.add("Windows");
        arrayList.add("Blackberry");
        arrayList.add("Linux");

        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position==0){
                    Intent myintent = new Intent(view.getContext(),DeviceDetailAndroid.class);
                    startActivityForResult(myintent,0);
                }
                if (position==1){
                    Intent myintent = new Intent(view.getContext(),DeviceDetailIphone.class);
                    startActivityForResult(myintent,1);
                }
                if (position==2){
                    Intent myintent = new Intent(view.getContext(),DeviceDetailWindows.class);
                    startActivityForResult(myintent,2);
                }
                if (position==3){
                    Intent myintent = new Intent(view.getContext(),DeviceDetailBlackBerry.class);
                    startActivityForResult(myintent,3);
                }
                if (position==4){
                    Intent myintent = new Intent(view.getContext(),DeviceDetailLinux.class);
                    startActivityForResult(myintent,4);
                }

            }
        });


    }
}
