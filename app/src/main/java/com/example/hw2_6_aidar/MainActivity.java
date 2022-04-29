package com.example.hw2_6_aidar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.btn_v);
        EditText editLog = findViewById(R.id.first_edit);
        EditText editPass = findViewById(R.id.second_edit);
        TextView textTop = findViewById(R.id.text_top);
        TextView textMiddle = findViewById(R.id.text_1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editLog.getText().toString().equals("admin")&& editPass.getText().toString()
                .equals("admin")){
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                    editLog.setVisibility(View.INVISIBLE);
                    editPass.setVisibility(View.INVISIBLE);
                    textTop.setVisibility(View.INVISIBLE);
                    textMiddle.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                }else{
                    Toast.makeText(MainActivity.this, "Не правильный логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }




}