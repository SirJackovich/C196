package com.example.sirjackovich.c196;

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
  Context mContext;
  LayoutInflater inflater;
  List<Assessment> Assessmentlist;
  ArrayList<Assessment> arrayList;

  //constructor
  public ListViewAdapter(Context context, List<Assessment> Assessmentlist) {
    mContext = context;
    this.Assessmentlist = Assessmentlist;
    inflater = LayoutInflater.from(mContext);
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

//    //listview item clicks
//    view.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View view) {
//        //code later
//        if (Assessmentlist.get(postition).getTitle().equals("Battery")){
//          //start NewActivity with title for actionbar and text for textview
//          Intent intent = new Intent(mContext, NewActivity.class);
//          intent.putExtra("actionBarTitle", "Battery");
//          intent.putExtra("contentTv", "This is Battery detail...");
//          mContext.startActivity(intent);
//        }
//        if (Assessmentlist.get(postition).getTitle().equals("Cpu")){
//          //start NewActivity with title for actionbar and text for textview
//          Intent intent = new Intent(mContext, NewActivity.class);
//          intent.putExtra("actionBarTitle", "Cpu");
//          intent.putExtra("contentTv", "This is Cpu detail...");
//          mContext.startActivity(intent);
//        }
//        if (Assessmentlist.get(postition).getTitle().equals("Display")){
//          //start NewActivity with title for actionbar and text for textview
//          Intent intent = new Intent(mContext, NewActivity.class);
//          intent.putExtra("actionBarTitle", "Display");
//          intent.putExtra("contentTv", "This is Display detail...");
//          mContext.startActivity(intent);
//        }
//        if (Assessmentlist.get(postition).getTitle().equals("Memory")){
//          //start NewActivity with title for actionbar and text for textview
//          Intent intent = new Intent(mContext, NewActivity.class);
//          intent.putExtra("actionBarTitle", "Memory");
//          intent.putExtra("contentTv", "This is Memory detail...");
//          mContext.startActivity(intent);
//        }
//        if (Assessmentlist.get(postition).getTitle().equals("Sensor")){
//          //start NewActivity with title for actionbar and text for textview
//          Intent intent = new Intent(mContext, NewActivity.class);
//          intent.putExtra("actionBarTitle", "Sensor");
//          intent.putExtra("contentTv", "This is Sensor detail...");
//          mContext.startActivity(intent);
//        }
//      }
//    });


    return view;
  }

}

