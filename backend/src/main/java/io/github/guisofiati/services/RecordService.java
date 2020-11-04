package io.github.guisofiati.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.guisofiati.dto.RecordDTO;
import io.github.guisofiati.dto.RecordInsertDTO;
import io.github.guisofiati.entities.Game;
import io.github.guisofiati.entities.Record;
import io.github.guisofiati.repositories.GameRepository;
import io.github.guisofiati.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);	
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}