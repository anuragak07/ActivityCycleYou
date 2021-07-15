package com.masai.activitycycleyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mBtnActivity1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnActivity1 =findViewById(R.id.btnActivity1);

        mBtnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Toast.makeText(MainActivity.this,"Button1 clicked",Toast.LENGTH_SHORT ).show();
                 Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                 startActivity(intent);


            }
        });
        Log.d("MainActivity","onCreate");
    }
    //log

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","onRestart");
    }
}