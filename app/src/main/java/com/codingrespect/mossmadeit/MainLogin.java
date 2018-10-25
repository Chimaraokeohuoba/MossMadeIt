package com.codingrespect.mossmadeit;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainLogin extends AppCompatActivity {

    TextView heading;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        Typeface buttonTypeface = Typeface.createFromAsset(getAssets(),"fonts/BankGthL.ttf");
        heading = (TextView)findViewById(R.id.loginheader);
        btnLogin = (Button)findViewById(R.id.btnsignin);
        heading.setTypeface(buttonTypeface);
        btnLogin.setTypeface(buttonTypeface);
    }
}
