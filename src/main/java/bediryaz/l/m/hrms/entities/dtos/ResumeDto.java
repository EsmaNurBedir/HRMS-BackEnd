package bediryaz.l.m.hrms.entities.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import bediryaz.l.m.hrms.entities.concretes.Education;
import bediryaz.l.m.hrms.entities.concretes.Language;
import bediryaz.l.m.hrms.entities.concretes.Technology;
import bediryaz.l.m.hrms.entities.concretes.WorkExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto {

	@JsonProperty(access=Access.READ_ONLY)
	private int resumeId;
	private int candidateId;
	private int imageId;
	private String githubAdress;
	private String Linkedin;
	private String coverLetter;
	
	private List<Education> educations;
	private List<Technology> technologies;
	private List<Language> languageis;
	private List<WorkExperience> workExperiences;
	
}
