package com.example.sensoclient.manager.impl;

import java.util.List;

import com.example.sensoclient.dao.SensorTempDataDAO;
import com.example.sensoclient.manager.TestMgr;
import com.example.sensoclient.model.SensorTempData;

public class TestMgrImpl implements TestMgr{

	
	SensorTempDataDAO sensorDao;
	
	
	
	public SensorTempDataDAO getSensorDao() {
		return sensorDao;
	}

	public void setSensorDao(SensorTempDataDAO sensorDao) {
		this.sensorDao = sensorDao;
	}

	@Override
	public List<SensorTempData> getAllData() {
		// TODO Auto-generated method stub
		return sensorDao.getAllData();
	}

	@Override
	public List<SensorTempData> getDataBySID(String sid) {
		// TODO Auto-generated method stub
		return sensorDao.getDataBySID(sid);
	}
	

}
