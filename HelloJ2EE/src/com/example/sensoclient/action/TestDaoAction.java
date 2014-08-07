package com.example.sensoclient.action;

import java.util.Iterator;


import java.util.List;
import java.util.Map;

import com.example.sensoclient.dao.SensorTempDataDAO;
import com.example.sensoclient.dao.hbm.SensorTempDataDAOHbm;
import com.example.sensoclient.manager.TestMgr;
import com.example.sensoclient.model.SensorTempData;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestDaoAction extends ActionSupport {

	
	private TestMgr testMgr;
	
	
	public TestMgr getTestMgr() {
		return testMgr;
	}

	public void setTestMgr(TestMgr testMgr) {
		this.testMgr = testMgr;
	}

	public String execute() throws Exception {
		return LOGIN;
	}
	
	public String testDao()
	{
		ActionContext context=ActionContext.getContext();
		Map request=(Map)context.get("request");
		
		
		//往request里放attribute
		String string = getAllDataStr();
		System.out.println(string);
		request.put("value", string);
		return "success";
		//往session里放
	}
	
	public String getAllDataStr()
	{
		System.out.println("sss");
		List<SensorTempData> dataList = testMgr.getAllData();
		Iterator<SensorTempData> it = dataList.iterator();
		String s="";
		while(it.hasNext())
		{
			SensorTempData data = (SensorTempData)it.next();
			s=s+Double.toString(data.getsData())+"+";
		}
		
		return s;
	}
	
	
}
