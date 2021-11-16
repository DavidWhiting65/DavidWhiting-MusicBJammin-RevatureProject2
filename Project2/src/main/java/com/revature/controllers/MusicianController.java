package com.revature.controllers;

import com.revature.beans.Musician;
import com.revature.beans.Song;
import com.revature.repositories.MusicianRepo;
import com.revature.repositories.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/musicians")
public class MusicianController {

  // not code or implementation for this
  // all methods come from the JpaRepository<T, ID>
  private MusicianRepo musicianRepo;

  @Autowired
  public MusicianController(MusicianRepo musicianRepo) {
    this.musicianRepo = musicianRepo;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping
  public List<Musician> getAllMusicians() {
    return musicianRepo.findAll();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping(path="/{id}")
  public Musician getById(@PathVariable("id") int id) {return musicianRepo.getById(id);}

  @CrossOrigin(origins = "http://localhost:4200")
  @PostMapping(consumes = "application/json", produces = "application/json")
  public Musician addMusician(@RequestBody Musician musician) {
    return musicianRepo.save(musician);
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @PutMapping(path="/{id}")
  public void updateMusician(@PathVariable("id") int id, @RequestBody Musician musician) {
    if ( id == musician.getId()) {
      musicianRepo.save(musician);
    }
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @DeleteMapping(path="/{id}")
  public void deleteMusician(@PathVariable("id") int id) {
    musicianRepo.delete(musicianRepo.getById(id));
  }
}
