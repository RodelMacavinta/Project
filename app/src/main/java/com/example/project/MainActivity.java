package com.example.project;

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


    public void process (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.Enter) {
            i = new Intent(this, Enter.class);
            startActivity(i);
        }

        else if (v.getId() == R.id.snackbar){
            i = new Intent(this, snackbar.class);
            startActivity(i);
        }

        else if (v.getId() == R.id.toast){
            i = new Intent(this, toast.class);
            startActivity(i);
        }

        else if(v.getId() == R.id.close){
            finish();

        }

    }
}
