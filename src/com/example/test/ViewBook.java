package com.example.test;

import java.util.List;

import com.example.test.models.Book;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewBook extends Activity {
	@Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book);
        
        try {
	        List<Book> books = Book.listAll(Book.class);
	        Book b;
	        b = new Book("Dune", "Franck Herbert");
	        b.save();
	        ArrayAdapter<Book> adapter = new ArrayAdapter<Book>(this, android.R.layout.simple_list_item_1, Book.listAll(Book.class));
	        ListView booksList = (ListView) findViewById(R.id.booksList);
	        booksList.setAdapter(adapter);
    
        }
        catch(Exception e) {
        	
        }
		    
    }
	public void wBTok_onclick (View v) {
		finish();
	}

}
