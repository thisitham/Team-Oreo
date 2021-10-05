package com.dhruva.shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {

    Button btnWith;
    TextView text_feedback3;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        btnWith=(Button)findViewById(R.id.With);
        btnWith.setOnClickListener((v) ->{
            startActivity(new Intent(Feedback.this,Contact_Us.class));
        });

        getSupportActionBar().setTitle("FOODIE Feedback");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        text_feedback3 = findViewById(R.id.text_feedback3);
        ratingBar = findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if (v == 0)
                {
                    text_feedback3.setText("Very Dissatisfied");
                }

                else if (v == 1)
                {
                    text_feedback3.setText("Dissatisfied");
                }

                else if (v == 2 || v == 3)
                {
                    text_feedback3.setText("Ok");
                }

                else if (v == 4)
                {
                    text_feedback3.setText("Satisfied");
                }

                else if (v == 5)
                {
                    text_feedback3.setText("Very Satisfied");
                }

                else
                {

                }

            }
        });
    }


}