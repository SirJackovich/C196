package com.example.sirjackovich.c196;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class AssessmentsDetailsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_assessments_details);

    // Setup the spinner
    Spinner spinner = (Spinner) findViewById(R.id.type_spinner);
    spinner.setOnItemSelectedListener(this);
    // Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
      R.array.assessment_types, android.R.layout.simple_spinner_item);
    // Specify the layout to use when the list of choices appears
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    // Apply the adapter to the spinner
    spinner.setAdapter(adapter);
  }

  public void onItemSelected(AdapterView<?> parent, View view,
                             int pos, long id) {
    // An item was selected. You can retrieve the selected item using
    // parent.getItemAtPosition(pos)
  }

  public void onNothingSelected(AdapterView<?> parent) {
    // Another interface callback
  }

  public void handleCancel(View view){
    onBackPressed();
  }
}
