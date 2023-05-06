package com.example.myapplication111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count1 = 0;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button Button7 = findViewById(R.id.Button7);



        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);

        Button7.setEnabled(false);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button7.setEnabled(true);
                text1.setText(text1.getText() + ": " + button.getText());
                count1=0;
                text2.setText("0");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button7.setEnabled(true);
                text1.setText(text1.getText() + ": " + button2.getText());
                count1=0;
                text2.setText("0");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button7.setEnabled(true);
                text1.setText(text1.getText() + ": " + button3.getText());
                count1=0;
                text2.setText("0");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button7.setEnabled(true);
                text1.setText(text1.getText() + ": " + button4.getText());
                count1=0;
                text2.setText("0");

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button7.setEnabled(true);
                text1.setText(text1.getText() + ": " + button5.getText());
                count1=0;
                text2.setText("0");

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                Button7.setEnabled(false);
                count1=0;
                text2.setText("0");
                text1.setText("Selected Tasbhi");




            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                text2.setText("" + count1);

            }
         });
    }

}