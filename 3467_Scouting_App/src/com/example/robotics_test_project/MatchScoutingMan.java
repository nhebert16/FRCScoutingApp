package com.example.robotics_test_project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MatchScoutingMan extends Activity {
	
	public String file_name = "File_Name.txt";
	public String file_name_new;
	
	public String scouter_name;
	public String team_number;
	public String match_number;
	
    public String string_radioGroup1;
    public String string_radioGroup2;
    public String string_radioGroup3;
    public String string_radioGroup4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_match_scouting_man);
		
		//recieves intent
		Intent intent = getIntent();
		//pulls extra check box content from intent
		String radioGroup1 = intent.getStringExtra(MatchScoutingAuto.EXTRA_MESSAGE_MOVE);
		String radioGroup2 = intent.getStringExtra(MatchScoutingAuto.EXTRA_MESSAGE_BALL1);
		String radioGroup3 = intent.getStringExtra(MatchScoutingAuto.EXTRA_MESSAGE_BALL2);
		String radioGroup4 = intent.getStringExtra(MatchScoutingAuto.EXTRA_MESSAGE_BALL3);
		String scouter_name = intent.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_NAME);
		String team_number = intent.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_NUMBER);
		String match_number = intent.getStringExtra(MatchScoutingIntro.EXTRA_MESSAGE_MATCH);
		
		String string_radioGroup1 = radioGroup1;
		String string_radioGroup2 = radioGroup2;
		String string_radioGroup3 = radioGroup3;
		String string_radioGroup4 = radioGroup4;

		
		//displays if checkbox carried
		TextView textView1 = (TextView) this.findViewById(R.id.display_box1);
			textView1.setText(String.valueOf(radioGroup1));
			
		    
			File sdCard = Environment.getExternalStorageDirectory();
			File dir = new File (sdCard.getAbsolutePath() + "/FRCScoutingApp");

			file_name_new = team_number + ", " + match_number + ", " + scouter_name +".txt";
			
			File file = new File(dir, file_name);

			try {
				FileOutputStream f = new FileOutputStream(file);
				try {
					f.write(string_radioGroup1.getBytes());
					f.write("\n".getBytes());
					f.write(string_radioGroup2.getBytes());
					f.write("\n".getBytes());
					f.write(string_radioGroup3.getBytes());
					f.write("\n".getBytes());
					f.write(string_radioGroup4.getBytes());
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	 }
			
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.match_scouting_man, menu);
		return true;
	}
    public void startMatchReview (View view) {
    	Intent intent = new Intent (this, MatchReview.class) ;
    	startActivity(intent);
    }
}
