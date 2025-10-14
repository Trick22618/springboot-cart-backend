package com.example.demo.cart.exception;

// 自訂例外 - 無訂購項目
public class OrderItemEmptyExcpetion extends Exception{
	public OrderItemEmptyExcpetion(String message) {
		super(message);
	}
}
