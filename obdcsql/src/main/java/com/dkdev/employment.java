package com.dkdev;

public class employment {
  private String last_name;
  private String date_contract;
  public String getLast_name() {
    return last_name;
  }
  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }
  public String getDate_contract() {
    return date_contract;
  }
  public void setDate_contract(String date_contract) {
    this.date_contract = date_contract;
  }

  
  @Override
  public String toString() {
    return "employment [date_contract=" + date_contract + ", last_name=" + last_name + "]";
  }


  
}
