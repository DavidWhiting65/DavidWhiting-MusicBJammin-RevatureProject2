package com.revature.controllers;


import com.revature.beans.Playlist;
import com.revature.repositories.PlaylistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/playlists")
public class PlaylistController {

  // not code or implementation for this
  // all methods come from the JpaRepository<T, ID>
  private PlaylistRepo playlistRepo;

  @Autowired
  public PlaylistController(PlaylistRepo playlistRepo) {
    this.playlistRepo = playlistRepo;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping
  public List<Playlist> getAllPlaylists() {
    return playlistRepo.findAll();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping(path="/{id}")
  public Playlist getById(@PathVariable("id") int id) {return playlistRepo.getById(id);}

  @CrossOrigin(origins = "http://localhost:4200")
  @PostMapping(consumes = "application/json", produces = "application/json")
  public Playlist addPlaylist(@RequestBody Playlist playlist) {
    return playlistRepo.save(playlist);
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @PutMapping(path="/{id}")
  public void updatePlaylist(@PathVariable("id") int id, @RequestBody Playlist playlist) {
    if ( id == playlist.getPlaylist_id()) {
      playlistRepo.save(playlist);
    }
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @DeleteMapping(path="/{id}")
  public void deletePlaylist(@PathVariable("id") int id) {
    playlistRepo.delete(playlistRepo.getById(id));
  }
}
