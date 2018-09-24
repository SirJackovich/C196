package com.example.sirjackovich.c196;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


public class AssessmentsDetailsActivity extends AppCompatActivity  {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_assessments_details);

    ActionBar actionBar = getSupportActionBar();
    actionBar.setTitle("Assessment Details");

    // Setup the spinner
    Spinner spinner = (Spinner) findViewById(R.id.type_spinner);
    // Create an ArrayAdapter using the string array and a default spinner layout
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
      R.array.assessment_types, android.R.layout.simple_spinner_item);
    // Specify the layout to use when the list of choices appears
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    // Apply the adapter to the spinner
    spinner.setAdapter(adapter);

    String titleString = getIntent().getStringExtra("title");
    EditText title = findViewById(R.id.title_edit_text);
    title.setText(titleString);
  }

  public void handleCancel(View view){
    onBackPressed();
  }

  public void handleSave(View view){
    Spinner spinner = findViewById(R.id.type_spinner);
    EditText title = findViewById(R.id.title_edit_text);
    EditText dueDate = findViewById(R.id.due_date_edit_text);

    Intent intent = new Intent();
    intent.putExtra("type", spinner.getSelectedItem().toString());
    intent.putExtra("title", title.getText().toString());
    intent.putExtra("dueDate", dueDate.getText().toString());
    setResult(RESULT_OK, intent);
    finish();
  }
}
