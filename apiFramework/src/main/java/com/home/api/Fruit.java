package com.home.api;

public class Fruit {
	
	String name;
	String shape;
	int price;
	public Fruit(String name, String shape, int price) {
		super();
		this.name = name;
		this.shape = shape;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", shape=" + shape + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((shape == null) ? 0 : shape.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
		{
		    System.out.println(this.name + " name  " + name + " Does not match " +other.name);
			return false;
		}
		if (price != other.price) {
		    System.out.println(this.name + " price  " +price + " Does not match " +other.price);

			
			return false;}
		
		if (shape == null) {
			if (other.shape != null)
				return false;
		} else if (!shape.equals(other.shape))
			return false;
		return true;
	}
	
	

}
