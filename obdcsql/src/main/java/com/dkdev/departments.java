package com.dkdev;

public class departments {

  //CREACION DE CLASE PARA ALMACENAR INFORMACIÓN DE LA TABLA DEPARTMENTS DE BD HR
  private Integer id;
  private String name;
  private Integer locationId;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getLocationId() {
    return locationId;
  }
  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }
  @Override
  public String toString() {
    return "departments [id=" + id + ", locationId=" + locationId + ", name=" + name + "]";
  }

  
}
