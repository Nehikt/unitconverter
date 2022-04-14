package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unitconverter.R;

public class MainActivity extends AppCompatActivity {
    private EditText input,input1;
    private TextView output,output1;
    private Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=(EditText) findViewById(R.id.editTextId);
        output=(TextView)findViewById(R.id.textViewId);
        convert=(Button)findViewById(R.id.convertId);
        input1=(EditText) findViewById(R.id.editText1Id);
        output1=(TextView)findViewById(R.id.textView1Id);
        convert=(Button)findViewById(R.id.convertId);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mul=100;
                double d=2.54;
                double result=0.0;
                double n=Double.parseDouble(input.getText().toString());
                double n1=Double.parseDouble(input1.getText().toString());
                result=n*mul;

                output.setText("m to cm "+ Double.toString(result)+" cm");
                 double result1=0.0;
                 result1=n1*d;
                output1.setText("inches to cm "+ Double.toString(result1)+" cm");

            }


        });

    }
}

