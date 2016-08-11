package com.homer.loadingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RotateLoading loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loading= (RotateLoading) findViewById(R.id.loading);
        loading.start();

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"=======",Toast.LENGTH_SHORT).show();
                if(loading.isStart()){
                    loading.stop();
                }else{
                    loading.start();
                }
            }
        });

    }
}
