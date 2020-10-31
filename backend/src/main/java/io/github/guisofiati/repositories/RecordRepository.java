package io.github.guisofiati.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.guisofiati.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
