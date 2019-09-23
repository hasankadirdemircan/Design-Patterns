package com.hkdemircan;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		customer1.setCustomerName("Hasan");

		Customer customer2 = new Customer();
		customer2.setCustomerName("Kadir");

		Product iphone7 = new Product();
		iphone7.setProductName("Apple Iphone 7");
		iphone7.setAvailable(false);
		
		//iphone7 geldiğinde bildirim almak istiyorlar.
		iphone7.registerObserver(customer1);
		iphone7.registerObserver(customer2);

		// ürün geldi.
		iphone7.setAvailable(true);

		// ürün bitti
		iphone7.setAvailable(false);

		// customer1 üründen haber almaktan vazgeçti.
		iphone7.removeObserver(customer1);

		// ürün geldi.
		iphone7.setAvailable(true);

	}

}
