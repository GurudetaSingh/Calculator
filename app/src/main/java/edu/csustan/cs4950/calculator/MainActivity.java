package edu.csustan.cs4950.calculator;

import androidx.appcompat.app.AppCompatActivity;

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

    public void add(View v) {
        // Get num1 and num2
        EditText inputNum1 = findViewById(R.id.inputNum1);
        EditText inputNum2 = findViewById(R.id.inputNum2);
        String num1Str = inputNum1.getText().toString();
        String num2Str = inputNum2.getText().toString();

        // Add two numbers
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double sum = num1 + num2;

        // Show result
        TextView lblMsg = findViewById(R.id.lblMsg);
        lblMsg.setText(String.valueOf(sum));
    }

    public void subtract(View w) {
        // Get num1 and num2
        EditText inputNum1 = findViewById(R.id.inputNum1);
        EditText inputNum2 = findViewById(R.id.inputNum2);
        String num1Str = inputNum1.getText().toString();
        String num2Str = inputNum2.getText().toString();

        // subtract
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double sum = num1 - num2;

        // Show result
        TextView lblMsg = findViewById(R.id.lblMsg);
        lblMsg.setText(String.valueOf(sum));
    }

    public void multiply(View v) {
        // Get num1 and num2
        EditText inputNum1 = findViewById(R.id.inputNum1);
        EditText inputNum2 = findViewById(R.id.inputNum2);
        String num1Str = inputNum1.getText().toString();
        String num2Str = inputNum2.getText().toString();

        // multiply
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double sum = num1 * num2;

        // Show result
        TextView lblMsg = findViewById(R.id.lblMsg);
        lblMsg.setText(String.valueOf(sum));
    }

    public void divide(View v) {
        // Get num1 and num2
        EditText inputNum1 = findViewById(R.id.inputNum1);
        EditText inputNum2 = findViewById(R.id.inputNum2);
        String num1Str = inputNum1.getText().toString();
        String num2Str = inputNum2.getText().toString();

        // divide
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double sum = num1 / num2;

        // Show result
        TextView lblMsg = findViewById(R.id.lblMsg);
        lblMsg.setText(String.valueOf(sum));
    }
}