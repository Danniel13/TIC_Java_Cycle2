package com.dkdev;

public class jobs {
  private Integer id;
  private String title;
  private double minSalary;
  private double maxSalary;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public double getMinSalary() {
    return minSalary;
  }
  public void setMinSalary(double minSalary) {
    this.minSalary = minSalary;
  }
  public double getMaxSalary() {
    return maxSalary;
  }
  public void setMaxSalary(double maxSalary) {
    this.maxSalary = maxSalary;
  }
  @Override
  public String toString() {
    return "jobs [id=" + id + ", maxSalary=" + maxSalary + ", minSalary=" + minSalary + ", title=" + title + "]";
  }


    
}
