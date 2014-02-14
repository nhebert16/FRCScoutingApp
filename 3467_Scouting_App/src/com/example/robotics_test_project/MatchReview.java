package com.example.robotics_test_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class MatchReview extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_match_review);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.match_review, menu);
		return true;
	}
    public void startBluetoothPairedDeviceSelect (View view) {
    	Intent intent = new Intent (this, MainActivity.class) ;
    	startActivity(intent);
    }
	public void generateNoteOnSD(View view){
		//try {
			 
	//		Context context = getApplicationContext();
	 //       CharSequence text2 = "text was written";
	 //       int duration = Toast.LENGTH_SHORT;
			
	//		File("/sdcard/FRCScoutingApp", "TestText");	
	        
	//		  Toast toast = Toast.makeText(context, text2, duration);
	 //           toast.show();
	//		} catch (java.io.IOException e) {
	//		  //do something if an IOException occurs.
	//		}
	}
}
