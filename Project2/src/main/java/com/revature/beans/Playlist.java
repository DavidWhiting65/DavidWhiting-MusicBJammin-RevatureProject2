package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="playlist")
public class Playlist {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer primary_id;
    private Integer user_id;
    private Integer song_id;
    private Integer playlist_id;
    private String playlist_name;




    public Playlist(){

        super();
    }

    public Playlist(Integer primary_id, Integer user_id, Integer song_id, Integer playlist_id, String playlist_name) {
        this.primary_id = primary_id;
        this.user_id = user_id;
        this.song_id = song_id;
        this.playlist_id = playlist_id;
        this.playlist_name = playlist_name;
    }


    public Integer getPrimary_id() {
        return primary_id;
    }

    public void setPrimary_id(Integer primary_id) {
        this.primary_id = primary_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getSong_id() {
        return song_id;
    }

    public void setSong_id(Integer song_id) {
        this.song_id = song_id;
    }

    public Integer getPlaylist_id() {
        return playlist_id;
    }

    public void setPlaylist_id(Integer playlist_id) {
        this.playlist_id = playlist_id;
    }

    public String getPlaylist_name() {
        return playlist_name;
    }

    public void setPlaylist_name(String playlist_name) {
        this.playlist_name = playlist_name;
    }
}
