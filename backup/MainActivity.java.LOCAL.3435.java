package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
//import android.util.Log;								   //pour débogger

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void wBTdoCalc_onclick(View view) {
		EditText ETnb1 = (EditText) findViewById(R.id.wETnb1);
		EditText ETnb2 = (EditText) findViewById(R.id.wETnb2);
		String s_nb1 = ETnb1.getText().toString();
		String s_nb2 = ETnb2.getText().toString();
		//Log.d("DEBUG", s_nb1);
		TextView TVresult = (TextView) findViewById(R.id.wTVresult);
		if (! s_nb1.isEmpty() && ! s_nb2.isEmpty()) {
			int nb1 = Integer.parseInt(s_nb1);
			int nb2 = Integer.parseInt(s_nb2);
			int result = nb1 + nb2;	
			TVresult.setText(Integer.toString(result));
		} else {
			TVresult.setText("");
		}
	}
}
