package com.example.student.bmecapapplication;

/**
 * Created by Charles  Pritchett on 2/20/2018.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ImageCaptureActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_image_capture);

        Button btnCamera = (Button)findViewById(R.id.btnCamera);
    }
}
