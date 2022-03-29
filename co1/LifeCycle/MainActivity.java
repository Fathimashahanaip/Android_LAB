package com.example.lifecycle3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("state","onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("state","onStrart");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("state","onResume");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("state","onStop");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("state","onPause");
    }

}