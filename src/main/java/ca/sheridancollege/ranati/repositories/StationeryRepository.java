package ca.sheridancollege.ranati.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.ranati.beans.Stationery;

@Repository
public interface StationeryRepository extends JpaRepository<Stationery, Long> {

}
