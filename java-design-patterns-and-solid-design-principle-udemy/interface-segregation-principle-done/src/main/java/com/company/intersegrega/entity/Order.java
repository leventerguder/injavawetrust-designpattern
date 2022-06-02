package com.company.intersegrega.entity;

import java.time.LocalDateTime;

//Order entity class
public class Order extends Entity {

	private LocalDateTime orderPlacedOn;
	
	private double totalValue;

	public LocalDateTime getOrderPlacedOn() {
		return orderPlacedOn;
	}

	public void setOrderPlacedOn(LocalDateTime orderPlacedOn) {
		this.orderPlacedOn = orderPlacedOn;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
}
