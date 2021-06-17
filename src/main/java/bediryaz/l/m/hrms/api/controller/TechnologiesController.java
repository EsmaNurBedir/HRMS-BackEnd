package bediryaz.l.m.hrms.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bediryaz.l.m.hrms.business.abstracts.TechnologyService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.entities.concretes.Technology;

@RestController
@RequestMapping(value="/api/technologies")
public class TechnologiesController {

	private TechnologyService technologyService;

	public TechnologiesController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Technology technology){
		return ResponseEntity.ok(this.technologyService.add(technology));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody int technologyId){
		return ResponseEntity.ok(this.technologyService.delete(technologyId));
	}
	
	@GetMapping("/getall")
	public DataResult<List<Technology>> getAll() {
		return this.technologyService.getAll();
	}
}








