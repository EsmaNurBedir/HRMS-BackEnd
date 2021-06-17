package bediryaz.l.m.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="resumes")
public class Resume {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="github_adress")
	private String githubAdress;
	
	@Column(name="linkedin_adress")
	private String linkEdin;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@ManyToOne()
	@JoinColumn(name="candidate_id",referencedColumnName="id")
	private Candidate candidate;
	
	@OneToMany(mappedBy="resume")
	private List<Language> languages;
	
	@OneToMany(mappedBy="resume")
	private List<Education> educations;
	
	@OneToMany(mappedBy="resume")
	private List<Technology> technologys;
	
	@OneToMany(mappedBy="resume")
	private List<WorkExperience> works;
}























