package main.java;
import java.util.ArrayList;

public class Client {

	ArrayList<Order> Orders;
	ArrayList<Book> BuyLaterBooks;
	
	public Client ()
	{
		Orders= new ArrayList<Order>();
		BuyLaterBooks = new ArrayList<Book>();
	}
	
	public void BuyBook (String title)
	{
		Orders.add(new Order(title));
	}
	
	public void BuyLaterBook (String title)
	{
		BuyLaterBooks.add(new Book(title));
	}
	
	public void RateGoodBook (String title)
	{
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			if (Orders.get(i).hasTitle(title))
				Orders.get(i).good();
		}
	}
	
	public void RateBadBook (String title)
	{
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			if (Orders.get(i).hasTitle(title))
				Orders.get(i).bad();
		}
	}
	
	
	public String TitleSuggestion ()
	{
		//MOCK: sugestão de livro.
		return "NiceBook";
	}
	
	public void PayForBooks()
	{
		//STUB: O sistema real deve pedir o pagamento.
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			Orders.get(i).pay();
		}
	}
	
	public void ReceiveBooks()
	{
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			Orders.get(i).pay();
		}
	}
	
	public boolean BookInCatalogue(String title)
	{
		//MOCK
		return true;
	}
	
	public boolean hasBought (String title)
	{
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			if (Orders.get(i).hasTitle(title))
				return true;
		}
		return false;
	}
	
	public boolean willBuyLater (String title)
	{
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			if (BuyLaterBooks.get(i).hasTitle(title))
				return true;
		}
		return false;
	}
	
	public boolean BooksPaid()
	{
		//STUB: O sistema real deve pedir o pagamento.
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			if (!Orders.get(i).isPaid())
				return false;
		}
		return true;
	}
	
	public boolean BooksReceived()
	{
		//STUB: O sistema real deve pedir o pagamento.
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			if (!Orders.get(i).isDelivered())
				return false;
		}
		return true;
	}
	
	public boolean isGoodBook (String title)
	{
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			if (Orders.get(i).hasTitle(title) && Orders.get(i).isGood())
				return true;
		}
		return false;
	}
	
	public boolean isBadBook (String title)
	{
		int i;
		for (i = 0; i <= Orders.size() - 1; i++)
		{
			if (Orders.get(i).hasTitle(title) && Orders.get(i).isBad())
				return true;
		}
		return false;
	}
	
	
	
}
