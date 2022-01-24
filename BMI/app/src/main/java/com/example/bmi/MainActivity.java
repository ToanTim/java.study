package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText weighText;
    private EditText heighText;
    private TextView result;
    private Button newAcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weighText=findViewById(R.id.weightText);
        heighText=findViewById(R.id.heightText);
        result=findViewById(R.id.result);
        newAcBtn=findViewById(R.id.newAcBtn);

        newAcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    public void bmiCalculate (View view)
    {
       double weight=Double.parseDouble(weighText.getText().toString());
       double height=Double.parseDouble(heighText.getText().toString());

       String result1=String.format("%.2f",(weight*100*100)/(height*height));
//Double.toString((weight*100*100)/(height*height))
       // String.format("%.2f",(weight*100*100)/(height*height))
       result.setText(result1);
    }

    public void openActivity2(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}