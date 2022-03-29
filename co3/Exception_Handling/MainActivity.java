package com.example.adapter_exception;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
class EmptyListException extends Exception{
    public String toString(){
        return "Empty list Exception";
    }
}
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv=(ListView)findViewById(R.id.lv);
        String[] colors={};
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,colors);
        try {
            if(arrayAdapter.getCount()<=0){
                throw new EmptyListException();
            }
            lv.setAdapter(arrayAdapter);
        }catch (EmptyListException e){
            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
        }
    }
}