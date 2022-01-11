package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView text;
private ConstraintLayout container;
private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Intialization Button
        text=(TextView) findViewById(R.id.text);
        container=(ConstraintLayout) findViewById(R.id.container);

    }


    public void onClickbutton(View v){
        if(count%2==0)
        {
            text.setText(R.string.hello_text_after_click);
            container.setBackgroundColor(ContextCompat.getColor(this, R.color.green));

        }
        else{
            text.setText(R.string.hello_text);
            container.setBackgroundColor(ContextCompat.getColor(this, R.color.white));

        }

        count++;
    }
}