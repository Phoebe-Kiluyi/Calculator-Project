package com.example.calcassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        EditText editTextNumber;
        EditText editTextNumber2;
        TextView textViewResult;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            // Find the views by their IDs
            editTextNumber = findViewById(R.id.editTextNumber);
            editTextNumber2 = findViewById(R.id.editTextNumber2);
            textViewResult = findViewById(R.id.editTextNumber5);
            // Find button1 and set click listener
            Button button1 = findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button1 click here
                    onButton1Click();
                }
            });

            // Find button2 and set click listener
            Button button2 = findViewById(R.id.button2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button2 click here
                    onButton2Click();
                }
            });
            // Find button3 and set click listener
            Button button3 = findViewById(R.id.button3);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button2 click here
                    onButton3Click();
                }
            });
            // Find button4 and set click listener
            Button button4 = findViewById(R.id.button4);
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button2 click here
                    onButton4Click();
                }
            });
            // Find button5 and set click listener
            Button button5 = findViewById(R.id.button5);
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button5 click here
                    onButton5Click();
                }
            });
            // Find button6 and set click listener
            Button button6 = findViewById(R.id.button6);
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button6 click here
                    onButton6Click();
                }
            });
            // Find button7 and set click listener
            Button button7 = findViewById(R.id.button7);
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button7 click here
                    onButton7Click();
                }
            });
            // Find button8 and set click listener
            Button button8 = findViewById(R.id.button8);
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button8 click here
                    onButton8Click();
                }
            });
            // Find button9 and set click listener
            Button button9 = findViewById(R.id.button9);
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle button9 click here
                    onButton9Click();
                }
            });
            // Find "MULTI" button and set click listener
            Button buttonMULTI = findViewById(R.id.buttonMulti);
            buttonMULTI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle "MULTI" button click here
                    performMultiplication();
                }
            });
            // Find "ADD" button and set click listener
            Button buttonADD = findViewById(R.id.buttonAdd);
            buttonADD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle "ADD" button click here
                    performAddition();
                }
            });
            // Find "SUBTRACT" button and set click listener
            Button buttonSUB = findViewById(R.id.buttonSub);
            buttonSUB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle "SUB" button click here
                    performSubtraction();
                }
            });
            // Find "DIV" button and set click listener
            Button buttonDIV = findViewById(R.id.buttonDiv);
            buttonDIV.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Handle "DIV" button click here
                    performDivision();
                }
            });

        }

        private void onButton1Click() {
            // Your button click handling code goes here
            Toast.makeText(this, "Button 1 clicked!", Toast.LENGTH_SHORT).show();
        }

        private void onButton2Click() {
            // Your button2 click handling code goes here
            // For example, you can display a toast message when button2 is clicked
            Toast.makeText(this, "Button 2 clicked!", Toast.LENGTH_SHORT).show();
        }
        private void onButton3Click() {
            // Your button2 click handling code goes here
            // For example, you can display a toast message when button3 is clicked
            Toast.makeText(this, "Button 3 clicked!", Toast.LENGTH_SHORT).show();
        }
        private void onButton4Click() {
            // Your button4 click handling code goes here
            // For example, you can display a toast message when button4 is clicked
            Toast.makeText(this, "Button 4 clicked!", Toast.LENGTH_SHORT).show();
        }
        private void onButton5Click() {
            // Your button5 click handling code goes here
            // For example, you can display a toast message when button5 is clicked
            Toast.makeText(this, "Button 5 clicked!", Toast.LENGTH_SHORT).show();
        }
        private void onButton6Click() {
            // Your button6 click handling code goes here
            // For example, you can display a toast message when button6 is clicked
            Toast.makeText(this, "Button 6 clicked!", Toast.LENGTH_SHORT).show();
        }
        private void onButton7Click() {
            // Your button7 click handling code goes here
            // For example, you can display a toast message when button7 is clicked
            Toast.makeText(this, "Button 7 clicked!", Toast.LENGTH_SHORT).show();
        }
        private void onButton8Click() {
            // Your button8 click handling code goes here
            // For example, you can display a toast message when button8 is clicked
            Toast.makeText(this, "Button 8 clicked!", Toast.LENGTH_SHORT).show();
        }
        private void onButton9Click() {
            // Your button9 click handling code goes here
            // For example, you can display a toast message when button9 is clicked
            Toast.makeText(this, "Button 9 clicked!", Toast.LENGTH_SHORT).show();
        }
        // Method to handle multiplication functionality
        private void performMultiplication() {
            // Get the values from the EditText fields, convert them to numbers
            // Perform the multiplication operation
            // Update the result EditText with the multiplication result
            // For example:
            try {
                int num1 = Integer.parseInt(editTextNumber.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
                int result = num1 * num2;
                textViewResult = findViewById(R.id.editTextNumber5);
                        textViewResult.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                // Handle the case when the user inputs invalid numbers
                Toast.makeText(this, "Please enter valid numbers.", Toast.LENGTH_SHORT).show();
            }
        }
        // Method to handle addition functionality
        private void performAddition() {
            // Get the values from the EditText fields, convert them to numbers
            // Perform the addition operation
            // Update the result EditText with the addition result
            // For example:
            try {
                int num1 = Integer.parseInt(editTextNumber.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
                int result = num1 + num2;
                textViewResult = findViewById(R.id.editTextNumber5);
                textViewResult.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                // Handle the case when the user inputs invalid numbers
                Toast.makeText(this, "Please enter valid numbers.", Toast.LENGTH_SHORT).show();
            }
        }
        // Method to handle subtraction functionality
        private void performSubtraction() {
            // Get the values from the EditText fields, convert them to numbers
            // Perform the subtraction operation
            // Update the result EditText with the subtraction result
            // For example:
            try {
                int num1 = Integer.parseInt(editTextNumber.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
                int result = num1 - num2;
                textViewResult.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                // Handle the case when the user inputs invalid numbers
                Toast.makeText(this, "Please enter valid numbers.", Toast.LENGTH_SHORT).show();
            }
        }
        // Method to handle division functionality
        private void performDivision() {
            // Get the values from the EditText fields, convert them to numbers
            // Perform the division operation
            // Update the result EditText with the division result
            // For example:
            try {
                int num1 = Integer.parseInt(editTextNumber.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
                if (num2 == 0) {
                    // Handle division by zero case
                    Toast.makeText(this, "Cannot divide by zero.", Toast.LENGTH_SHORT).show();
                } else {
                    double result = (double) num1 / num2;
                    textViewResult = findViewById(R.id.editTextNumber5);
                    textViewResult.setText(String.valueOf(result));
                }
            } catch (NumberFormatException e) {
                // Handle the case when the user inputs invalid numbers
                Toast.makeText(this, "Please enter valid numbers.", Toast.LENGTH_SHORT).show();
            }
        }
        }
    