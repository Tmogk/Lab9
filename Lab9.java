package co.grandcircus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String foodAdded;
		ArrayList<String> foodName = new ArrayList<>();
		foodName.add("Apple");
		foodName.add("Banana");
		foodName.add("Cauliflower");
		foodName.add("Dragonfruit");
		foodName.add("Elderberry");
		foodName.add("Figs");
		foodName.add("Grapefruit");
		foodName.add("Honeydew");

		ArrayList<Double> foodPrice = new ArrayList<>();
		foodPrice.add(0.99);
		foodPrice.add(0.59);
		foodPrice.add(1.59);
		foodPrice.add(2.19);
		foodPrice.add(1.79);
		foodPrice.add(2.09);
		foodPrice.add(1.99);
		foodPrice.add(3.49);

		Map<String, Double> items = new HashMap<>();
		items.put("Apple", 0.99);
		items.put("Banana", 0.59);
		items.put("Cauliflower", 1.59);
		items.put("Dragonfruit", 2.19);
		items.put("Elderberry", 1.79);
		items.put("Figs", 2.09);
		items.put("Grapefruit", 1.99);
		items.put("Honeydew", 3.49);
		System.out.println(items);

		System.out.println("What food would you like to add to cart?");
		foodAdded = scnr.next();

		foodName.add(foodAdded);

		System.out.println("Adding " + foodName + " to cart at " + foodPrice.toString());

		// do {
//
//			for (String itemName : items.keySet()) {
//				System.out.printf("%-12s %-12.2f", itemName, items.get(itemName));
//				System.out.println();
//				System.out.println("Adding " + arrList1.toString());
//			}
//			userChoice = Validator.getString(scnr, "Pick an item!");
//
//			System.out.println("Would you like to keep shopping?");
//
//			userChoice = Validator.getString(scnr, "y/n");
//
//		} while (userChoice == "y");

	}

}
