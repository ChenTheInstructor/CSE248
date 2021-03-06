package p6;

import java.util.Iterator;

public class DinerMenu implements Menu{
	private static final int MAX_ITEMS= 6;
	private MenuItem[] menuItems;
	private int numberOfItems;
	
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT",
				"(Fakin')Bacon with Letterce & tomato on whole wheat", true, 2.99);
						
		addItem("BLT",
				"Bacon with Letterce & tomato on whole wheat", false, 2.99);
		
		addItem("Soup of the day",
				"Soup of the day, with a side of potato salad", false, 3.29);
		
		addItem("Hotdog",
				"A hotdog, with saukraut, relish, onipons, topped with cheese" , false, 3.05);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry, menu is full! Cannot add item to the menu.");
		} else {
			menuItems[numberOfItems++] = menuItem;
		}
	}
	
//	public MenuItem[] getMenuItems() {
//		return menuItems;
//	}
	@Override
	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
}
