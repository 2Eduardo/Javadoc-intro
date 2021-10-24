package com.study.controllers;

import java.util.ArrayList;

import com.study.model.Item;
import com.study.model.Order;
import com.study.services.OrderService;

/**
 * Use the requested items to create a new Order.
 * 
 * @author eduardoluis
 * @version 1.0.0
 * @see com.study.model.Order
 * @see com.study.services.OrderService
 * @since Release 1.0.0
 * 
 */
public class OrderController {
	/**
	 * Handle with the order construction.
	 * 
	 * @param items list
	 * @return the final value for the order.
	 */
	public static double handle(Item[] items) {
		Order order = new Order(removeNull(items), "1");
		OrderService service = new OrderService();
		return service.execute(order).doubleValue();
	}

	/**
	 * Remove null elements of the items array.
	 * 
	 * @param items
	 * @return A new array of items without null elements.
	 */
	private static Item[] removeNull(Item[] items) {
		ArrayList<Item> items_list = new ArrayList<>();

		for (Item item : items) {
			if (item != null) {
				items_list.add(item);
			}
		}
		return items_list.toArray(new Item[0]);
	}
}
