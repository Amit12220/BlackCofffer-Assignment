package com.assignment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Exception.DataException;
import com.assignment.Model.Data;
import com.assignment.Repo.DataRepo;
@Service
public class DataServiceImpl implements DataService{

	@Autowired
	private DataRepo drepo;
	
	@Override
	public List<Data> findData() throws DataException {
		// TODO Auto-generated method stub
		List<Data> data =drepo.findAll();
		if(data!=null)
		{
			return data;
		}
		else
		{
			throw new DataException("Data not found");
		}
		
	}

	@Override
	public List<Integer> findIntensity() throws DataException {
		// TODO Auto-generated method stub
		
		List<Integer> intensity =drepo.findIntensity();
		if(intensity!=null)
		{
			return intensity;
		}
		else
		{
			throw new DataException("intensity not found");
		}
	}

	@Override
	public List<Integer> findLikelihood() throws DataException {
		// TODO Auto-generated method stub
		List<Integer> likehood =drepo.findLikelihood();
		if(likehood!=null)
		{
			return likehood;
		}
		else
		{
			throw new DataException("likehood not found");
		}
	}

	@Override
	public List<Integer> findRelevance() throws DataException {
		// TODO Auto-generated method stub
		List<Integer> relevance =drepo.findRelevance();
		if(relevance!=null)
		{
			return relevance;
		}
		else
		{
			throw new DataException("relevance not found");
		}
	}

	@Override
	public List<String> findYear() throws DataException {
		// TODO Auto-generated method stub
		List<String> year =drepo.findYear();
		if(year!=null)
		{
			return year;
		}
		else
		{
			throw new DataException("year not found");
		}
	}

	@Override
	public List<String> findCountry() throws DataException {
		// TODO Auto-generated method stub
		List<String> country =drepo.findCountry();
		if(country!=null)
		{
			return country;
		}
		else
		{
			throw new DataException("country not found");
		}
	}

	@Override
	public List<String> findTopic() throws DataException {
		// TODO Auto-generated method stub
		List<String> topic =drepo.findTopic();
		if(topic!=null)
		{
			return topic;
		}
		else
		{
			throw new DataException("topic not found");
		}
	}

	@Override
	public List<String> findregion() throws DataException {
		// TODO Auto-generated method stub
		List<String> region =drepo.findRegion();
		if(region!=null)
		{
			return region;
		}
		else
		{
			throw new DataException("region not found");
		}
	}

	@Override
	public List<String> findCity() throws DataException {
		// TODO Auto-generated method stub
		List<String> city =drepo.findCity();
		if(city!=null)
		{
			return city;
		}
		else
		{
			throw new DataException("city not found");
		}
	}

}
