package com.zara.eastafricalistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toolbar;

public class CountriesFlag extends AppCompatActivity {
   Toolbar toolbar;
   ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries_flag);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        imageView = (ImageView) findViewById(R.id.image);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            toolbar.setTitle(bundle.getString("CountryName"));
            if(toolbar.getTitle().toString().equalsIgnoreCase("Rwanda")){
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.rwanda));
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Kenya")){
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.kenya));
            }
            else  if(toolbar.getTitle().toString().equalsIgnoreCase("Uganda")){
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.uganda));
            }
        }
    }
}