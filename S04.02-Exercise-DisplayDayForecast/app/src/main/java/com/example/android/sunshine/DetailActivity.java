package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    TextView mWeatherText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherText = (TextView) findViewById(R.id.tv_weather_text);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            String extraText = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);
            mWeatherText.setText(extraText);
        }
    }
}