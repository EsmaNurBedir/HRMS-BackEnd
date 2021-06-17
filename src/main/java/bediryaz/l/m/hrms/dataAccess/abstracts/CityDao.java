package bediryaz.l.m.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import bediryaz.l.m.hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

	List<City> getById(int id);
	
	List<City> getByCityName(String cityName);
	
	
}
