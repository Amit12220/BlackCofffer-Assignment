package com.assignment.Service;

import java.util.List;

import com.assignment.Exception.DataException;
import com.assignment.Model.Data;

public interface DataService {
	

	public List<Data> findData() throws DataException;
	public List<Integer> findIntensity() throws DataException;
	public List<Integer> findLikelihood() throws DataException;
	public List<Integer> findRelevance() throws DataException;
	public List<String> findYear() throws DataException;
	public List<String> findCountry() throws DataException;
	public List<String> findTopic() throws DataException;
	public List<String> findregion() throws DataException;
	public List<String> findCity() throws DataException;


}
