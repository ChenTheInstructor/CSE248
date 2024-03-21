package app_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.Stock;

public class StockTest {
	
	@Test
	void getTotalTest() {
		Stock stock = new Stock("AAPL", 1000.0, 137.50);
		assertEquals(137500.0, stock.getTotal(), 0.000001);
	}
	
	
}
