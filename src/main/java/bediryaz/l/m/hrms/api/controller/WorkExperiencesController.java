package bediryaz.l.m.hrms.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bediryaz.l.m.hrms.business.abstracts.WorkExperienceService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.entities.concretes.WorkExperience;

@RestController
@RequestMapping("/api/workExperiences")
public class WorkExperiencesController {

	private WorkExperienceService workExperienceService;

	@Autowired
	public WorkExperiencesController(WorkExperienceService workExperienceService) {
		super();
		this.workExperienceService = workExperienceService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody WorkExperience workExperience){
	return ResponseEntity.ok(this.workExperienceService.add(workExperience));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@Valid @RequestBody int workExperienceId){
	return ResponseEntity.ok(this.workExperienceService.delete(workExperienceId));
	}
	
	@GetMapping("/getall")
	public DataResult<List<WorkExperience>> getAll() {
		return this.workExperienceService.getAll();
	}
	
	@GetMapping("/Desc")
	public DataResult<List<WorkExperience>> getAllByResumeIdOrderByEndYearOfWorkDesc(int id) { 
		return this.workExperienceService.getAllByResumeIdOrderByEndYearOfWorkDesc(id);
	}
}











