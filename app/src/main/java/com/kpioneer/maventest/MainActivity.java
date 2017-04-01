package com.kpioneer.maventest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.kpioneer.mylibrary.LibTest;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LibTest.DemoLog();

    }
}
