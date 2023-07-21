package com.Main;

import java.time.LocalDate;
import java.util.ArrayList;

import com.assignments.Flight;
import com.assignments.Traveller;

public class Test 
{
	public static void main(String[] args)
	{
		ArrayList<Flight> flist=new ArrayList<>();
		flist.add(new Flight("CB123","Hyderabad","Canada",23.0,100,65,"12:45","02:45","British Airways"));
		flist.add(new Flight("At546","Mumbai","US",53.0,500,100,"01:45","04:45","US Airways"));
		
		ArrayList<Traveller> tlist=new ArrayList<>();
		
		tlist.add(new Traveller("Ajay",96765,"AJ@123","CB123",LocalDate.now()));
		
		
		
		
	}
}
