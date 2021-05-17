package com.HotelReservationSystem;

public class HotelReservationSystem {
	
	private static Hotel Lotus,RadhaKirshna,Ganesh;
	public static void main(String args[])
	{
		HotelDetails();
	}
	
	public static void HotelDetails()
	{
		System.out.println("Hotel and price for regular customer");
		
		Lotus=new Hotel("Lotus");
		Lotus.setRegularWeekDay(150);
		Lotus.setRegularWeekEnd(100);
		
		System.out.println("Hotel Name:"+Lotus.getHotelName()+"\n"+"Regular WeekDay price:"+Lotus.getRegularWeekDay()+"\n"+"Regular week End price:"+Lotus.getRegularWeekEnd()+ "\n");
		
		RadhaKirshna=new Hotel("RadhaKirshna");
		RadhaKirshna.setRegularWeekDay(200);
		RadhaKirshna.setRegularWeekEnd(150);
		
		System.out.println("Hotel Name:"+RadhaKirshna.getHotelName()+"\n"+"Regular WeekDay price:"+RadhaKirshna.getRegularWeekDay()+"\n"+"Regular week End price:"+RadhaKirshna.getRegularWeekEnd()+ "\n");
		
		Ganesh=new Hotel("Ganesh");
		Ganesh.setRegularWeekDay(200);
		Ganesh.setRegularWeekEnd(150);
		
		System.out.println("Hotel Name:"+Ganesh.getHotelName()+"\n"+"Regular WeekDay price:"+Ganesh.getRegularWeekDay()+"\n"+"Regular week End price:"+Ganesh.getRegularWeekEnd()+ "\n");
	}

}

