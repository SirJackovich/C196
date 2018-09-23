package com.example.sirjackovich.c196;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
  private static final int DATABASE_VERSION = 1;
  private static final String DATABASE_NAME = "C196";

  public DatabaseHelper(Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
  }

  @Override
  public void onCreate(SQLiteDatabase database) {
    database.execSQL("create table Assessments ( " +
      "assessmentID integer primary key autoincrement, " +
      "type text not null, " +
      "title text not null, " +
      "dueDate text not null);");
  }

  @Override
  public void onUpgrade(SQLiteDatabase database, int i, int i1) {
    database.execSQL("drop table if exists Assessments");
    onCreate(database);
  }
}
