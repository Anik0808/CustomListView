package com.anik.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> list;

    static final String[] os =new String[]{"Android","Apple","Windows","BlackBerry"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView)findViewById(R.id.list);

        final MobileArrayAdapter adapter=new MobileArrayAdapter(this,os);
        listView.setAdapter(adapter);
    }
}
