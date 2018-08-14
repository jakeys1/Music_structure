package com.example.owner.musicplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Artist2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist2);

        ArrayList<String> dumo = new ArrayList<String>();
        dumo.add("Or Is It");
        dumo.add("My Own Horse Enemy ");
        dumo.add("Not As Good As Before");
        dumo.add("Snow for you");

        LinearLayout dumoList = (LinearLayout)findViewById(R.id.dumo);

        int i = 0;
        while(i < dumo.size()){
            TextView dumoView = new TextView(this);
            dumoView.setText(dumo.get(i));
            dumoList.addView(dumoView);
            i++;
        }

    }
}
