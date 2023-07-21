package com.assignments;
import java.util.ArrayList;

public class Airport
{
	Address address;
	private ArrayList<Flight> flights;
	private ArrayList<Traveller> traveller;
	public boolean addFlight(Flight newflight)
	{	
		flights.add(newflight);
		return true;
	}
	
	public  ArrayList<Flight> searchFlightsBySourceAndDestination(String Source,String Destination)
		{
			ArrayList<Flight> x=new ArrayList<>();
			for(Flight f:flights)
			{
			if(f.getSource().equals(Source) && f.getDestination().equals(Destination))
			{
				x.add(f);
			}
			else {
				System.out.println("Flights are not Found");
			}
		}
			return x;
			
	}
	public void bookTicket(String flightId,Traveller traveller)
	{
	    for(int i=0;i<flights.size();i++)
	    {
	        if(flights.contains(flightId) && (flights.get(i)).getAvailableSeats()>0)

	        {

	        traveller.addTraveller(traveller);

	        flights.get(i).setAvailableSeats(flights.get(i).getAvailableSeats()-1);

	        }

	    }

	}
	public boolean addTraveller(Traveller newtraveller)
	{	
		traveller.add(newtraveller);
		return true;
	}
}	
	





