package com.home.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class bookstore {
		
	public List<book> book;

	public List<book> getBook() {
		return book;
	}

	public void setBooks(List<book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "bookstore [books=" + book + "]";
	}
	
	

}
