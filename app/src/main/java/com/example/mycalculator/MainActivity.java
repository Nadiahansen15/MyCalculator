package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView resultView;
    private int lastResult = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.myNumberEndpoint1);
        resultView = findViewById(R.id.resultView);
    }

    public void plus(View view) {
        int tal = Integer.parseInt(String.valueOf(editText.getText()));
        lastResult = lastResult + tal;
        editText.setText("");
        resultView.setText(lastResult+"");
    }

    public void minus(View view) {
        int tal = Integer.parseInt(String.valueOf(editText.getText()));
        lastResult = lastResult - tal;
        editText.setText("");
        resultView.setText(lastResult+"");

    }
    public void add(View view) {
        int tal = Integer.parseInt(String.valueOf(editText.getText()));
        if(lastResult == 0) {
            lastResult = 1;
        }
        lastResult = lastResult * tal;
        editText.setText("");
        resultView.setText(lastResult + "");
    }

        public void divid(View view){
            int tal = Integer.parseInt(String.valueOf(editText.getText()));
            if(lastResult == 0) {
                lastResult = 1;
            }
            lastResult = lastResult / tal;
            editText.setText("");
            resultView.setText(lastResult + "");
        }

        public void page2(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent); // forventer intet resultat
        }
}