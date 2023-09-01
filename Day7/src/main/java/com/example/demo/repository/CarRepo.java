package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Model;

@Repository
public interface CarRepo extends JpaRepository<Model, Integer>{

	
	
	@Query("Select c from Model c  where c.owners=:owners")
	public List<Model>findcarsbyowners(@Param("owners") int owners);
	@Query("Select c from Model c  where c.address=:address")
	public List<Model>findcarsbyaddress(@Param("address") String address);
	@Query("Select c from Model c  where c.carName=:carname")
	public List<Model>findcarsbycarname(@Param("carname") String carName);
	@Query("Select c from Model c  where c.owners=:owners and c.carType=:cartype")
	public List<Model>findcarsbyownersandcartype(@Param("owners") int owners,@Param("cartype") String cartype);

	
}
