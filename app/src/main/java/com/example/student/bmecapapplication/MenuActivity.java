package com.example.student.bmecapapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu);

        Button imaging = (Button) findViewById(R.id.ImagingButton);
        Button options =   (Button) findViewById(R.id.OptionsButton);
        Button tutorials = (Button) findViewById(R.id.TutorialsButton);
        Button about = (Button) findViewById(R.id.AboutButton);
        Button QR = (Button) findViewById(R.id.QRButton);

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
                break;

            case R.id.OptionsButton:
                //go to "Options" option menu (Image editor?
                break;

            case R.id.TutorialsButton:
                //go to "Tutorials" option menu, relevant videos, how to use app?
                Intent tutorials = new Intent(this,  TutorialMenuActivity.class);
                startActivity(tutorials);
                break;
        }
    }
}
