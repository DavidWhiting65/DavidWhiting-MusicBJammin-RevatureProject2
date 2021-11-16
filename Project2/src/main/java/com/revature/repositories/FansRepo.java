package com.revature.repositories;

import com.revature.beans.Fans;
import com.revature.beans.Musician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FansRepo extends JpaRepository<Fans, Integer> {
}
