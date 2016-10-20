package com.example.user.yvd102001;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        EditText ed1 = (EditText) findViewById(R.id.edQ1);
        EditText ed2 = (EditText) findViewById(R.id.edQ2);
        String str1 = ed1.getText().toString();
        String str2 = ed2.getText().toString();
        int Ans = Integer.parseInt(str1) + Integer.parseInt(str2);
        TextView tv = (TextView) findViewById(R.id.tvAns);
        tv.setText(String.valueOf(Ans));
    }
}
