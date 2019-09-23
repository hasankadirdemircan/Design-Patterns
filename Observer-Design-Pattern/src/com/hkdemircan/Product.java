package com.hkdemircan;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	private String productName;

	private boolean available;

	private List<Observer> listofObservers = new ArrayList<Observer>();

	// ürünün varolup/olmadığı bilgisini döner.
	public boolean isAvailable() {
		return available;
	}

	// ürünün durumunu günceller.
	public void setAvailable(boolean available) {
		this.available = available;
		if (available == true) {
			notifyObservers();
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	// üründen haber almak isteyen müşterileri döner.
	public List<Observer> getListofObservers() {
		return listofObservers;
	}

	public void setListofObservers(List<Observer> listofObservers) {
		this.listofObservers = listofObservers;
	}

	// üründen haber almak isteyen müşteriyi ekler.
	@Override
	public void registerObserver(Observer observer) {
		listofObservers.add(observer);

	}

	// üründen haber almaktan vazgeçen müşteriyi siler.
	@Override
	public void removeObserver(Observer observer) {
		listofObservers.remove(observer);
	}

	// ürün ile ilgili değişikliği haber bekleyen müşterilere bildirir.
	@Override
	public void notifyObservers() {
		System.out.println("Haberdar olmak isteyen müşterilere ürün geldiğinde haber vermektedir.");

		for (Observer observer : listofObservers) {
			observer.update(productName);
		}
	}

}
