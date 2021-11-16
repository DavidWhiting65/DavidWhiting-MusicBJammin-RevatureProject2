package com.revature.beans;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comments")
public class Comments {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer comments_id;
    private Integer user_id;
    private Integer post_id;
    private String comment;
    private Date comment_date;
    private Boolean flagged;



    public Comments(){

        super();
    }


    public Comments(Integer comments_id, Integer user_id, Integer post_id, String comment, Date comment_date, Boolean flagged) {
        this.comments_id = comments_id;
        this.user_id = user_id;
        this.post_id = post_id;
        this.comment = comment;
        this.comment_date = comment_date;
        this.flagged = flagged;
    }

    public Integer getComments_id() {
        return comments_id;
    }

    public void setComments_id(Integer comments_id) {
        this.comments_id = comments_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getComment_date() {
        return comment_date;
    }

    public void setComment_date(Date comment_date) {
        this.comment_date = comment_date;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }
}
