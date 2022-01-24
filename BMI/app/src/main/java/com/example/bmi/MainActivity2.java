package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button backActBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1=findViewById(R.id.button2);
        button2=findViewById(R.id.button3);
        button3=findViewById(R.id.button4);
        button4=findViewById(R.id.button5);
        backActBtn=findViewById(R.id.backActBtn);

        backActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backActivity();
            }
        });

        backActBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backActivity();
            }
        });
 //-256
        //-16524603
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ColorDrawable buttonColor=(ColorDrawable) button1.getBackground();
                int colorId=buttonColor.getColor();
                Log.d("color", String.valueOf(colorId));
                if(colorId==-16524603)
                {
                    button1.setBackgroundColor(Color.YELLOW);
                }
                else button1.setBackgroundColor(-16524603);
                //button1.setBackgroundColor(Color.YELLOW);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable buttonColor=(ColorDrawable) button2.getBackground();
                int colorId=buttonColor.getColor();
                Log.d("color", String.valueOf(colorId));
                //button2.setBackgroundColor(Color.YELLOW);
                if(colorId==-16524603)
                {
                    button2.setBackgroundColor(Color.YELLOW);
                }
                else button2.setBackgroundColor(-16524603);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable buttonColor=(ColorDrawable) button3.getBackground();
                int colorId=buttonColor.getColor();
                Log.d("color", String.valueOf(colorId));
                //button3.setBackgroundColor(Color.YELLOW);
                if(colorId==-16524603)
                {
                    button3.setBackgroundColor(Color.YELLOW);
                }
                else button3.setBackgroundColor(-16524603);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable buttonColor=(ColorDrawable) button4.getBackground();
                int colorId=buttonColor.getColor();
                Log.d("color", String.valueOf(colorId));
                //button4.setBackgroundColor(Color.YELLOW);
                if(colorId==-16524603)
                {
                    button4.setBackgroundColor(Color.YELLOW);
                }
                else button4.setBackgroundColor(-16524603);
            }
        });
    }

    public void backActivity(){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}