package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order o1 = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		
		System.out.println(o1);
		
	}

}
