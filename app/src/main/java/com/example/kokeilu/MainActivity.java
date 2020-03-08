package com.example.kokeilu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(this);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);


        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                input();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };

        EditText text = findViewById(R.id.editText);
        text.addTextChangedListener(textWatcher);
    }

    void setText(){
        TextView _text = findViewById(R.id.textView);
        _text.setText("Hello world!");
    }

    void asd(){
        EditText text = findViewById(R.id.editText);
        TextView asd = findViewById(R.id.textView5);
        String x = text.getText().toString();
        asd.setText(x);
    }
    void input(){
        EditText text = findViewById(R.id.editText);
        TextView editedText = findViewById(R.id.textView4);
        String x = text.getText().toString();
        editedText.setText(x);
        showToast(x);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button1:
                setText();
                Log.d("hello","Hello World!");
                break;
            case R.id.button2:
                Log.d("asd", "hi");
                asd();
        }
    }

    private void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
