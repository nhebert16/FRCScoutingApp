package com.example.robotics_test_project;

import java.io.File;
import java.util.UUID;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.content.pm.ResolveInfo;
import android.view.Menu;
import android.widget.Toast;
import android.bluetooth.*;

public class TextSender extends Activity {
	

	File sdCard = Environment.getExternalStorageDirectory();
	private static UUID generalUuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
	private static BluetoothSocket socket;
	
	String packageName = null;
	String className = null;
	boolean found = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_sender);

		BluetoothAdapter BA;
		BA = BluetoothAdapter.getDefaultAdapter();
		
		/*Intent intent = new Intent();
		intent.setAction(Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtraUri(
				Intent.EXTRA_STREAM,
				Uri.fromFile(sdCard.getAbsolutePath()
						+ "/FRCScoutingApp/Test_Name.txt"));
		startActivity(intent);

		PackageManager pm = getPackageManager();
		List<ResolveInfo> appsList = pm.queryIntentActivities( intent, 0);

		
		for (ResolveInfo info : appsList) {
			packageName = info.activityInfo.packageName;
			if (packageName.equals("com.android.bluetooth")) {
				className = info.activityInfo.name;
				found = true;
				break;// found
			}
		*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.text_sender, menu);
		return true;
	}

}
