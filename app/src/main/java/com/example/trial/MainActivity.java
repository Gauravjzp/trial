package com.example.trial;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] item={"2hr","4hr","6hr","8hr"};

    AutoCompleteTextView autoCompleteTextView1,autoCompleteTextView2,autoCompleteTextView3,autoCompleteTextView4;
    ArrayAdapter<String>adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView1 =findViewById(R.id.dropDown);
        autoCompleteTextView2 =findViewById(R.id.dropDown2);
        autoCompleteTextView3 =findViewById(R.id.dropDown3);
        autoCompleteTextView4 =findViewById(R.id.dropDown4);
        adapterItems = new ArrayAdapter<String>(this,R.layout.list_item,item);

        autoCompleteTextView1.setAdapter(adapterItems);
        autoCompleteTextView2.setAdapter(adapterItems);
        autoCompleteTextView3.setAdapter(adapterItems);
        autoCompleteTextView4.setAdapter(adapterItems);

        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item= adapterView.getItemAtPosition(position).toString();
                //Toast.makeText(MainActivity.this,"item:"+item, Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item= adapterView.getItemAtPosition(position).toString();
                //Toast.makeText(MainActivity.this,"item:"+item, Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item= adapterView.getItemAtPosition(position).toString();
                //Toast.makeText(MainActivity.this,"item:"+item, Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item= adapterView.getItemAtPosition(position).toString();
                //Toast.makeText(MainActivity.this,"item:"+item, Toast.LENGTH_SHORT).show();
            }
        });
    }

}