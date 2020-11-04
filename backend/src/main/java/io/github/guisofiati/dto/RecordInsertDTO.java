package io.github.guisofiati.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private Integer age;
	private Long gameId;
}
