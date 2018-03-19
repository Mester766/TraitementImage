package com.example.martin.traitementimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ivOne,ivTwo;
    int numImage;
    TextView tvProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivOne = (ImageView) findViewById(R.id.imageOne);
        ivTwo = (ImageView) findViewById(R.id.imageTwo);
        tvProgress = (TextView) findViewById(R.id.tvComputationProgress);
        numImage = 1;
    }

    protected void changeImage(View v)
    {
        numImage++;
        if ( numImage >= 13 ) numImage = 1;
        int imageID = getResources().getIdentifier("image"+numImage,"drawable",getPackageName());
        ivTwo.setImageResource(imageID);

    }

    protected void processImage(View v)
    {

    }
}
