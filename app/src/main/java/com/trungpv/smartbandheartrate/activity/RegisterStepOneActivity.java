package com.trungpv.smartbandheartrate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.trungpv.smartbandheartrate.R;

public class RegisterStepOneActivity extends AppCompatActivity {
    Button _btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step_one);

        //Login Button
        _btn_login = (Button) findViewById(R.id.btn_login);
        _btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivityForResult(intent, 0);
                finish();
            }
        });
    }
}
