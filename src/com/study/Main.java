package com.study;

import java.util.Scanner;

import com.study.controllers.OrderController;
import com.study.model.Item;

/**
 * Main class.
 * 
 * @author eduardoluis
 * @version 1.0.0
 * @see OrderController
 * @since Release 1.0.0
 * 
 */

public class Main {
	/**
	 * A list of items.
	 */
	public static final Item[] ITEMS_LIST = { 
			new Item("T-Shirt", 150), 
			new Item("Pants", 100), 
			new Item("Glove", 30),
			new Item("Hat", 45) };

	/**
	 * Entry point.
	 * 
	 * @param args unused
	 * 
	 */
	public static void main(String[] args) {
		double finalValue;

		System.out.println("-----------ITEMS----------");
		System.out.println("NUMBER\tNAME\tVALUE");
		printListItems();
		System.out.println("--------------------------");
		System.out.println("Type 0 to finish the order.");
		System.out.println("Type the item numbers:");

		finalValue = OrderController.handle(userInputItems());
		
		System.out.println("The final value is " + finalValue);
	}

	/**
	 * Print on command line the available items.
	 */
	public static void printListItems() {
		int i = 1;
		for (Item item : ITEMS_LIST) {
			System.out.println("[" + i + "]" + ":\t" + item);
			i++;
		}
	}

	/**
	 * Get the desired items from the command line, each item is take from the 
	 * item list index.
	 * 
	 * @return An array of items.
	 * 
	 */
	public static Item[] userInputItems() {
		Scanner scan = new Scanner(System.in);
		Item[] result = new Item[10];
		int list_idx;
		int i = 0;
		boolean running = true;

		while (running) {
			list_idx = scan.nextInt();
			if (list_idx == 0) {
				running = false;
			} else if (list_idx <= ITEMS_LIST.length) {
				list_idx--;
				result[i] = ITEMS_LIST[list_idx];
				i++;
			}
		}
		scan.close();
		return result;
	}

}
