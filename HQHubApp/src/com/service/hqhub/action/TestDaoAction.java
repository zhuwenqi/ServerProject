package com.service.hqhub.action;

import java.util.Iterator;


import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.hqhub.manager.F1DynFlightMgr;
import com.service.hqhub.model.F1DynFlight;

public class TestDaoAction extends ActionSupport {

	
	private F1DynFlightMgr testMgr;
	
	
	public F1DynFlightMgr getTestMgr() {
		return testMgr;
	}

	public void setTestMgr(F1DynFlightMgr testMgr) {
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
		List<F1DynFlight> dataList = testMgr.getAllData();
		Iterator<F1DynFlight> it = dataList.iterator();
		String s="";
		while(it.hasNext())
		{
			F1DynFlight data = (F1DynFlight)it.next();
			s=s+data.getFlight_no()+"_"+data.getOperation_date()+"+";
		}
		
		return s;
	}
	
	
}
