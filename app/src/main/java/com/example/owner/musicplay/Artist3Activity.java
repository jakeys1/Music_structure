package com.example.owner.musicplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Artist3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist3);

        ArrayList<String> tank = new ArrayList<String>();
        tank.add("Marvin Got Shot");
        tank.add("I don't ever lose");
        tank.add("Imma be tha very best");
        tank.add("Rolling with Ben and Luke");

        LinearLayout tankList = (LinearLayout)findViewById(R.id.tank);

        int i = 0;
        while(i < tank.size()){
            TextView tankView = new TextView(this);
            tankView.setText(tank.get(i));
            tankList.addView(tankView);
            i++;
        }
    }
}
