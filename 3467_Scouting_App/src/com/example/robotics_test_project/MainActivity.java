package com.example.robotics_test_project;

import java.io.File;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	private static final int REQUEST_ENABLE_BT = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		new ArrayAdapter<String>(this, R.layout.bluetooth_device);

		Context context = getApplicationContext();
		CharSequence text1 = "Folder successfully created";
		CharSequence text2 = "Fold is already created";
		int duration = Toast.LENGTH_SHORT;

		BluetoothAdapter mBluetoothAdapter = BluetoothAdapter
				.getDefaultAdapter();

		if (mBluetoothAdapter == null) {
			// Device does not support Bluetooth
		}

		// request to enable bluetooth
		if (!mBluetoothAdapter.isEnabled()) {
			Intent enableBtIntent = new Intent(
					BluetoothAdapter.ACTION_REQUEST_ENABLE);
			startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
		}

		File FRCScoutingApp = new File("/sdcard/FRCScoutingApp");
		if (FRCScoutingApp.exists()) {
			Toast toast = Toast.makeText(context, text2, duration);
			toast.show();
		}
		if (!FRCScoutingApp.exists()) {
			FRCScoutingApp.mkdir();
			Toast toast = Toast.makeText(context, text1, duration);
			toast.show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void startMatchScoutingIntro(View view) {
		Intent intent = new Intent(this, MatchScoutingIntro.class);
		startActivity(intent);
	}

	public void startPitScouting(View view) {
		Intent intent = new Intent(this, PitScouting.class);
		startActivity(intent);
	}

	public void startTeamStats(View view) {
		Intent intent = new Intent(this, TeamStats.class);
		startActivity(intent);

	}

	public boolean isExternalStorageWritable() {
		String state = Environment.getExternalStorageState();
		if (Environment.MEDIA_MOUNTED.equals(state)) {
			return true;
		}
		return false;
	}
}
