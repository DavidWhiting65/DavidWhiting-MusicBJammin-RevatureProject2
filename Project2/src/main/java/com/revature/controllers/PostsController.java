package com.revature.controllers;


import com.revature.beans.Posts;
import com.revature.repositories.PostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/posts")
public class PostsController {

  // not code or implementation for this
  // all methods come from the JpaRepository<T, ID>
  private PostsRepo postsRepo;

  @Autowired
  public PostsController( PostsRepo musicianRepo) {
    this.postsRepo = musicianRepo;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping
  public List<Posts> getAllPosts() {
    return  postsRepo.findAll();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping(path="/{id}")
  public Posts getById(@PathVariable("id") int id) {return  postsRepo.getById(id);}

  @CrossOrigin(origins = "http://localhost:4200")
  @PostMapping(consumes = "application/json", produces = "application/json")
  public Posts addPosts(@RequestBody Posts posts) {
    return  postsRepo.save(posts);
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @PutMapping(path="/{id}")
  public void updatePosts(@PathVariable("id") int id, @RequestBody Posts posts) {
    if ( id == posts.getPost_id()) {
      postsRepo.save(posts);
    }
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @DeleteMapping(path="/{id}")
  public void deletePosts(@PathVariable("id") int id) {
    postsRepo.delete( postsRepo.getById(id));
  }
}
