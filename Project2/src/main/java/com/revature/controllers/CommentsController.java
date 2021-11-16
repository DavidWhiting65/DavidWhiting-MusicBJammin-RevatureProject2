package com.revature.controllers;

import com.revature.beans.Comments;

import com.revature.repositories.CommentsRepo;
import com.revature.repositories.FansRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.Comment;
import java.util.List;

@RestController
@RequestMapping(path="/comments")
public class CommentsController {

  // not code or implementation for this
  // all methods come from the JpaRepository<T, ID>
  private CommentsRepo commentsRepo;

  @Autowired
  public CommentsController(FansRepo fansRepo) {
    this.commentsRepo = commentsRepo;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping
  public List<Comments> getAllComments() {
    return commentsRepo.findAll();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping(path="/{id}")
  public Comments getById(@PathVariable("id") int id) {return commentsRepo.getById(id);}

  @CrossOrigin(origins = "http://localhost:4200")
  @PostMapping(consumes = "application/json", produces = "application/json")
  public Comments addComment(@RequestBody Comments comment) {
    return commentsRepo.save(comment);
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @PutMapping(path="/{id}")
  public void updateComment(@PathVariable("id") int id, @RequestBody Comments comment) {
    if ( id == comment.getComments_id()) {
      commentsRepo.save(comment);
    }
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @DeleteMapping(path="/{id}")
  public void deleteComment(@PathVariable("id") int id) {
    commentsRepo.delete(commentsRepo.getById(id));
  }
}
