package com.home.entity;

public class book {
	
	String title;
	String author;
	String year;
	float price;
	/*
	 * public String getCategory() { return category; } public void
	 * setCategory(String category) { this.category = category; } String category;
	 */
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [title=" + title + ", author=" + author + ", year=" + year + ", price=" + price + "]";
	}
	
	
	

}
