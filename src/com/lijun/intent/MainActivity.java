package com.lijun.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button button_1,button_2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button_1 = (Button)findViewById(R.id.butt1);
		button_2 = (Button)findViewById(R.id.butt2);
	}
	
	public void TestIntent1  (View view){
		Intent intent = new Intent(this, SignInActivity.class);
		startActivity(intent);
		
	}
	
	public void TestIntent2(View view) {
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		String[] recipients = new String[]{"glj2333@163.com"};
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, recipients);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Test");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "This is email's message");
		emailIntent.setType("text/plain");
		startActivity(Intent.createChooser(emailIntent, "Send mail..."));
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
