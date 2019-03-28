package com.rozadin.makettest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick_Arendator(View view) {
        Intent intent = new Intent(this,phone_number.class);
        intent.putExtra("tenant or owner",true);
        startActivity(intent);
        this.finish();
    }

    public void onClick_Sobstvennik(View view) {
        Intent intent = new Intent(this,phone_number.class);
        intent.putExtra("tenant or owner",false);
        startActivity(intent);
        this.finish();
    }
}
