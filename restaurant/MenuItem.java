package restaurant;

import java.time.LocalDateTime;

import java.util.ArrayList;


class MenuItem {

	int id;

	private String name;
	private String category;
	private String description;
	//private String proteinType;

	//private ArrayList<String> allergens;

	//private boolean isVegan;
	//private boolean isAvailable;

	//private int spiceLevel;
	private double price;

	private LocalDateTime dateAdded;

	public MenuItem (int id, String name, String category, String description,
						double price, LocalDateTime dateAdded) {
		this.id = id;

		this.name = name;
		this.category = category;
		this.description = description;

		this.price = price;
		this.dateAdded = dateAdded;		
	}

	@Override
	public String toString() {
		name = this.name.substring(0,1).toUpperCase() + this.name.substring(1);
		category = this.category.substring(0,1).toUpperCase() + this.category.substring(1);

		return category + ": " + name + "\n\t" + this.description + "\n\n";
	}

	@Override
	public boolean equals(Object toBeCompared) {
		MenuItem newItem = (MenuItem) toBeCompared;
		return this.id == newItem.id;
	}
}
