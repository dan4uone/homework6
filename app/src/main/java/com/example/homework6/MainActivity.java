package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText, editText1;
    private TextView textView, textView1, textView2, textView3, textView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.gmail);
        editText1 = findViewById(R.id.password_access);
        textView = findViewById(R.id.whod);
        textView1 = findViewById(R.id.welcome);
        textView2 = findViewById(R.id.reg);
        textView3 = findViewById(R.id.Forget_password);
        textView4 = findViewById(R.id.click_me);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("admin@gmail.com") && editText1.getText().toString().equals("admin")) {
                    button.setVisibility(view.GONE);
                    editText.setVisibility(view.GONE);
                    textView2.setVisibility(view.GONE);
                    textView3.setVisibility(view.GONE);
                    textView4.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(MainActivity.this, "Не правильный логин или пароль", Toast.LENGTH_SHORT);
                }
                editText.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (editText.getText().toString().isEmpty()) {
    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.purple_200));
                        }
                        else {
                            button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));


                        }
                    }
                });
                editText1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (editText1.getText().toString().isEmpty()) {
                            button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.purple_200));
                        }
                        else {
                            button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));


                        }
                    }
                });


            }
        });

    }
}