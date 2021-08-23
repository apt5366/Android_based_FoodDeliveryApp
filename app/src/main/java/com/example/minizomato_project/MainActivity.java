package com.example.minizomato_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= findViewById(R.id.listView);

        String maintitle[]={"Punjabi Angithi", "Subway", "Gulshan Dhaba", "Burger King"};
        String subtitle[]={"4.5/5.0", "3.8/5.0","4.0/5.0","3.9/5.0"};

        int images[]={R.drawable.punjabi, R.drawable.sub,R.drawable.gulshan,R.drawable.burgerking};

        mylistadapter adapter=new mylistadapter(this, maintitle, subtitle, images);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==0)
                {
                        Intent intent=new Intent(MainActivity.this,punjabi.class);
                        startActivity(intent);
                }


                if(position==1)
                {
                    Intent intent = new Intent(MainActivity.this, subway.class);
                    startActivity(intent);
                }

                if(position==2)
                {
                    Intent intent= new Intent(MainActivity.this,gulshan.class);
                    startActivity(intent);
                }

                if(position==3)
                {
                    Intent intent=new Intent(MainActivity.this,burgerking.class );
                    startActivity(intent);
                }


            }
        });

    }
}
