package com.example.user.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listview);
        //Inner class a values use korte hole final kore nite hobe
        final String values[]={"C","C++","Java","Python","Assembly","Android","C#","Ruby","VB","Scala"};

        //Adapter ---> ArrayAdapter/SimpleCursorAdapter
        //ArrayAdaoter 1st parameter activity,2nd Which layout-->simple, 3rd Arrays.aslist convert string to list--Na dileo hobe just string name dilei hoi
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,values);
        lv.setAdapter(arrayAdapter);

        //setonItemclickListener
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //koto no id r jonno print hobe tar jonno position-->values[0]= "C"
                Toast.makeText(MainActivity.this,"You r interested in :"+values[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
