package com.study.model;

/**
 * Model for the Orders.
 * 
 * @author eduardoluis
 * @version 1.0.0
 * @since Release 1.0.0
 * 
 */
public class Order {
	private final String code;
	private Item[] items;

	/**
	 * Constructor.
	 * 
	 * @param items list of items.
	 * @param code unique representation.
	 * 
	 */
	public Order(Item[] items, String code) {
		this.code = code;
		this.items = items;
	}

	/**
	 * 
	 * @return Current items in the Order.
	 */
	public Item[] getItems() {
		return items;
	}
	
}
