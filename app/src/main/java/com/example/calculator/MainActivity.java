package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstValue, secondValue;
    private Button buttonSum, buttonDiv, buttonSub, buttonMult;
    private TextView totalValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue = findViewById(R.id.firstValue);
        secondValue = findViewById(R.id.secondValue);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonMult = findViewById(R.id.buttonMult);
        buttonSub = findViewById(R.id.buttonSub);
        buttonSum = findViewById(R.id.buttonSum);
        totalValue = findViewById(R.id.TotalValue);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueFirst = firstValue.getText().toString();
                String valueSecond = secondValue.getText().toString();
                if(valueSecond.isEmpty()) {
                    secondValue.setError("Informar um valor valido");
                    return;
                }
                if(valueFirst.isEmpty()) {
                    firstValue.setError("Informar um valor valido");
                    return;
                }
                Double total = Double.parseDouble(valueFirst) + Double.parseDouble(valueSecond);
                String result = String.format("%.2f", total);
                totalValue.setText(result);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueFirst = firstValue.getText().toString();
                String valueSecond = secondValue.getText().toString();
                if(Double.parseDouble(valueSecond) <= 0.0) {
                    secondValue.setError("Valor na divisão no pode ser igual ou menor que 0.0");
                    return;
                }
                if(valueSecond.isEmpty()) {
                    secondValue.setError("Informar um valor valido");
                    return;
                }
                if(valueFirst.isEmpty()) {
                    firstValue.setError("Informar um valor valido");
                    return;
                }
                Double total = Double.parseDouble(valueFirst) / Double.parseDouble(valueSecond);
                String result = String.format("%.2f", total);
                totalValue.setText(result);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueFirst = firstValue.getText().toString();
                String valueSecond = secondValue.getText().toString();
                if(valueSecond.isEmpty()) {
                    secondValue.setError("Informar um valor valido");
                    return;
                }
                if(valueFirst.isEmpty()) {
                    firstValue.setError("Informar um valor valido");
                    return;
                }
                Double total = Double.parseDouble(valueFirst) - Double.parseDouble(valueSecond);
                String result = String.format("%.2f", total);
                totalValue.setText(result);
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valueFirst = firstValue.getText().toString();
                String valueSecond = secondValue.getText().toString();
                if(valueSecond.isEmpty()) {
                    secondValue.setError("Informar um valor valido");
                    return;
                }
                if(valueFirst.isEmpty()) {
                    firstValue.setError("Informar um valor valido");
                    return;
                }
                Double total = Double.parseDouble(valueFirst) * Double.parseDouble(valueSecond);
                String result = String.format("%.2f", total);
                totalValue.setText(result);
            }
        });
    }
}