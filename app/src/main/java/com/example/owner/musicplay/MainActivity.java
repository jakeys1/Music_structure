package com.example.owner.musicplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void artistTwoClick(View view){
        Intent artistTwo = new Intent(this, Artist2Activity.class);
        startActivity(artistTwo);
    }

    public void artistThreeClick(View view){
        Intent artistThree = new Intent(this, Artist3Activity.class);
        startActivity(artistThree);
    }
}