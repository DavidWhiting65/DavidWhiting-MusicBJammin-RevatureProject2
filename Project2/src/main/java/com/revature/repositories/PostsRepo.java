package com.revature.repositories;

import com.revature.beans.Musician;
import com.revature.beans.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepo extends JpaRepository<Posts, Integer> {
}
