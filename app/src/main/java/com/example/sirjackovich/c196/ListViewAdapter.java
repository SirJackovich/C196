package com.example.sirjackovich.c196;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter{

  //variables
  Activity activity;
  LayoutInflater inflater;
  List<Assessment> Assessmentlist;
  ArrayList<Assessment> arrayList;

  //constructor
  public ListViewAdapter(Activity activity, List<Assessment> Assessmentlist) {
    this.activity = activity;
    this.Assessmentlist = Assessmentlist;
    inflater = LayoutInflater.from(activity);
    this.arrayList = new ArrayList<Assessment>();
    this.arrayList.addAll(Assessmentlist);
  }

  public class ViewHolder{
    TextView mTitleTv;
  }

  @Override
  public int getCount() {
    return Assessmentlist.size();
  }

  @Override
  public Object getItem(int i) {
    return Assessmentlist.get(i);
  }

  @Override
  public long getItemId(int i) {
    return i;
  }

  @Override
  public View getView(final int postition, View view, ViewGroup parent) {
    ViewHolder holder;
    if (view==null){
      holder = new ViewHolder();
      view = inflater.inflate(R.layout.row, null);

      //locate the views in row.xml
      holder.mTitleTv = view.findViewById(R.id.mainTitle);

      view.setTag(holder);

    }
    else {
      holder = (ViewHolder)view.getTag();
    }
    //set the results into textviews
    holder.mTitleTv.setText(Assessmentlist.get(postition).getTitle());

    //listview item clicks
    view.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        // Create an Intent to start the activity
        Intent intent = new Intent(activity, AssessmentsDetailsActivity.class);
        intent.putExtra("title", Assessmentlist.get(postition).getTitle());
        activity.startActivityForResult(intent, 1);
      }
    });


    return view;
  }
}

