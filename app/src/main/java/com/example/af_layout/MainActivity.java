package com.example.af_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View v){
        setContentView(R.layout.login_page);
    }

    public void Back_home(View v){
        setContentView(R.layout.activity_main);
    }

    public void OK(View v){
        setContentView(R.layout.main_page_artist);
    }

    public void Sign_up(View v){
        setContentView(R.layout.sign_up_page);
    }
}
