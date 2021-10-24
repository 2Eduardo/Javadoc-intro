package com.study.model;

/**
 * Model for an item.
 * 
 * @author eduardoluis
 * @version 1.0.0
 * @since Release 1.0.0
 * 
 */
public class Item {
	private String name;
	private Integer value;

	/**
	 * Public constructor.
	 * 
	 * @param name  of the item.
	 * @param value of the item.
	 * 
	 */
	public Item(String name, Integer value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * 
	 * @return Current item value.
	 */
	public Integer getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.name + "\t" + value;
	}

}
