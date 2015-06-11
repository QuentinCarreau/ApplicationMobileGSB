package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View;
import android.content.Intent;
//import android.util.Log;								   //pour débogger

public class MainActivity extends Activity implements OnItemSelectedListener {
	
	TextView selection;
	
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Spinner Scivility = (Spinner) findViewById(R.id.wScivility);
		ArrayAdapter<CharSequence> Aspinner = ArrayAdapter.createFromResource(this, R.array.SAcivility, android.R.layout.simple_spinner_item);
		Aspinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		Scivility.setAdapter(Aspinner);
    }
    
    public void wBTsubView_onclick(View view) {
    	Intent i = new Intent(this, SubActivity.class);
		EditText ETname = (EditText) findViewById(R.id.wETname);
		EditText ETlastName = (EditText) findViewById(R.id.wETlastName);
		String s_name = ETname.getText().toString();
		String s_lastName = ETlastName.getText().toString();
		Spinner SpinnerCivility= (Spinner) findViewById(R.id.wScivility);
//		Scivility.setOnItemSelectedListener(this);
		
		i.putExtra("s_name", s_name);
		i.putExtra("s_lastName", s_lastName);
		i.putExtra("s_Aspinner", SpinnerCivility.getSelectedItem().toString());
		startActivity(i);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
		parent.getItemAtPosition(pos).toString();	
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
}
