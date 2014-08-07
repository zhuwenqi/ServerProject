package com.example.sensoclient.dao;

import java.util.List;

import com.example.sensoclient.model.SensorTempData;


public interface SensorTempDataDAO {

	public List<SensorTempData> getAllData();
	
	public List<SensorTempData> getDataBySID(String sid);
	
	public void saveData(SensorTempData data);
	
}
