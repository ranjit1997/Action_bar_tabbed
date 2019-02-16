package com.example.ranjeet.action_bar_tabbed;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class daily_tips extends AppCompatActivity implements SensorEventListener, StepListener{
    private TextView textView ,TvSteps;
    private StepDetector simpleStepDetector;
    private SensorManager sensorManager;
    private Sensor accel;
    private Button BtnStart,BtnStop;
    private static final String TEXT_NUM_STEPS = "Steps: ";
    private int numSteps;
    GridView gridview;
    ImageView IVProfile;

    public static String[] osNameList = {
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",
            "Android",
            "iOS",
            "Linux",
            "MacOS",
            "MS DOS",
            "Symbian",
            "Windows 10",
            "Windows XP",

    };

    public static int[] osImages = {
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
            R.mipmap.android,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_tips);

        gridview = (GridView) findViewById(R.id.customgrid5);
        gridview.setAdapter(new CustomAdapter(daily_tips.this, osNameList, osImages));

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        accel = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        simpleStepDetector = new StepDetector();
        simpleStepDetector.registerListener(this);

        TvSteps = (TextView) findViewById(R.id.tv_steps);
        BtnStart = (Button) findViewById(R.id.btn_start);
        BtnStop = (Button) findViewById(R.id.btn_stop);



        BtnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                numSteps = 0;
                sensorManager.registerListener(daily_tips.this, accel, SensorManager.SENSOR_DELAY_FASTEST);

            }
        });
        BtnStop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                sensorManager.unregisterListener(daily_tips.this);

            }
        });
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            simpleStepDetector.updateAccel(
                    event.timestamp, event.values[0], event.values[1], event.values[2]);
        }
    }

    @Override
    public void step(long timeNs) {
        numSteps++;
        TvSteps.setText(TEXT_NUM_STEPS + numSteps);
    }

}
