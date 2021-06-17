package bediryaz.l.m.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bediryaz.l.m.hrms.business.abstracts.CityService;
import bediryaz.l.m.hrms.core.utilities.results.DataResult;
import bediryaz.l.m.hrms.entities.concretes.City;

@RestController
@RequestMapping(value="/api/cities")
public class CitiesController {

	private CityService cityService;

	@Autowired
	public CitiesController(CityService cityService) {
		this.cityService = cityService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody City city){
		return ResponseEntity.ok(this.cityService.add(city));
	}
	
    @GetMapping("/getallcityname")
    public DataResult<List<City>> getByCityName(String cityName){
    	return this.cityService.getByCityName(cityName);
    }
    
    @GetMapping("/getbyid")
    public DataResult<List<City>> getById(int id){
    	return this.cityService.getById(id);
    }
}
