package com.example.sirjackovich.c196;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void showTerms(View view) {
    showActivity(TermsActivity.class);
  }

  public void showCourses(View view) {
    showActivity(CoursesActivity.class);
  }

  public void showAssessments(View view) {
    showActivity(AssessmentsActivity.class);
  }

  public void showMentors(View view) {
    showActivity(MentorsActivity.class);
  }

  public void showActivity(Class activityClass){
    // Create an Intent to start the activity
    Intent intent = new Intent(this, activityClass);

    // Start the new activity.
    startActivity(intent);
  }
}
