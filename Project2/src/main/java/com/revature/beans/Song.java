package com.revature.beans;

import javax.persistence.*;

@Entity
@Table(name="songs")
public class Song {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer song_id;
    private String title;
    private Integer likes;
    private Integer dislikes;
    private Integer musician_id;
    private String url;


    @ManyToOne
    @JoinColumn(name = "musician_id", insertable = false, updatable = false)
    private Musician musician;

    public Song() {
    }

    public Song(String title, Musician musician) {
        this.title = title;
        this.musician = musician;
    }

    public Song(Integer id, String title, Musician musician) {
        this.song_id = id;
        this.title = title;
        this.musician = musician;
    }

    public Integer getId() {
        return song_id;
    }

    public void setId(Integer id) {
        this.song_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Musician getMusician() {
        return musician;
    }

    public void setMusician(Musician musician) {
        this.musician = musician;
    }

    public Integer getLikes() {return likes;}

    public void setLikes(Integer likes) {this.likes = likes;}

    public Integer getDislikes() {return dislikes;}

    public void setDislikes(Integer dislikes) {this.dislikes = dislikes;}

    public Integer getMusician_id() {return musician_id;}

    public void setMusician_id(Integer musician_id) {this.musician_id = musician_id;}

    public String getUrl() {return url;}

    public void setUrl(String url) {this.url = url;}

  @Override
  public String toString() {
    return "Song{" +
      "song_id=" + song_id +
      ", title='" + title + '\'' +
      ", likes=" + likes +
      ", dislikes=" + dislikes +
      ", musician_id=" + musician_id +
      ", url='" + url + '\'' +
      '}';
  }

  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (song_id != null ? !song_id.equals(song.song_id) : song.song_id != null) return false;
        if (title != null ? !title.equals(song.title) : song.title != null) return false;
        return musician != null ? musician.equals(song.musician) : song.musician == null;
    }

    @Override
    public int hashCode() {
        int result = song_id != null ? song_id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (musician != null ? musician.hashCode() : 0);
        return result;
    }
}
