package com.example.fbfindme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SelectMap extends AppCompatActivity {

    public Button mCurrentLocation,mFriendsLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_map);
       mCurrentLocation=findViewById(R.id.My_Location);
       mFriendsLocation=findViewById(R.id.Friends_Location);

        mCurrentLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(SelectMap.this,"Current location",Toast.LENGTH_SHORT).show();
                Intent myIntent=new Intent(SelectMap.this,MapsActivity.class);
                startActivity(myIntent);
            }
        });

        mFriendsLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SelectMap.this,"Friends location",Toast.LENGTH_SHORT).show();
                Intent myIntent=new Intent(SelectMap.this,MapsActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
