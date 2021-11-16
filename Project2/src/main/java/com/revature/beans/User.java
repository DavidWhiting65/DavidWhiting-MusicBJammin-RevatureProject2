package com.revature.beans;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer user_id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private Integer user_type_id;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(Integer user_id, String username, String password) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
    }

  public User(Integer user_id, String first_name, String last_name, String username, String password, Integer user_type_id) {
    this.user_id = user_id;
    this.first_name = first_name;
    this.last_name = last_name;
    this.username = username;
    this.password = password;
    this.user_type_id = user_type_id;
  }

  public Integer getUserId() {
        return user_id;
    }

    public void setUserId(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(Integer user_type_id) {
        this.user_type_id = user_type_id;
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

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", user_type_id=" + user_type_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User)) return false;
    User user = (User) o;
    return Objects.equals(user_id, user.user_id) && Objects.equals(getFirst_name(), user.getFirst_name()) && Objects.equals(getLast_name(), user.getLast_name()) && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getUser_type_id(), user.getUser_type_id());
  }

  @Override
  public int hashCode() {
    return Objects.hash(user_id, getFirst_name(), getLast_name(), getUsername(), getPassword(), getUser_type_id());
  }
}
