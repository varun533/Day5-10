package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Bike;
@Repository
public interface Bikerepo extends JpaRepository<Bike, Integer>{
	
	@Query("SELECT b from Bike b where b.year=:year")
	public List<Bike>findbyyear(@Param("year") int year);
	@Query("SELECT b from Bike b where b.year=:year and b.bikeName=:bikename")
	public List<Bike>findbikebyyearandname(@Param("year") int year,@Param("bikename") String bikename);

}
