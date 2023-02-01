package com.example.hw1_perizat.activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.hw1_perizat.R;
import com.example.hw1_perizat.activities.FirstActivity;

public class SecondActivity extends AppCompatActivity {
    AppCompatButton second_button;
    EditText second_edittext;
    TextView second_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViews();
        getTextFromIntent();
        setOnClickListener();
    }

    private void findViews() {
        second_button=findViewById(R.id.button_view_second);
        second_edittext=findViewById(R.id.edit_text_age);
        second_textView=findViewById(R.id.text_view_second);
    }

    private void getTextFromIntent() {
        String nameFromFirstActivity= getIntent().getStringExtra("name");
        second_textView.setText(nameFromFirstActivity);
    }


    private void setOnClickListener() {
        second_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToThirdActivity();
            }
        });
    }

    private void navigateToThirdActivity() {
        Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);

        intent.putExtra("age",second_edittext.getText());
        startActivity(intent);
    }

}