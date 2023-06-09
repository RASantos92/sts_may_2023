package com.robert.mvcdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.robert.mvcdemo.models.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation,Long>{
	// SELECT * FROM Donations
	List<Donation> findAll();
	
	List<Donation> findByNameContaining(String name);
}
