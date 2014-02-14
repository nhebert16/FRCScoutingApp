package com.example.robotics_test_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MatchScoutingAuto extends Activity {

	public final static String EXTRA_MESSAGE_BOX1 = "com.example.myfirstapp.EXTRA_MESSAGE_BOX1";
	public final static String EXTRA_MESSAGE_BOX2 = "com.example.myfirstapp.EXTRA_MESSAGE_BOX2";
	public final static String EXTRA_MESSAGE_MOVE = "com.example.myfirstapp.EXTRA_MESSAGE_MOVE";
	public final static String EXTRA_MESSAGE_BALL1 = "com.example.myfirstapp.EXTRA_MESSAGE_BALL1";
	public final static String EXTRA_MESSAGE_BALL2 = "com.example.myfirstapp.EXTRA_MESSAGE_BALL2";
	public final static String EXTRA_MESSAGE_BALL3 = "com.example.myfirstapp.EXTRA_MESSAGE_BALL3";
	public final static String EXTRA_MESSAGE_NAME = "com.example.myfirstapp.EXTRA_MESSAGE_NAME";
	public final static String EXTRA_MESSAGE_NUMBER = "com.example.myfirstapp.EXTRA_MESSAGE_NUMBER";
	public final static String EXTRA_MESSAGE_MATCH = "com.example.myfirstapp.EXTRA_MESSAGE_MATCH";
	
	public String scouter_name;
	public String team_number;
	public String match_number;
	
	private RadioButton button1 = null;
	private RadioButton button2 = null;
	private RadioButton button3 = null;
	private RadioButton button4 = null;
	private RadioButton button5 = null;
	private RadioButton button6 = null;
	private RadioButton button7 = null;
	private RadioButton button8 = null;
	private RadioButton button9 = null;
	private RadioButton button10 = null;
	private RadioButton button11 = null;
	private RadioButton button12 = null;
	private RadioButton button13 = null;
	private RadioButton button14 = null;
	private RadioButton button15 = null;
	private RadioButton button16 = null;
	private RadioButton button17 = null;
	private RadioButton button18 = null;
	private RadioButton button19 = null;
	private RadioButton button20 = null;
	public String string_button1 = "They did move. ";
	public String string_button2 = "They did not move. ";
	public String string_button3 = "Ball 1 was a high goal. ";
	public String string_button4 = "Ball 1 was a low goal. ";
	public String string_button5 = "Ball 1 was a hot-high goal. ";
	public String string_button6 = "Ball 1 was a hot-low goal. ";
	public String string_button7 = "Ball 1 was not shot. ";
	public String string_button8 = "Ball 1 missed. ";
	public String string_button9 = "Ball 2 was a high goal. ";
	public String string_button10 = "Ball 2 was a low goal. ";
	public String string_button11 = "Ball 2 was a hot-high goal. ";
	public String string_button12 = "Ball 2 was a hot-low goal";
	public String string_button13 = "Ball 2 was not shot. ";
	public String string_button14 = "Ball 2 missed. ";
	public String string_button15 = "Ball 3 was a high goal. ";
	public String string_button16 = "Ball 3 was a low goal. ";
	public String string_button17 = "Ball 3 was a hot-high goal. ";
	public String string_button18 = "Ball 3 was a hot-low goal. ";
	public String string_button19 = "Ball 3 was not shot. ";
	public String string_button20 = "Ball 3 missed";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_match_scouting_auto);
		Intent intent = getIntent();

		// define all of the strings
		String scouter_name = intent
				.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_NAME);
		String team_number = intent
				.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_NUMBER);
		String match_number = intent
				.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_MATCH);

		// displaying the variables of the team name, team number, and match
		// number

		TextView textView1 = (TextView) this
				.findViewById(R.id.display_entered_scouter_name);
		textView1.setText(String.valueOf(scouter_name));

		TextView textView2 = (TextView) this
				.findViewById(R.id.display_entered_team_number);
		textView2.setText(String.valueOf(team_number));

		TextView textView3 = (TextView) this
				.findViewById(R.id.display_entered_match_number);
		textView3.setText(String.valueOf(match_number));

		button1 = (RadioButton) findViewById(R.id.yes_they_moved);
		button2 = (RadioButton) findViewById(R.id.no_they_didnt_move);
		button3 = (RadioButton) findViewById(R.id.radio_button_low1);
		button4 = (RadioButton) findViewById(R.id.radio_button_high1);
		button5 = (RadioButton) findViewById(R.id.radio_button_hot_high1);
		button6 = (RadioButton) findViewById(R.id.radio_button_hot_low1);
		button7 = (RadioButton) findViewById(R.id.radio_button_no_shot1);
		button8 = (RadioButton) findViewById(R.id.radio_button_missed1);
		button9 = (RadioButton) findViewById(R.id.radio_button_low2);
		button10 = (RadioButton) findViewById(R.id.radio_button_high2);
		button11 = (RadioButton) findViewById(R.id.radio_button_hot_high2);
		button12 = (RadioButton) findViewById(R.id.radio_button_hot_low2);
		button13 = (RadioButton) findViewById(R.id.radio_button_no_shot2);
		button14 = (RadioButton) findViewById(R.id.radio_button_missed2);
		button15 = (RadioButton) findViewById(R.id.radio_button_low3);
		button16 = (RadioButton) findViewById(R.id.radio_button_high3);
		button17 = (RadioButton) findViewById(R.id.radio_button_hot_high3);
		button18 = (RadioButton) findViewById(R.id.radio_button_hot_low3);
		button19 = (RadioButton) findViewById(R.id.radio_button_no_shot3);
		button20 = (RadioButton) findViewById(R.id.radio_button_missed3);
		

	}

	public void startMatchScoutingMan(View view) {
		Intent intent = getIntent();

		// define all of the strings
		String scouter_name = intent
				.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_NAME);
		String team_number = intent
				.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_NUMBER);
		String match_number = intent
				.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_MATCH);
		
		Intent intent2 = new Intent(this, MatchScoutingMan.class);

		if (button1.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_MOVE, string_button1);
		}
		if (button2.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_MOVE, string_button2);
		} 
		if (button3.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL1, string_button3);
		}
		if (button4.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL1, string_button4);
		}
		if (button5.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL1, string_button5);
		}
		if (button6.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL1, string_button6);
		}
		if (button7.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL1, string_button7);
		}
		if (button8.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL1, string_button8);
		}
		if (button9.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL2, string_button9);
		}
		if (button10.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL2, string_button10);
		}
		if (button11.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL2, string_button11);
		}
		if (button12.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL2, string_button12);
		}
		if (button13.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL2, string_button13);
		}
		if (button14.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL2, string_button14);
		}
		if (button15.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL3, string_button15);
		}
		if (button16.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL3, string_button16);
		}
		if (button17.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL3, string_button17);
		}
		if (button18.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL3, string_button18);
		}
		if (button19.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL3, string_button19);
		}
		if (button20.isChecked()) {
			intent2.putExtra(EXTRA_MESSAGE_BALL3, string_button20);
		}
		intent2.putExtra(EXTRA_MESSAGE_NAME, scouter_name);
		intent2.putExtra(EXTRA_MESSAGE_MATCH, match_number);
		intent2.putExtra(EXTRA_MESSAGE_NUMBER, team_number);
		startActivity(intent2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.match_scouting_auto, menu);
		return true;
	}

	/*public void submitTeamData(View view) {

		DatabaseHandler db = new DatabaseHandler(this);

		Intent intent = getIntent();

		// define all of the strings
		String scouter_name = intent
				.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_NAME);
		String team_number = intent
				.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_NUMBER);

		Log.d("Insert: ", "Inserting ..");
		db.addTeam(new Team(team_number, scouter_name));
		// db.addContact(new Contact("Srinivas", "9199999999"));
		// db.addContact(new Contact("Tommy", "9522222222"));
		// db.addContact(new Contact("Karthik", "9533333333"));

		// Reading all contacts
		// Log.d("Reading: ", "Reading all contacts..");
		// List<Contact> contacts = db.getAllContacts();

		// for (Contact cn : contacts) {
		// String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() +
		// " ,Phone: " + cn.getPhoneNumber();
		// Writing Contacts to log
		// Log.d("Name: ", log);
		// }
		*/// }
		// }
	}
