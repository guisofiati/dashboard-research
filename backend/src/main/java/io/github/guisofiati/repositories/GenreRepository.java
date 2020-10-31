package io.github.guisofiati.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.guisofiati.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
