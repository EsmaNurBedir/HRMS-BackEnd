package bediryaz.l.m.hrms.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bediryaz.l.m.hrms.business.abstracts.JobService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.entities.concretes.Job;

@RestController
@RequestMapping(value="/api/jobs")
@CrossOrigin
public class JobsController {

	private JobService jobService;

	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody Job job){
	return ResponseEntity.ok(this.jobService.add(job));
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@Valid @RequestBody Job job){
	return ResponseEntity.ok(this.jobService.update(job));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@Valid @RequestBody int jobId){
	return ResponseEntity.ok(this.jobService.delete(jobId));
	}
	
	@GetMapping("/getByActiveTrue")
	public DataResult<List<Job>> getByActiveTrue(){
		return this.jobService.getByActiveTrue();
	}
	
    @GetMapping("/getByIdAndActiveTrue")
    public DataResult<Job> getByIdAndActiveTrue(@RequestParam int id){
    	return this.jobService.getByIdAndActiveTrue(id);
    }
   
    @GetMapping("/getByActiveTrueOrderByCreatedTimeDesc")
    public DataResult<List<Job>> getByActiveTrueOrderByCreatedTimeDesc(){
    	return this.jobService.getByActiveTrueOrderByCreatedTimeDesc();
    }
    
    
}




















