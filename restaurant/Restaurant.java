package restaurant;

import restaurant.Menu;
import restaurant.MenuItem;

import java.time.LocalDateTime;

public class Restaurant {

	public static void main (String[] args) {
		LocalDateTime now = LocalDateTime.now();

		MenuItem salad = new MenuItem(1, "salad", "appetizer", "Simple Salad", 1.50, now);
		MenuItem pasta = new MenuItem(2, "pasta", "meal", "Neat pasta", 5.23, now);
		MenuItem cake = new MenuItem(3, "cake", "dessert", "Delicious cake", 4.21, now);

		Menu menu = new Menu();

		menu.addItem(salad);
		menu.addItem(pasta);
		menu.addItem(cake);

		System.out.print(menu.printAll());
		System.out.println("===================");

		menu.removeItem(1);
		System.out.print(menu.printAll());
	}
}
