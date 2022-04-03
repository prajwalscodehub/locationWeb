package com.location.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entities.Locations;
import com.location.repository.LocationRepositry;

@Service
public class LocationservicesImpl implements Locationservices {

	@Autowired
	LocationRepositry locationrepo;

	@Override
	public void savedata(Locations location) {
		locationrepo.save(location);
	}

	@Override
	public List<Locations> getlocation() {
		List<Locations> locations = locationrepo.findAll();
		return locations;
	}

	@Override
	public void delete(long id) {
		locationrepo.deleteById(id);
	}

	@Override
	public Locations update(long id) {
		Optional<Locations> location = locationrepo.findById(id);
		Locations locations = location.get();
		return locations;
	}

}
