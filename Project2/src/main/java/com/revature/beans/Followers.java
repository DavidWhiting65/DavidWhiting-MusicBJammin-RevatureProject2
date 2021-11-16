package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="followers")
public class Followers {


  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer followers_id;
    private Integer fans_id;
    private Integer musicians_id;


    public Followers(){

        super();
    }



    public Followers(Integer followers_id, Integer fans_id, Integer musicians_id) {
        this.followers_id = followers_id;
        this.fans_id = fans_id;
        this.musicians_id = musicians_id;
    }


    public Integer getFollowers_id() {
        return followers_id;
    }

    public void setFollowers_id(Integer followers_id) {
        this.followers_id = followers_id;
    }

    /*public Integer getUser_id() {
        return followers_id;
    }

    public void setUser_id(Integer fans_id) {
        this.followers_id = fans_id;
    }*/

    public Integer getMusicians_id() {
        return musicians_id;
    }

    public void setMusicians_id(Integer musicians_id) {
        this.musicians_id = musicians_id;
    }

  public Integer getFans_id() {
    return fans_id;
  }

  public void setFans_id(Integer fans_id) {
    this.fans_id = fans_id;
  }
}
