package com.example.robotics_test_project;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MatchScoutingIntro extends Activity {
	
	public final static String EXTRA_MESSAGE_NAME = "com.example.myfirstapp.EXTRA_MESSAGE_NAME";
	public final static String EXTRA_MESSAGE_NUMBER = "com.example.myfirstapp.EXTRA_MESSAGE_NUMBER";
	public final static String EXTRA_MESSAGE_MATCH = "com.example.myfirstapp.EXTRA_MESSAGE_MATCH";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_match_scouting_intro);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.match_scouting_intro, menu);
		return true;
	}
	
	public void startActivityMatchScoutingAuto (View view) {
    	Intent intent = new Intent (this, MatchScoutingAuto.class);
    	EditText scouterName = (EditText) findViewById(R.id.enter_name);
    	EditText teamNumber = (EditText) findViewById(R.id.enter_team);
    	EditText matchNumber = (EditText) findViewById(R.id.enter_match);
    	String scouter_name = scouterName.getText().toString();
    	String team_number = teamNumber.getText().toString();
    	String match_number = matchNumber.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE_NAME, scouter_name);
    	intent.putExtra(EXTRA_MESSAGE_NUMBER, team_number);
    	intent.putExtra(EXTRA_MESSAGE_MATCH, match_number);
    	startActivity(intent);
	}

}
