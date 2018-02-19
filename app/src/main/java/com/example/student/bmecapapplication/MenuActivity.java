package com.example.student.bmecapapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    Button imaging = (Button) findViewById(R.id.ImagingButton);
    Button options =   (Button) findViewById(R.id.OptionsButton);
    Button tutorials = (Button) findViewById(R.id.TutorialsButton);
    Button about = (Button) findViewById(R.id.OptionsButton);
    Button QR = (Button) findViewById(R.id.QRButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imaging.setOnClickListener(this);
        options.setOnClickListener(this);
        tutorials.setOnClickListener(this);
        about.setOnClickListener(this);
        QR.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ImagingButton:
                //go to "Imaging" option menu (to gen or look at heatmaps)
                Intent image = new Intent(this, ImageMenuActivity.class);
                startActivity(image);
        }
    }
}
