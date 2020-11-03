package io.github.guisofiati.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.guisofiati.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
}
