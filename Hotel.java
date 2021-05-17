package com.HotelReservationSystem;

public class Hotel {
	
	String HotelName;
	private int regularWeekDay;
	private int regularWeekEnd;
	

	public Hotel(String HotelName) {
		this.HotelName = HotelName;
	}
	
	public String getHotelName() {
		return HotelName;
	}
	
	public void setHotelName(String HotelName)
	{
		this.HotelName = HotelName;
	}
	
	public int getRegularWeekDay() {
		return regularWeekDay;
	}
	public void setRegularWeekDay(int regularWeekDay) {
		this.regularWeekDay=regularWeekDay;	
	}

	public int getRegularWeekEnd() {
		return regularWeekEnd;
	}
	
	public void setRegularWeekEnd(int regularWeekEnd ) {
		this.regularWeekEnd=regularWeekEnd;	
		
	}

}
