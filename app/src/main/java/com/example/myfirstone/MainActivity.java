package com.example.myfirstone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView regNO;
    private TextView MyName;
    private TextView BatchNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        regNO = findViewById(R.id.textView7);
        regNO.setText(R.string.REGNO);

        MyName = findViewById(R.id.textView8);
        MyName.setText(R.string.NAME);

        BatchNo = findViewById(R.id.textView9);
        BatchNo.setText(R.string.MyBatchNo);
    }
}