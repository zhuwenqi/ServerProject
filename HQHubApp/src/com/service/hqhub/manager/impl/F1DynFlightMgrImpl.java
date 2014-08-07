package com.service.hqhub.manager.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.service.hqhub.dao.F1DynFlightDAO;
import com.service.hqhub.manager.F1DynFlightMgr;
import com.service.hqhub.model.F1DynFlight;
import com.service.hqhub.model.form.FrmFlight;
import com.service.hqhub.util.CommonTool;

public class F1DynFlightMgrImpl implements F1DynFlightMgr {
	
	F1DynFlightDAO flightDAO;
	

	public F1DynFlightDAO getFlightDAO() {
		return flightDAO;
	}


	public void setFlightDAO(F1DynFlightDAO flightDAO) {
		this.flightDAO = flightDAO;
	}


	@Override
	public List<F1DynFlight> getAllData() {
		// TODO Auto-generated method stub
		return flightDAO.getAllData();
	}


	@Override
	public List<F1DynFlight> getFlightById(String fid, String fdate) {
		// TODO Auto-generated method stub
		
		return flightDAO.getFlightById(fid, fdate);
	}


	@Override
	public ArrayList getFrmFlightListById(String fid, String fdate) {
		// TODO Auto-generated method stub
		return getFlightList(flightDAO.getFlightById(fid, fdate));
	}
	
	public ArrayList getFlightList(List<F1DynFlight> list){
		Iterator<F1DynFlight> iterator = list.iterator();
		ArrayList result = new ArrayList();
		while(iterator.hasNext())
		{
			F1DynFlight f1DynFlight = (F1DynFlight)iterator.next();
			FrmFlight frmFlight = new FrmFlight();
			frmFlight.setArrTime(CommonTool.timeToStr(f1DynFlight.getEta()));
			
			//System.out.println(f1DynFlight.getEta().toString());
			
			
			frmFlight.setFlightDate(CommonTool.dateToStr(f1DynFlight.getOperation_date()));
			frmFlight.setFlightFrom(f1DynFlight.getOrigin_airport_iata());
			frmFlight.setFlightNo(f1DynFlight.getFlight_no());
			frmFlight.setFlightStatus(f1DynFlight.getRecent_abnormal_status());
			frmFlight.setFlightTo(f1DynFlight.getDest_airport_iata());
			frmFlight.setStartTime(CommonTool.timeToStr(f1DynFlight.getEtd()));
			result.add(frmFlight);
		}
		return result;
	}

}
