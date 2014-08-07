package com.example.sensoclient.action.android;


import java.io.IOException;
import java.util.Iterator;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.example.sensoclient.dao.SensorTempDataDAO;
import com.example.sensoclient.dao.hbm.SensorTempDataDAOHbm;
import com.example.sensoclient.manager.TestMgr;
import com.example.sensoclient.manager.TestSensorDataMgr;
import com.example.sensoclient.model.SensorTempData;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestSensorDataAction extends ActionSupport  implements 
ServletRequestAware,ServletResponseAware {
	
	
	private String sid;
	private String stime;
	private String sdata;




	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public String getSdata() {
		return sdata;
	}

	public void setSdata(String sdata) {
		this.sdata = sdata;
	}

	private  HttpServletRequest request;
	private  HttpServletResponse  response;
	
	private TestSensorDataMgr testSensorDataMgr;
	
	
	public TestSensorDataMgr getTestSensorDataMgr() {
		return testSensorDataMgr;
	}

	public void setTestSensorDataMgr(TestSensorDataMgr testSensorDataMgr) {
		this.testSensorDataMgr = testSensorDataMgr;
	}

	public String execute() throws Exception {
		return LOGIN;
	}
	
	public String saveData() throws Exception {
		
		//stime=(String)request.getAttribute("stime");
		//sdata = (String)request.getAttribute("sdata");
		testSensorDataMgr.savaData(sid, Integer.parseInt(stime), Double.parseDouble(sdata));
		return LOGIN;
	}
	
	public void saveDataList() throws Exception {
		
		//stime=(String)request.getAttribute("stime");
		//sdata = (String)request.getAttribute("sdata");
		String data = (String)request.getParameter("GsonDataList");
		System.out.println(data);
		testSensorDataMgr.saveDataListStr(data);
	}
	
	public void getAllDataFromServer()
	{
		String beanListString = testSensorDataMgr.getAllDataGson();
        try {  
       	 this.response.setCharacterEncoding("GBK"); 
         this.response.getWriter().write(beanListString);
         
       } catch (IOException e) {  
           e.printStackTrace();  
       }
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}
	
	
}
