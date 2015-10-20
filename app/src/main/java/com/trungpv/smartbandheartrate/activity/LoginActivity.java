package com.trungpv.smartbandheartrate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.trungpv.smartbandheartrate.R;

public class LoginActivity extends AppCompatActivity {
    Button _btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //register button
        _btn_register = (Button) findViewById(R.id.btn_register);
        _btn_register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Start the Signup activity
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivityForResult(intent, 0);
                finish();
            }
        });
    }
}
