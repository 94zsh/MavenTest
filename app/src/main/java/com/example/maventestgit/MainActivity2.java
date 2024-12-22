package com.example.maventestgit;

import android.app.Activity;
import android.os.Bundle;


import com.example.testlib.Blemanager3;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Blemanager3.init();
    }
}