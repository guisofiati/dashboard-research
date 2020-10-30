package io.github.guisofiati.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import io.github.guisofiati.entities.enums.Platform;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private Platform platform;
	
	private Genre genre;
	
	private List<Record> records = new ArrayList<>();
}
