package com.revature.beans;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="musicians")
public class Musician {

    // Instance Variables

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer musician_id; // Wrapper Class - making a primitive object-like so that we can work with it (int -> Integer)

    @Column
    private Integer musicians_table_id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;


    // Constructors
    public Musician() {

    }

    public Musician(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Musician(Integer id, Integer musician_id, String firstName, String lastName) {
        this.musicians_table_id = id;
        this.musician_id = musician_id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters - methods to interact with private fields in a class
    public Integer getId() { // author.getId();
        return this.musicians_table_id;
    }

    public void setId(Integer id) { // author.setId(10);
        this.musicians_table_id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  public Integer getMusician_id() { return musician_id; }

  public void setMusician_id(Integer musician_id) { this.musician_id = musician_id; }

  @Override
  public String toString() {
    return "Musician{" +
      "musicians_table_id=" + musicians_table_id +
      ", musician_id=" + musician_id +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Musician)) return false;
    Musician musician = (Musician) o;
    return musicians_table_id.equals(musician.musicians_table_id) && getMusician_id().equals(musician.getMusician_id()) && getFirstName().equals(musician.getFirstName()) && getLastName().equals(musician.getLastName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(musicians_table_id, getMusician_id(), getFirstName(), getLastName());
  }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Musician musician = (Musician) o;

        if (musicians_table_id != null ? !musicians_table_id.equals(musician.musicians_table_id) : musician.musicians_table_id != null) return false;
        if (firstName != null ? !firstName.equals(musician.firstName) : musician.firstName != null) return false;
        return lastName != null ? lastName.equals(musician.lastName) : musician.lastName == null;
    }*/
/*


    @Override
    public int hashCode() {
        int result = musicians_table_id != null ? musicians_table_id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }*/
}
