package com.example.cricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText nbr;
    Button btn;
    TextView tv;
    DecimalFormat formatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        nbr = findViewById(R.id.editTextNumber);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView2);

        tv.setVisibility(View.GONE);

        formatter = new DecimalFormat("#0.0");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (nbr.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Please enter all fields!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int A = Integer.parseInt(nbr.getText().toString().trim());

                    double B = (A/3.0)+4;

                    String result = "The approximate temperature outside is "+formatter.format(B)+" degrees Celcius.";

                    tv.setText(result);

                    tv.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}