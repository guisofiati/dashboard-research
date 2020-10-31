package io.github.guisofiati.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.guisofiati.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
