package com.service.hqhub.model.form;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class FrmFlight {
	
	String flightNo;
	String flightDate;
	String flightFrom;
	String flightTo;
	String startTime;
	String arrTime;
	String flightStatus;
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public String getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	
	public String toString()
	{
		String result="";
		result="FlightID:"+this.flightNo+"--"+"Date:"+this.flightDate+"--"+"Take off Time:"+this.getStartTime()+"--"+"Arrive Time:"+this.getArrTime();
		
		return result;
	}

}
