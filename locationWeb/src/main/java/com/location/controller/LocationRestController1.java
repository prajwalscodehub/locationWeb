package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entities.Locations;
import com.location.repository.LocationRepositry;

@RestController
@RequestMapping("/locations")
public class LocationRestController1 {
	@Autowired
	private LocationRepositry locationrepo;
	@GetMapping
	public List<Locations> get(){
		List<Locations> locats = locationrepo.findAll();
		return locats;}
		
	@PostMapping
	public void svelocation(@RequestBody Locations location) {
		locationrepo.save(location);
	}
	@PutMapping
	public void updatelocation(@RequestBody Locations location) {
		locationrepo.save(location);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletelocation(@PathVariable("id") long id) {
		locationrepo.deleteById(id);}
}
