package restaurant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

import restaurant.MenuItem;


class Menu {
	
	private ArrayList<MenuItem> items = new ArrayList<>();
	private MenuItem mostRecent;
	private LocalDateTime lastUpdate;

	public void Menu () {
		this.lastUpdate = LocalDateTime.now();
	}

	public void addItem(MenuItem item) {
		this.items.add(item);
		this.mostRecent = item;
		this.lastUpdate = LocalDateTime.now();
	}

	public MenuItem getItem(int id) {
		for (MenuItem item : this.items) {
			if (id == item.id) {
				return item;
			}
		}

		return null;
	}

	public void removeItem(int id) {
		MenuItem item = this.getItem(id);

		if (item != null) {
			this.items.remove(item);
			this.lastUpdate = LocalDateTime.now();
		}
	}

	public String getUpdate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		return "Last Update: " + this.lastUpdate.format(formatter);
	}

	public String printItem(int id) {
		MenuItem item = this.getItem(id);

		if (item != null) {
			return "\n" + item.toString();
		}
		
		return null;
	}

	public String printAll() {
		String returnString = "\n";

		for (MenuItem item : this.items) {
			returnString += item.toString();
		}

		return returnString;
	}
}
