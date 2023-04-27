package ca.sheridancollege.ranati.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.ranati.beans.Stationery;
import ca.sheridancollege.ranati.repositories.StationeryRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StationeryServiceImpl implements StationeryService {

	private StationeryRepository sRepo;
	
	@Override
	public List<Stationery> getStationerys() {
		
		return sRepo.findAll();
	}

	@Override
	public Stationery getStationeryById(Long id) {
		
		if(sRepo.findById(id).isPresent())
			return sRepo.findById(id).get();
		
		return new Stationery();
	}

	@Override
	public Stationery addStationery(Stationery stationery) {
		
		return sRepo.save(stationery);
	}

	@Override
	public void deleteStationeryById(Long id) {
		
		sRepo.deleteById(id);

	}

}
