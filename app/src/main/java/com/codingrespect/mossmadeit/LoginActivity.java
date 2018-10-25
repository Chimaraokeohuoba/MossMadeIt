package com.codingrespect.mossmadeit;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    Button regButton;
    TextView fbBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Typeface buttonTypface = Typeface.createFromAsset(getAssets(), "fonts/BankGthL.ttf");
        loginButton = (Button)findViewById(R.id.btnLogin);
        regButton = (Button)findViewById(R.id.btnRegister);
        fbBtn = (TextView)findViewById(R.id.fbbtn);
        loginButton.setTypeface(buttonTypface);
        regButton.setTypeface(buttonTypface);
        fbBtn.setTypeface(buttonTypface);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoginActivity.this, MainLogin.class);
                startActivity(loginIntent);
            }
        });
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });

    }
}
