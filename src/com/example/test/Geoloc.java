package com.example.test;
import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Geoloc extends Activity implements LocationListener{
	@Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.geoloc);
        
        try {
			LocationManager locationManager = (LocationManager)	getSystemService(LOCATION_SERVICE);
			if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
				locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 0, this);
			}
		} catch (Exception e) {
		        e.printStackTrace();
		}
	}
	@Override 
    public void onLocationChanged(Location location) {
		if (location != null) {
			double lat = location.getLatitude();
			double lon = location.getLongitude();
			TextView geoloc = (TextView)  findViewById(R.id.wTVgeoloc);
			geoloc.setText(lat+" "+lon+ "gps");
		}
		
	}

	@Override
	public void onProviderDisabled(String provider) {
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		
	}
	public void wBTok_onclick (View v) {
		finish();
	}

}
