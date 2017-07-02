package main.java;

public class Order {

	String title;
	Status status;
	Rating rating;	

	public Order (String title)
	{
		this.title = title;
		status = Status.WaitingPayment;
	}
	
	public boolean hasTitle (String _title)
	{
		return (title.compareTo(_title) == 0);
	}
	
	public void good ()
	{
		rating = Rating.good;
	}
	
	public boolean isGood ()
	{
		return (rating == Rating.good);
	}
	
	public void bad ()
	{
		rating = Rating.bad;
	}
	
	public boolean isBad ()
	{
		return (rating == Rating.bad);
	}
	
	public void pay ()
	{
		status = Status.WaitingDelivery;
	}
	
	public void receive ()
	{
		status = Status.Delivered;
	}
	
	public boolean isPaid()
	{
		return (status == Status.WaitingDelivery);
	}
	
	public boolean isDelivered()
	{
		return (status == Status.Delivered);
	}
	
}
