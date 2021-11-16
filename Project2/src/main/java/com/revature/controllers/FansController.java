package com.revature.controllers;

import com.revature.beans.Fans;
import com.revature.repositories.FansRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/fans")
public class FansController {

  // not code or implementation for this
  // all methods come from the JpaRepository<T, ID>
  private FansRepo fansRepo;

  @Autowired
  public FansController(FansRepo fansRepo) {
    this.fansRepo = fansRepo;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping
  public List<Fans> getAllFans() {
    return fansRepo.findAll();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping(path="/{id}")
  public Fans getById(@PathVariable("id") int id) {return fansRepo.getById(id);}

  @CrossOrigin(origins = "http://localhost:4200")
  @PostMapping(consumes = "application/json", produces = "application/json")
  public Fans addFan(@RequestBody Fans fans) {
    return fansRepo.save(fans);
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @PutMapping(path="/{id}")
  public void updateFans(@PathVariable("id") int id, @RequestBody Fans fans) {
    if ( id == fans.getFan_id()) {
      fansRepo.save(fans);
    }
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @DeleteMapping(path="/{id}")
  public void deleteFans(@PathVariable("id") int id) {
    fansRepo.delete(fansRepo.getById(id));
  }
}
