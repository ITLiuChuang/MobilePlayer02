package com.atguigu.mobileplayer02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rg_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg_main = (RadioGroup)findViewById(R.id.rg_main);

        rg_main.check(R.id.rb_local_vido);
    }
}
