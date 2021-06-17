package bediryaz.l.m.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bediryaz.l.m.hrms.business.abstracts.JobtitleService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.entities.concretes.Jobtitle;

@RestController
@RequestMapping(value="/api/jobtitles")
public class JobtitlesController {

	private JobtitleService jobTtitleService;

	@Autowired
	public JobtitlesController(JobtitleService jobTtitleService) {
		super();
		this.jobTtitleService = jobTtitleService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Jobtitle jobTitle){
		return ResponseEntity.ok(this.jobTtitleService.add(jobTitle));
	}
	
	@GetMapping("/getall")
	public DataResult<List<Jobtitle>> getAll() {
		return this.jobTtitleService.getAll();
	}
	
	@GetMapping("/getbytitle")
	public DataResult<List<Jobtitle>> getByTitle(String title) {
		return this.jobTtitleService.getByTitle(title);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody int jobtitleId){
		return ResponseEntity.ok(this.jobTtitleService.delete(jobtitleId));
	}
}







