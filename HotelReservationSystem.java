package com.HotelReservationSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotelReservationSystem {
	
	private static Hotel Lotus,RadhaKirshna,Ganesh;
	public static void main(String[] args) throws IOException {
	    
   	 System.out.println("Enter date  ex. 17May2021(mon)");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String date = bf.readLine();

		
		//setting values for lakewood
	    Lotus = new Hotel("Lotus");
		 Lotus.setRating(4);	
	    Lotus.setRegularWeekDay(100);
	    Lotus.setRegularWeekEnd(90);
	    
		 		
		//setting values for bridgewood
	   RadhaKirshna = new Hotel("RadhaKirshna");
		RadhaKirshna.setRating(5);
	   RadhaKirshna.setRegularWeekDay(150);
	   RadhaKirshna.setRegularWeekEnd(120);
	   
				
		//setting values for ridgewood   
	   Ganesh = new Hotel("Ganesh");
		Ganesh.setRating(3);
	   Ganesh.setRegularWeekDay(250);
	   Ganesh.setRegularWeekEnd(200);
	    
		
		 //int index = date.indexOf(":");
	     //String type = date.substring(0, index);
	     int cost_Lotus = 0, cost_RadhaKirshna = 0, cost_Ganesh = 0;
	     int day_index_start = 0, day_index_end = 0;
	     
	    while (day_index_start != -1) {
		     day_index_start = date.indexOf("(", day_index_start + 1);
		     day_index_end = date.indexOf(")", day_index_end + 1);
		
		     if (day_index_start != -1) {
			     String day = date.substring(day_index_start + 1, day_index_end);
				    
					     cost_Lotus += Lotus.getRegularWeekDay()+Lotus.getRegularWeekEnd();
					     cost_RadhaKirshna += RadhaKirshna.getRegularWeekDay()+RadhaKirshna.getRegularWeekEnd();
					     cost_Ganesh += Ganesh.getRegularWeekDay()+Ganesh.getRegularWeekEnd();				     
			     }
		     }  
	    
	     System.out.println("Lotus : "+cost_Lotus+"$");
	     System.out.println("RadhaKirshna : "+cost_RadhaKirshna+"$");
	     System.out.println("Ganesh: "+cost_Ganesh+"$");
	
	     String result = min(cost_Lotus, cost_RadhaKirshna, cost_Ganesh);
	     System.out.println("Cheapest price is of "+result);
    	}
    	
  //implementing the min method
    private static String min(int x, int y, int z) {
    	if(x < y && x < z) {
 			return Lotus.getHotelName();
 		}else if(y<x && y < z) {
 			return RadhaKirshna.getHotelName();
 		}else if(x==y ) {
 			return (Lotus.getHotelName()+" "+RadhaKirshna.getHotelName());
 		}else if(y==z) {
 			return (RadhaKirshna.getHotelName()+" "+Ganesh.getHotelName());
 		}else if(x==z) {
 			return (Lotus.getHotelName()+" "+Ganesh.getHotelName());
 		}
 		else {
 			return Ganesh.getHotelName();
 		}
	}
}




