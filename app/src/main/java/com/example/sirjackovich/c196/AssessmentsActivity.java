package com.example.sirjackovich.c196;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import android.content.ClipData;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AssessmentsActivity extends AppCompatActivity {
  ListView listView;
  ListViewAdapter adapter;
  String[] title;
  String[] description;
  int[] icon;
  ArrayList<Assessment> arrayList = new ArrayList<>();

  @RequiresApi(api = Build.VERSION_CODES.O)
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_assessments);
    ActionBar actionBar = getSupportActionBar();
    actionBar.setTitle("Assessments");

    title = new String[]{"Battery", "Cpu", "Display", "Memory", "Sensor"};

    listView = findViewById(R.id.listView);

    for (int i =0; i<title.length; i++){
      Assessment Assessment = new Assessment(title[i]);
      //bind all strings in an array
      arrayList.add(Assessment);
    }

    //pass results to listViewAdapter class
    adapter = new ListViewAdapter(this, arrayList);

    //bind the adapter to the listview
    listView.setAdapter(adapter);
  }

  public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == 1) {
      if(resultCode == RESULT_OK) {
        String title = data.getStringExtra("title");
        String type = data.getStringExtra("type");
        String dueDate = data.getStringExtra("dueDate");
        Assessment assessment = new Assessment();
        assessment.setDueDate(dueDate);
        assessment.setTitle(title);
        assessment.setType(type);
        listView = findViewById(R.id.listView);
        // add assessment to a list
        arrayList.add(assessment);
        //pass results to listViewAdapter class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);
      }
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    super.onCreateOptionsMenu(menu);
    getMenuInflater().inflate(R.menu.menu, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case R.id.action_create:
        // Create an Intent to start the activity
        Intent assessmentDetailsIntent = new Intent(this, AssessmentsDetailsActivity.class);

        startActivityForResult(assessmentDetailsIntent, 1);
        return true;

      default:
        return super.onOptionsItemSelected(item);
    }
  }

}
