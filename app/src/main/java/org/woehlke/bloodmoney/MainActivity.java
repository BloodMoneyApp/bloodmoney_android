package org.woehlke.bloodmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public void showAllMeasurements(){
        setContentView(R.layout.activity_measurement_list);
    }

    public void addMeasurements(){
        setContentView(R.layout.activity_measurement_detail);
    }


    public void onClick(){
        setContentView(R.layout.activity_measurement_list);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
