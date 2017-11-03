package com.example.tom_d.myapplication;

import android.media.Image;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionProvider;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        i1 = findViewById(R.id.arms);
        i2 = findViewById(R.id.glasses);
        i3 = findViewById(R.id.ears);
        i4 = findViewById(R.id.eyes);
        i5 = findViewById(R.id.mouth);
        i6 = findViewById(R.id.nose);
        i7 = findViewById(R.id.mustache);
        i8 = findViewById(R.id.hat);
        i9 = findViewById(R.id.shoes);
        i10 = findViewById(R.id.eyebrows);

        c1 = findViewById(R.id.Arms);
        c2 = findViewById(R.id.Glasses);
        c3 = findViewById(R.id.Ears);
        c4 = findViewById(R.id.Eyes);
        c5 = findViewById(R.id.Mouth);
        c6 = findViewById(R.id.Nose);
        c7 = findViewById(R.id.Mustache);
        c8 = findViewById(R.id.Hat);
        c9 = findViewById(R.id.Shoes);
        c10 = findViewById(R.id.Eyebrows);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Image1",i1.getVisibility());
        outState.putInt("Image2",i2.getVisibility());
        outState.putInt("Image3",i3.getVisibility());
        outState.putInt("Image4",i4.getVisibility());
        outState.putInt("Image5",i5.getVisibility());
        outState.putInt("Image6",i6.getVisibility());
        outState.putInt("Image7",i7.getVisibility());
        outState.putInt("Image8",i8.getVisibility());
        outState.putInt("Image9",i9.getVisibility());
        outState.putInt("Image10",i10.getVisibility());

    }

    @Override
    protected void onRestoreInstanceState(Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);

        if (saveInstanceState.getInt("Image1") == 0) {
            i1.setVisibility(View.VISIBLE);
        }
            else {
                i2.setVisibility(View.INVISIBLE);
        }

        if (saveInstanceState.getInt("Image2") == 0) {
            i2.setVisibility(View.VISIBLE);
        }
            else {
                i2.setVisibility(View.INVISIBLE);
        }

        if (saveInstanceState.getInt("Image3") == 0) {
            i3.setVisibility(View.VISIBLE);
        }
            else {
                i3.setVisibility(View.INVISIBLE);
        }

        if (saveInstanceState.getInt("Image4") == 0) {
            i4.setVisibility(View.VISIBLE);
        }
            else {
                i4.setVisibility(View.INVISIBLE);
        }

        if (saveInstanceState.getInt("Image5") == 0) {
            i5.setVisibility(View.VISIBLE);
        }
        else {
            i5.setVisibility(View.INVISIBLE);
        }

        if (saveInstanceState.getInt("Image6") == 0) {
            i6.setVisibility(View.VISIBLE);
        }
        else {
            i6.setVisibility(View.INVISIBLE);
        }

        if (saveInstanceState.getInt("Image7") == 0) {
            i7.setVisibility(View.VISIBLE);
        }
        else {
            i7.setVisibility(View.INVISIBLE);
        }

        if (saveInstanceState.getInt("Image8") == 0) {
            i8.setVisibility(View.VISIBLE);
        }
        else {
            i8.setVisibility(View.INVISIBLE);
        }

        if (saveInstanceState.getInt("Image9") == 0) {
            i9.setVisibility(View.VISIBLE);
        }
        else {
            i9.setVisibility(View.INVISIBLE);
        }

        if (saveInstanceState.getInt("Image10") == 0) {
            i10.setVisibility(View.VISIBLE);
        }
        else {
            i10.setVisibility(View.INVISIBLE);
        }

    }

    public void c1Clicked(View v) {
        if (c1.isChecked())
            i1.setVisibility(View.VISIBLE);
            else
                i1.setVisibility(View.INVISIBLE);

    }
    public void c2Clicked(View v) {
        if (c2.isChecked())
            i2.setVisibility(View.VISIBLE);
        else
            i2.setVisibility(View.INVISIBLE);

    }

    public void c3Clicked(View v) {
        if (c3.isChecked())
            i3.setVisibility(View.VISIBLE);
        else
            i3.setVisibility(View.INVISIBLE);

    }

    public void c4Clicked(View v) {
        if (c4.isChecked())
            i4.setVisibility(View.VISIBLE);
        else
            i4.setVisibility(View.INVISIBLE);

    }

    public void c5Clicked(View v) {
        if (c5.isChecked())
            i5.setVisibility(View.VISIBLE);
        else
            i5.setVisibility(View.INVISIBLE);

    }

    public void c6Clicked(View v) {
        if (c6.isChecked())
            i6.setVisibility(View.VISIBLE);
        else
            i6.setVisibility(View.INVISIBLE);

    }

    public void c7Clicked(View v) {
        if (c7.isChecked())
            i7.setVisibility(View.VISIBLE);
        else
            i7.setVisibility(View.INVISIBLE);

    }

    public void c8Clicked(View v) {
        if (c8.isChecked())
            i8.setVisibility(View.VISIBLE);
        else
            i8.setVisibility(View.INVISIBLE);

    }

    public void c9Clicked(View v) {
        if (c9.isChecked())
            i9.setVisibility(View.VISIBLE);
        else
            i9.setVisibility(View.INVISIBLE);

    }

    public void c10Clicked(View v) {
        if (c10.isChecked())
            i10.setVisibility(View.VISIBLE);
        else
            i10.setVisibility(View.INVISIBLE);

    }


}


