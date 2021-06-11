package com.example.shobhitsagar.luck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    EditText editText2;
    EditText editText3;
    Button button;
    Random random;
    String[] A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String t1 = editText.getText().toString();
                String t2 = editText2.getText().toString();
                String t3 = editText3.getText().toString();

                A = new String[]{t1, t2, t3};
                int i = (int) (Math.random()*3);
                textView.setText(A[i]);
            }

        });

    }
}