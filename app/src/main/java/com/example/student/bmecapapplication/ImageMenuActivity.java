package com.example.student.bmecapapplication;

/**
 * Created by Charles Pritchett on 2/19/2018.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImageMenuActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_image_menu);


        Button heatmapGen = (Button) findViewById(R.id.HeatmapGenButton);
        Button prevImages = (Button) findViewById(R.id.PrevImageButton);


        heatmapGen.setOnClickListener(this);
        prevImages.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.PrevImageButton:
                //Go to saved images stored in R.Cycler view
                Intent image = new Intent(this, SavedScrollActivity.class);
                startActivity(image);
        }
    }
}
