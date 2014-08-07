package com.service.hqhub.dao;
import java.util.List;

import com.service.hqhub.model.F1DynFlight;
public interface F1DynFlightDAO {

	public List<F1DynFlight> getAllData();
	
	public List<F1DynFlight> getFlightById(String fid,String fdate);
}
