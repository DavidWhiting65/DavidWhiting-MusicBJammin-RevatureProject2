package com.revature.repositories;

import com.revature.beans.Musician;
import com.revature.beans.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepo extends JpaRepository<Playlist, Integer> {
}
