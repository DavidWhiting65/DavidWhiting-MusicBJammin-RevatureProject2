package com.revature.beans;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="posts")
public class Posts {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer post_id;
    private Integer user_id;
    private String post;
    private Date post_date;
    private Boolean flagged;

    public Posts(){

        super();
    }

    public Posts(Integer post_id, Integer user_id, String post, Date post_date, Boolean flagged) {
        this.post_id = post_id;
        this.user_id = user_id;
        this.post = post;
        this.post_date = post_date;
        this.flagged = flagged;
    }


    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }
}
