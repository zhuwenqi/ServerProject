package com.example.sensoclient.manager;

import java.util.List;

import com.example.sensoclient.model.SensorTempData;

public interface TestMgr {

	public List<SensorTempData> getAllData();
	
	public List<SensorTempData> getDataBySID(String sid);
}
