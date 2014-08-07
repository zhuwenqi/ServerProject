package com.service.hqhub.action;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.hqhub.manager.F1DynFlightMgr;
import com.service.hqhub.model.F1DynFlight;
import com.service.hqhub.model.form.FrmFlight;

public class FlightAction extends ActionSupport{
	
	private static String FWD_WEBSEARCHINPUT="fwd_websearchinput";
	
	
	private F1DynFlightMgr flightMgr;
	
	//按航班号和日期查询
	private String fid;
	private String fdate;
	


	public F1DynFlightMgr getFlightMgr() {
		return flightMgr;
	}

	public void setFlightMgr(F1DynFlightMgr flightMgr) {
		this.flightMgr = flightMgr;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFdate() {
		return fdate;
	}

	public void setFdate(String fdate) {
		this.fdate = fdate;
	}

	public String execute() throws Exception {
		return LOGIN;
	}
	
	public String webSearchInput() {
		return FWD_WEBSEARCHINPUT;
	}
	
	public String searchByFid() throws Exception{

		
		ArrayList list = flightMgr.getFrmFlightListById(fid, fdate);
		System.out.println(list.size());
		
		
		ActionContext context=ActionContext.getContext();
		Map request=(Map)context.get("request");
		request.put("flightList", list);
		return "success";
	}
	

	
}
