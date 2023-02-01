package com.example.hw1_perizat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.example.hw1_perizat.R;

public class ThirdActivity extends AppCompatActivity {
    AppCompatButton third_button;
    EditText third_edittext;
    TextView third_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViews();
        getTextFromIntent();
        setOnClick();
    }

    private void findViews() {
        third_button=findViewById(R.id.button_view_third);
        third_edittext=findViewById(R.id.edit_text_gender);
        third_textView=findViewById(R.id.text_view_third);
    }

    private void getTextFromIntent() {
        Integer ageFromSecondActivity=getIntent().getIntExtra("age",0);
        third_textView.setText(ageFromSecondActivity.toString());
    }

    private void setOnClick() {
        third_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToFourthActivity();
            }
        });

    }

    private void navigateToFourthActivity() {
        Intent intent=new Intent(ThirdActivity.this,FourthActivity.class);
        intent.putExtra("gender",third_edittext.getText().toString());
        startActivity(intent);
    }
}