package app_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import app.StockBag;

public class StockBagTest {
	
	@Test
	void getGrandTotalTest() {
		StockBag theBag = new StockBag(100);
		theBag.insert("GOOG", 100.0, 140.0);
		theBag.insert("NVDA", 100.0, 892.40);
		theBag.insert("TSLA", 50.0, 171.66);
		assertEquals(500000.0, theBag.getGrandTotal(), 0.0000001);
	}
}
