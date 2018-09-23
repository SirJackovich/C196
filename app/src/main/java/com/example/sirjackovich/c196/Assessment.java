package com.example.sirjackovich.c196;

public class Assessment {
  private int assessmentID;
  private String type;
  private String title;
  private String dueDate;

  public Assessment(){
  }

  public Assessment(String title){
    this.title = title;
  }

  public int getAssessmentID(){
    return assessmentID;
  }

  public void setType(String type){
    this.type = type;
  }

  public String getType(){
    return type;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public String getTitle(){
    return title;
  }

  public void setDueDate(String dueDate){
    this.dueDate = dueDate;
  }

  public String getDueDate(){
    return dueDate;
  }
}
