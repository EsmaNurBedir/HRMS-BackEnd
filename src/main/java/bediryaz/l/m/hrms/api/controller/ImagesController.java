package bediryaz.l.m.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bediryaz.l.m.hrms.business.abstracts.ImageService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.entities.concretes.Image;

@RestController
@RequestMapping(value="/api/images")
public class ImagesController {

	private ImageService imageService;

	@Autowired
	public ImagesController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Image image){
		return ResponseEntity.ok(this.imageService.add(image));
	}
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody Image image){
		return ResponseEntity.ok(this.imageService.update(image));
	}
	
	@PostMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody int imageId){
		return ResponseEntity.ok(this.imageService.delete(imageId));
	}
	
	@GetMapping("/getall")
	public DataResult<List<Image>> getAll() {
		return this.imageService.getAll();
	}
}




















