package com.example.student.bmecapapplication;

/**
 * Created by Charles  Pritchett on 2/20/2018.
 */

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ImageCaptureActivity extends AppCompatActivity{


    ImageView  imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_image_capture);

        Button btnCamera = (Button)findViewById(R.id.btnCamera);
        imageView = (ImageView)findViewById(R.id.imageView);

        btnCamera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }

        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){

        //do things for when the picture is actually captured 
        super.onActivityResult(requestCode, resultCode, data);
        //displays taken image on imageview
        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        imageView.setImageBitmap(bitmap);
    }



}
