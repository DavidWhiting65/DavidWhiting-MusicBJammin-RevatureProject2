package com.revature.repositories;

import com.revature.beans.Musician;
import com.revature.beans.Usertypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsertypesRepo extends JpaRepository<Usertypes, Integer> {
}
