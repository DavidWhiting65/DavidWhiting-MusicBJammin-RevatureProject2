package com.revature.controllers;


import com.revature.beans.Usertypes;
import com.revature.repositories.UsertypesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/usertypes")
public class UsertypesController {

  // not code or implementation for this
  // all methods come from the JpaRepository<T, ID>
  private UsertypesRepo usertypesRepo;

  @Autowired
  public UsertypesController(UsertypesRepo usertypesRepo) {
    this.usertypesRepo = usertypesRepo;
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping
  public List<Usertypes> getAllUsertypes() {
    return usertypesRepo.findAll();
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @GetMapping(path="/{id}")
  public Usertypes getById(@PathVariable("id") int id) {return usertypesRepo.getById(id);}

  @CrossOrigin(origins = "http://localhost:4200")
  @PostMapping(consumes = "application/json", produces = "application/json")
  public Usertypes addUsertypes(@RequestBody Usertypes usertypes) {
    return usertypesRepo.save(usertypes);
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @PutMapping(path="/{id}")
  public void updateUsertypes(@PathVariable("id") int id, @RequestBody Usertypes usertypes) {
    if ( id == usertypes.getUsertype_id()) {
      usertypesRepo.save(usertypes);
    }
  }

  @CrossOrigin(origins = "http://localhost:4200")
  @DeleteMapping(path="/{id}")
  public void deleteUsertypes(@PathVariable("id") int id) {
    usertypesRepo.delete(usertypesRepo.getById(id));
  }
}
