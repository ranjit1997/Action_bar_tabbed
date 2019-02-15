package com.example.ranjeet.action_bar_tabbed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_page extends AppCompatActivity {

    Button getStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        getStarted = (Button)findViewById(R.id.getStarted);

        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(First_page.this,Services.class);
                startActivity(intent);
            }
        });

    }
}
