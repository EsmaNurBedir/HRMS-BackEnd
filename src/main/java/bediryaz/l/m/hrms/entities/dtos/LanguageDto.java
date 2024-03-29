package bediryaz.l.m.hrms.entities.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageDto {

	@JsonIgnore
	private int id;
	private int resumeId;
	private String languageName;
	private char level;
	
}
