package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = findViewById (R.id.name);
        Button one =  findViewById (R.id.button);
        Button two =  findViewById (R.id.button2);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name  = username.getText().toString();
                if (username.getText().toString().equals("Shaima")){
                Intent i = new Intent (MainActivity.this,MainActivity2.class);
                i.putExtra("data1",name);
                startActivity(i);
            }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name2  = username.getText().toString();
                if (username.getText().toString().equals("Shaima")){
                    Intent i = new Intent (MainActivity.this,MainActivity3.class);


                }
            }
        });
    }
}