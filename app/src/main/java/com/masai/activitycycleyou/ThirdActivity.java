package com.masai.activitycycleyou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private Button mBtnThirdActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mBtnThirdActivity = findViewById(R.id.btnActivity3);
        mBtnThirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this,"Button3 Clicked",Toast.LENGTH_SHORT).show();

            }
        });
        Log.d("ThirdActivity","onCreate");
    }
    @Override
    protected void onResume () {
        super.onResume();
        Log.d("ThirdActivity", "onResume");

    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.d("ThirdActivity", "onStart");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d("ThirdActivity", "onDestroy");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.d("ThirdActivity", "onPause");
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.d("ThirdActivity", "onStop");
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.d("ThirdActivity", "onRestart");
    }
}