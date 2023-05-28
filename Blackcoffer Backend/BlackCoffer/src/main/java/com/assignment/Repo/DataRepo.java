package com.assignment.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.assignment.Model.Data;


public interface DataRepo extends JpaRepository<Data, Integer>{

	@Query("select d.intensity from Data d")
    List<Integer> findIntensity();
	@Query("select d.likelihood from Data d")
	List<Integer> findLikelihood();
	@Query("select d.relevance from Data d")
	List<Integer> findRelevance();
	@Query("select d.start_year from Data d")
	List<String> findYear();

	@Query("select d.country from Data d")
	List<String> findCountry();
	@Query("select d.topic from Data d")
	List<String> findTopic();
	@Query("select d.region from Data d")
	List<String> findRegion();
	@Query("select d.city from Data d")
	List<String> findCity();
	
}
