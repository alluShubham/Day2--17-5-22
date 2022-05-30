package com.masai.day05;
//Que2-01
public class Ticket {
	private int ticketid;
	private int price;
	private  static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets<=0) {
			System.out.println("Please Enter Positive number");
		}
		else {
			Ticket.availableTickets = availableTickets;
		}
	}
	
	public int calculateTicketCost(int nooftickets) {
		if(nooftickets>0) {
			availableTickets = availableTickets- nooftickets;
			System.out.println("Available Tickets After Booking:"+availableTickets);
			int total =price*nooftickets;
			return total;
		}
		else
			return -1;
	}
	
	

}
