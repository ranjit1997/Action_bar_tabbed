package com.example.ranjeet.action_bar_tabbed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Services extends AppCompatActivity {

    RelativeLayout pregnancy, daily, personal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        pregnancy=findViewById(R.id.pregnancy);
        daily=findViewById(R.id.daily);
        personal=findViewById(R.id.personal);


        pregnancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Services.this,MainActivity.class);
                startActivity(intent);
            }
        });

        daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Services.this,daily_tips.class);
                startActivity(intent);
            }
        });


        personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Services.this,Normal_Disease.class);
                startActivity(intent);
            }
        });
    }

}
