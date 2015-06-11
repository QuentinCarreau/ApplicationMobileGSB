package com.example.test.models;
import com.orm.SugarRecord;

public class Book extends SugarRecord<Book> {
	public String author;
	public String title;

	
	public Book() {} /* obligatoire pour SugarORM */
	public Book(String title, String author){
		this.title = title;
		this.author = author;

	}
	@Override 
	public String toString() {
		return this.id+ ". "+this.title+" ("+this.author+")";
	}
}