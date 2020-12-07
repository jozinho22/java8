package model;

import java.math.BigDecimal;

public class Product {

	private String name;
	private BigDecimal  qty;
	private BigDecimal  price;
	
	
	public Product(String name, BigDecimal  qty, BigDecimal  price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal  getQty() {
		return qty;
	}
	public void setQty(BigDecimal  qty) {
		this.qty = qty;
	}
	public BigDecimal  getPrice() {
		return price;
	}
	public void setPrice(BigDecimal  price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
}
