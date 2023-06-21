package com.example.surveyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class SurveyActivity extends AppCompatActivity {
    private LinearLayout optionsLinear;
    private EditText surveyQ, option1,option2,option3;
    private String surveyQST, option1ST,option2ST,option3ST;
    private RadioGroup radioGroup;
    private Button doneBtn, otherSurveysBtn;
    private float qType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        optionsLinear = findViewById(R.id.optionsLinear);
        surveyQ = findViewById(R.id.surveyQ);
        radioGroup = findViewById(R.id.radioG);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        doneBtn = findViewById(R.id.done);
        otherSurveysBtn = findViewById(R.id.otherSurveys);


        surveyQST = surveyQ.getText().toString();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                qType = radioGroup.getCheckedRadioButtonId();
                if ( qType == R.id.selectionsId ){
                    optionsLinear.setVisibility(View.VISIBLE);
                }
                else optionsLinear.setVisibility(View.GONE);
            }
        });


        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SurveyActivity.this , otherSurveys.class);
                if ( qType == R.id.selectionsId ){
                    option1ST = option1.getText().toString();
                    option2ST = option2.getText().toString();
                    option3ST = option3.getText().toString();
                    intent.putExtra("option1",option1ST);
                    intent.putExtra("option2",option2ST);
                    intent.putExtra("option3",option3ST);
                }
                intent.putExtra("type",qType);
                intent.putExtra("survey",surveyQST);
                startActivity(intent);
            }
        });

        otherSurveysBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SurveyActivity.this , otherSurveys.class);
                startActivity(intent);
            }
        });

    }

}