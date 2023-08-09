package com.example.bscscalcassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstNumberEditText, secondNumberEditText, operatorEditText, AnswerEditText;
    Button add, sub, multi, div, refresh, equals;


    private String selectedOperator = ""; // To store the selected operator
    private boolean enteringSecondNumber = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.editTextNumber1);
        secondNumberEditText = findViewById(R.id.editTextNumber2);
        operatorEditText = findViewById(R.id.editTextNumber3);
        AnswerEditText = findViewById(R.id.textViewResult);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button0 = findViewById(R.id.button0);

        add = findViewById(R.id.buttonAdd);
        sub = findViewById(R.id.buttonSub);
        multi = findViewById(R.id.buttonMulti);
        div = findViewById(R.id.buttonDiv);
        refresh = findViewById(R.id.buttonRefresh);
        equals = findViewById(R.id.buttonEquals);

        firstNumberEditText.setInputType(InputType.TYPE_NULL);
        secondNumberEditText.setInputType(InputType.TYPE_NULL);
        operatorEditText.setInputType(InputType.TYPE_NULL);
        AnswerEditText.setInputType(InputType.TYPE_NULL);

        // Set click listeners for number buttons

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberClicked("0");
            }
        });


        // Set click listeners for operator buttons
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("-");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("/");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("*");
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumberEditText.setText("");
                secondNumberEditText.setText("");
                operatorEditText.setText("");
                AnswerEditText.setText("");
                selectedOperator = "";
            }
        });
        equals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                onEqualsButtonClicked();
            }
        });
    }

    private void onNumberClicked(String number) {
        if (!enteringSecondNumber) {
            String currentText = firstNumberEditText.getText().toString();
            firstNumberEditText.setText(currentText + number);
        } else {
            String currentText = secondNumberEditText.getText().toString();
            secondNumberEditText.setText(currentText + number);
        }
    }

    private void onOperatorButtonClicked(String operator) {
        // If the operator is not selected yet, set the selectedOperator
        // and update the operatorEditText to show the selected operator
        if (!enteringSecondNumber) {
            selectedOperator = operator;
            operatorEditText.setText(selectedOperator);
            enteringSecondNumber = true;
        }
    }

    private void onEqualsButtonClicked() {
        if (!firstNumberEditText.getText().toString().isEmpty() &&
                !secondNumberEditText.getText().toString().isEmpty() &&
                !selectedOperator.isEmpty()) {
            double first = Double.parseDouble(firstNumberEditText.getText().toString());
            double second = Double.parseDouble(secondNumberEditText.getText().toString());
            double result = 0;

            switch (selectedOperator) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (second != 0) {
                        result = first / second;
                    } else {
                        AnswerEditText.setText("Cannot divide by zero");
                        return;
                    }
                    break;
            }

            AnswerEditText.setText(String.valueOf(result));
            enteringSecondNumber = false;
        }
    }
}
