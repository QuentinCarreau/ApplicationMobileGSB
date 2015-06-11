package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.Intent;

//import android.util.Log;								   //pour débogger

public class MainActivity extends Activity {

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);      
		    
    }
    
    public void wBgeoloc_onClick(View view) {
    	Intent i = new Intent(this, Geoloc.class);
    	startActivity(i);
    }
    
    public void wBcompany_onClick(View view) {
    	Intent i = new Intent(this, ViewCompany.class);
    	startActivity(i);
    }
    
    public void wBbook_onClick(View view) {
    	Intent i = new Intent(this, ViewBook.class);
    	startActivity(i);
    }
    
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
		parent.getItemAtPosition(pos).toString();	
		
	}

	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
	}
    
    

}
