package com.example.owner.musicplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Artist1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist1);

        ArrayList<String> lilNard = new ArrayList<String>();
        lilNard.add("Nard's Anthem");
        lilNard.add("Home Chills");
        lilNard.add("Young and lovin' it");
        lilNard.add("Go Hard");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lilNard);

        ListView nardView = (ListView) findViewById(R.id.nard);

        nardView.setAdapter(itemsAdapter);

    }
   /* public void nardOnClick(View view){
        Intent nardOn = new Intent(this, Artist2Activity.class);
        startActivity(nardOn);
    }*/
}
