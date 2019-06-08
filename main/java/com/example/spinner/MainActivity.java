package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spin;
    String data[]={"Ram","syam", "Mohan", "arvind" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin=(Spinner)findViewById(R.id.spin);

       // ArrayAdapter adapter=new ArrayAdapter( MainActivity.this, android.R.layout.simple_list_item_1,data);
        //spin.setAdapter(adapter);
        ArrayAdapter adapter=new ArrayAdapter( MainActivity.this,
                R.layout.list,data);

        spin.setAdapter(adapter);
        spin.setOnItemSelectedListener(AdapterView.OnItemSelectedListener){
   @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id ){
       switch (position){

           case 0:
               Toast.makeText(MainActivity.this, text:"First",
               Toast.LENGTH_SHORT.show());
               break;
           case 1:
               Toast.makeText(MainActivity.this, text:"Second",
                   Toast.LENGTH_SHORT.show();
               break;
           case 2:
               Toast.makeText(MainActivity.this, text:"Third",
                   Toast.LENGTH_SHORT.show();
       }
            }
            @Override


        }
    }
}
