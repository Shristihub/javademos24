package com.shristi.lang;

import java.util.Objects;

public class Mobile {
	private String brand;
	private String model;
	private String color;
	public Mobile(String brand, String model, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand,model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return Objects.equals(brand, other.brand)&& Objects.equals(model, other.model);
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", color=" + color + "]";
	}
	
	
}
