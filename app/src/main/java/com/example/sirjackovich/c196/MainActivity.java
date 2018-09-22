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

    // Create an Intent to start the activity
    Intent termsIntent = new Intent(this, TermsActivity.class);

    // Start the new activity.
    startActivity(termsIntent);
  }

  public void showCourses(View view) {

    // Create an Intent to start the activity
    Intent coursesIntent = new Intent(this, CoursesActivity.class);

    // Start the new activity.
    startActivity(coursesIntent);
  }

  public void showAssessments(View view) {

    // Create an Intent to start the activity
    Intent assessmentsIntent = new Intent(this, AssessmentsActivity.class);

    // Start the new activity.
    startActivity(assessmentsIntent);
  }

  public void showMentors(View view) {

    // Create an Intent to start the activity
    Intent mentorsIntent = new Intent(this, MentorsActivity.class);

    // Start the new activity.
    startActivity(mentorsIntent);
  }
}
