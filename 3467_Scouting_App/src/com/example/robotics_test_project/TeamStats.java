package com.example.robotics_test_project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TeamStats extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_team_stats);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.team_stats, menu);
		return true;
	}

}
