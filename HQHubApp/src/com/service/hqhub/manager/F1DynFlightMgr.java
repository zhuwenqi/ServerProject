package com.service.hqhub.manager;

import java.util.ArrayList;
import java.util.List;

import com.service.hqhub.model.F1DynFlight;

public interface F1DynFlightMgr {
	public List<F1DynFlight> getAllData();
	
	public List<F1DynFlight> getFlightById(String fid,String fdate);
	
	public ArrayList getFrmFlightListById(String fid,String fdate);
}
