package com.example.sensoclient.manager.impl;

import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.example.sensoclient.dao.SensorTempDataDAO;
import com.example.sensoclient.manager.TestSensorDataMgr;
import com.example.sensoclient.model.SensorTempData;

public class TestSensorDataMgrImpl implements TestSensorDataMgr {

	
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

	@Override
	public String getAllDataGson() {
		// TODO Auto-generated method stub
		List<SensorTempData> list = this.getAllData();
		Gson gson = new  Gson();
		java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<List<SensorTempData>>() {
		}.getType();
		String beanListToJson = gson.toJson(list,type);
		return beanListToJson;

	}

	private void saveObject(SensorTempData data) {
		// TODO Auto-generated method stub
		sensorDao.saveData(data);
	}

	@Override
	public void savaData(String sid, int sTime, double sData) {
		// TODO Auto-generated method stub
		SensorTempData data = new SensorTempData();
		data.setSid(sid);
		data.setsTime(sTime);
		data.setsData(sData);
		data.setId(0);
		this.saveObject(data);
	}

	@Override
	public void saveDataListStr(String datas) {
		// TODO Auto-generated method stub
		java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<List<SensorTempData>>() {
		}.getType();
		Gson gson = new Gson();
		List<SensorTempData>  list  = gson.fromJson(datas, type);
		this.saveDataList(list);
	}
	
	private void saveDataList(List<SensorTempData> datas)
	{
		Iterator<SensorTempData> iterator = datas.iterator();
		while(iterator.hasNext())
		{
			SensorTempData data = iterator.next();
			this.saveObject(data);
		}
	}

}
