package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="fans")
public class Fans {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer fans_table_id;
    private Integer fan_id;
    private String first_name;
    private String last_name;


    public Fans() {
    }
  public Fans(Integer fans_table_id, Integer fan_id, String first_name, String last_name) {
    this.fans_table_id = fans_table_id;
    this.fan_id = fan_id;
    this.first_name = first_name;
    this.last_name = last_name;
  }

  public Integer getFans_table_id() {
    return fans_table_id;
  }

  public void setFans_table_id(Integer fans_table_id) {
    this.fans_table_id = fans_table_id;
  }

  public Integer getFan_id() {
    return fan_id;
  }

  public void setFan_id(Integer fan_id) {
    this.fan_id = fan_id;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }
}
