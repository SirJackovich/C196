package com.example.sirjackovich.c196;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AssessmentsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_assessments);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        showAssessmentDetails(view);
      }
    });
  }

  public void showAssessmentDetails(View view) {

    // Create an Intent to start the activity
    Intent assessmentDetailsIntent = new Intent(this, AssessmentsDetailsActivity.class);

    // Start the new activity.
    startActivity(assessmentDetailsIntent);
  }

}
