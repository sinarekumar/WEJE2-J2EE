package com.jspider.godown.resource;

public class Godown {
	int storeProduct;

	public Godown(int storeProduct) {
		System.out.println("avalible product "+ storeProduct);
		this.storeProduct = storeProduct;
	}
	public int checkProduct() {
		return this.storeProduct;
	}
	public synchronized void orderProduct(int storeProduct) {
		System.out.println("ordering the product "+storeProduct);
		if (storeProduct>checkProduct()) {
			try {
				System.out.println("customer ordering "+storeProduct+" Product");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.storeProduct-=storeProduct;
			System.out.println("Successfully delivered "+ storeProduct +" Product");
			System.out.println(checkProduct()+" Product available");
			}
	
	}
	public synchronized void orderSupply(int storeProduct) {
		this.storeProduct += storeProduct;
		System.out.println("Suppling "+storeProduct+" order");
		System.out.println(checkProduct()+" Product Available");
		this.notify();
		
	}
}
