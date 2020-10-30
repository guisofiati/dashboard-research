package io.github.guisofiati.entities;

import java.io.Serializable;
import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Integer age;
	private Instant moment;
	
	private Game game;
}
