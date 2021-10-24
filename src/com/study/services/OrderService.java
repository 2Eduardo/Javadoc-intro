package com.study.services;

import java.math.BigDecimal;

import com.study.model.Item;
import com.study.model.Order;

/**
 * Operations for the Orders.
 * 
 * @author eduardoluis
 * @see Order
 * @version 1.0.0
 * @since Release 1.0.0
 * 
 */
public class OrderService {

	/**
	 * Evaluate the final price.
	 * 
	 * @param order current.
	 * @return The final value for the order.
	 * 
	 */
	public BigDecimal execute(Order order) {
		Item[] items = order.getItems();
		BigDecimal totalValue = new BigDecimal(0);

		for (Item item : items) {
			totalValue = totalValue.add(new BigDecimal(item.getValue()));
		}

		return calculateFee(totalValue);
	}

	/**
	 * Calculate the final value subtracted from its fee.
	 * 
	 * @param totalValue
	 * @return The final value to the Order.
	 * @throws RuntimeException if the value is less than zero.
	 * 
	 */
	private BigDecimal calculateFee(BigDecimal totalValue) throws RuntimeException {
		boolean hasFee;

		if (totalValue.signum() < 0) {
			throw new RuntimeException("The order has a negative value.");
		}

		hasFee = totalValue.compareTo(new BigDecimal(100)) > 0;
		if (hasFee) {
			return totalValue.multiply(new BigDecimal("0.99"));
		}
		return totalValue;
	}

}
