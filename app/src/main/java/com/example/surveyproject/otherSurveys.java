package com.example.surveyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class otherSurveys extends AppCompatActivity {
    private String surveyQST;
    private String option1ST;
    private String option2ST;
    private String option3ST;
    private float qType;
    private ListView listView;
    private ListViewAdapter listViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_surveys);

        Intent intent = getIntent();
        surveyQST = intent.getExtras().getString("survey");
        qType = intent.getFloatExtra("type",-1);
        if( qType == R.id.selectionsId){
            option1ST = intent.getExtras().getString("option1");
            option2ST = intent.getExtras().getString("option2");
            option3ST = intent.getExtras().getString("option3");
        }

        listView = findViewById(R.id.lv);

        listViewAdapter = new ListViewAdapter(otherSurveys.this,R.layout.survey_design,listView);
        listView.setAdapter(listViewAdapter);


    }
}