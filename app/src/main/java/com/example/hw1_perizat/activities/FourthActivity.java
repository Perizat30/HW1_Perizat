package com.example.hw1_perizat.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hw1_perizat.R;

public class FourthActivity extends AppCompatActivity {
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        findViews();
        getTextFromIntent();
    }

    private void findViews() {
        textview =findViewById(R.id.text_view);
    }

    private void getTextFromIntent() {
        String genderFromThirdActivity=getIntent().getStringExtra("gender");
        System.out.println(genderFromThirdActivity);
        textview.setText(genderFromThirdActivity);
    }

}