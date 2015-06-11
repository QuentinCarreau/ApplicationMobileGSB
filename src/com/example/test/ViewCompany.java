package com.example.test;

import org.apache.http.Header;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class ViewCompany extends Activity {
	@Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company);
        
		final TextView wTVresult = (TextView) findViewById(R.id.wTVresult);
	    AsyncHttpClient client = new AsyncHttpClient();
	    
	    client.get("http://213.41.212.217/~fendres/ws/?company/1", new AsyncHttpResponseHandler() {
	    	
	    	@Override 
	    	public void onStart() {
	    		wTVresult.setText("loading...");
	    		
	    	}
	
			@Override
			public void onFailure(int statusCode, Header[] headers, byte[] response, Throwable e) {
				wTVresult.setText(e.getMessage());
				
			}
	
			@Override
			public void onSuccess(int statusCode, Header[] headers, byte[] response) {
				String s = new String(response);				
				
				Gson builder = new Gson();
				Company c = builder.fromJson(s, Company.class);
				
				wTVresult.setText(c.id+ " "+c.name+ " "+c.town+ " "+c.contact+ " "+c.email+ " "+c.phone+" "+c.website);
			} 	
	    });
	    
	}

	public void wBTok_onclick (View v) {
		finish();
	}

}
