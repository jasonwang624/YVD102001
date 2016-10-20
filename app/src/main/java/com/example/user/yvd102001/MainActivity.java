package com.example.user.yvd102001;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText) findViewById(R.id.edQ1);
        ed2 = (EditText) findViewById(R.id.edQ2);
        tv = (TextView) findViewById(R.id.tvAns);

    }

    public void click1(View v)
    {
        int Ans = Integer.parseInt(ed1.getText().toString()) + Integer.parseInt(ed2.getText().toString());
        tv.setText(String.valueOf(Ans));
    }
    public void click2(View v)
    {
        Intent it = new Intent();
        it.setAction("CALL123");
        startActivity(it);
    }
}
