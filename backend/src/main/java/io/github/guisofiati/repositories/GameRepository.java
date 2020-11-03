package io.github.guisofiati.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.guisofiati.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
