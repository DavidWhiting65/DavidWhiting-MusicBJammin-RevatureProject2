package com.revature.controllers;



import com.revature.beans.Followers;
import com.revature.repositories.FollowersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/followers")
public class FollowersController {

  // not code or implementation for this
  // all methods come from the JpaRepository<T, ID>
  private FollowersRepo followersRepo;

  @Autowired
  public FollowersController(FollowersRepo musicianRepo) {
    this.followersRepo = musicianRepo;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping
  public List<Followers> getAllFollowers() {
    return followersRepo.findAll();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping(path="/{id}")
  public Followers getById(@PathVariable("id") int id) {return followersRepo.getById(id);}

  @CrossOrigin(origins = "http://localhost:4200")
  @PostMapping(consumes = "application/json", produces = "application/json")
  public Followers addFollowers(@RequestBody Followers followers) {
    return followersRepo.save(followers);
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @PutMapping(path="/{id}")
  public void updateFollowers(@PathVariable("id") int id, @RequestBody Followers followers) {
    if ( id == followers.getFollowers_id()) {
      followersRepo.save(followers);
    }
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @DeleteMapping(path="/{id}")
  public void deleteFollowers(@PathVariable("id") int id) {
    followersRepo.delete(followersRepo.getById(id));
  }
}
