package com.rozadin.makettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.zip.Inflater;

public class ArendatorMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arendator_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.Menu_item_1:
                return true;
            case R.id.Menu_item_2:
                return true;
            case R.id.Menu_item_3:
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }
}
