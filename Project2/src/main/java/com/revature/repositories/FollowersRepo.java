package com.revature.repositories;

import com.revature.beans.Followers;
import com.revature.beans.Musician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowersRepo extends JpaRepository<Followers, Integer> {
}
