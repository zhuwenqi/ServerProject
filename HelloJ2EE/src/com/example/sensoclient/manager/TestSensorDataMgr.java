package com.example.sensoclient.manager;

import java.util.List;

import com.example.sensoclient.model.SensorTempData;

public interface TestSensorDataMgr {
	
	public String getAllDataGson();
	
	public List<SensorTempData> getAllData();
	
	public List<SensorTempData> getDataBySID(String sid);
	
	public void savaData(String sid,int sTime,double sData);
	
	public void saveDataListStr(String datas);
}
