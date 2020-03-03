package org.woehlke.bloodmoney;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public void showAllMeasurements(){
        setContentView(R.layout.activity_measurement_list);
    }

    public void addMeasurements(){
        setContentView(R.layout.activity_measurement_detail);
    }

    private Button showAllMeasurementsButton;
    private Button newMeasurement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.showAllMeasurementsButton = (Button) findViewById(R.id.showAllMeasurementsButton);
        this.newMeasurement = (Button) findViewById(R.id.newMeasurement);
        this.showAllMeasurementsButton.setOnClickListener(this);
        this.newMeasurement.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.showAllMeasurementsButton:
                showAllMeasurements();
                break;
            case R.id.newMeasurement:
                addMeasurements();
                break;
            default:

        }
    }
}
