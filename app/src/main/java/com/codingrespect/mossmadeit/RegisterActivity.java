package com.codingrespect.mossmadeit;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView heading;
    TextView btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Typeface buttonTypeface = Typeface.createFromAsset(getAssets(),"fonts/BankGthL.ttf");
        heading = (TextView)findViewById(R.id.register_heading);
        btnRegister = (TextView)findViewById(R.id.regButton);
        heading.setTypeface(buttonTypeface);
        btnRegister.setTypeface(buttonTypeface);

    }
}
