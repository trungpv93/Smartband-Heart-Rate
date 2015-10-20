package com.trungpv.smartbandheartrate.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.trungpv.smartbandheartrate.R;

public class MainActivity extends AppCompatActivity {
   // Button _btn_register;
    /**Variable check is login to app*/
    private boolean isLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tinhvv set isLogin = true
        //isLogin = true;
        //check login to app
        if(!isLogin){
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivityForResult(intent, 0);
            finish();
        }
//        //register button
//        _btn_register = (Button) findViewById(R.id.btn_register);
//        _btn_register.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // Start the Signup activity
//                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
//                startActivityForResult(intent, 0);
//                finish();
//            }
//        });
    }
}
