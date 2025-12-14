package com.example.myapplication.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView tv = findViewById(R.id.tvtv);
        EditText et_email = findViewById(R.id.idid);
        EditText et_password = findViewById(R.id.ididid);
        Button bt_ok = findViewById(R.id.ok);
        Button bt_cancel = findViewById(R.id.cancel);
        ImageView im= findViewById(R.id.im);

        tv.setText("Login");
        tv.setTextColor(R.color.black);
        tv.setTextSize(18f);
        tv.setPadding(15,20,15,20);
        et_email.setBackgroundColor(R.color.black);
        et_email.setHintTextColor(R.color.black);
        et_email.setActivated(true);
        im.setImageResource(R.drawable.home);

        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tv.setText("HELLO USER");
               im.setImageResource(R.drawable.android);
               String r= String.valueOf(et_email.getText());
               tv.setText(r);
                String a= String.valueOf(et_password.getText());
                tv.setText(a);

            }
        });

        bt_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,"Sorry , you must enter your email and password",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity2.this,"Hello",Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity2.this, "Welcome", Toast.LENGTH_SHORT).show();

            }
        });

        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this, Login.class);
                startActivity(i);

            }
        });
    }
}