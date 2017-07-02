package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Client;

public class Testes {

	@Test
	public void test() {
		
		
		Client HardCoreSailor = new Client();
		
		HardCoreSailor.BuyBook ("Book1");
		HardCoreSailor.BuyBook("Book2");
		
		assertTrue(HardCoreSailor.hasBought("Book1"));
		assertTrue(HardCoreSailor.hasBought("Book2"));
		assertFalse(HardCoreSailor.hasBought("Book3"));
		
		
		HardCoreSailor.RateGoodBook("Book1");
		HardCoreSailor.RateBadBook("Book2");
		
		assertTrue(HardCoreSailor.isGoodBook("Book1"));
		assertTrue(HardCoreSailor.isBadBook("Book2"));
		
		HardCoreSailor.PayForBooks();
		
		assertTrue(HardCoreSailor.BooksPaid());
		
		HardCoreSailor.ReceiveBooks();
		
		assertTrue(HardCoreSailor.BooksPaid());
		
		HardCoreSailor.BuyLaterBook("Book4");
		
		assertTrue(HardCoreSailor.willBuyLater("Book4"));
		
		
	}

}
