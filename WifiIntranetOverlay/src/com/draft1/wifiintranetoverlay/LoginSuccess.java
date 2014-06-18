package com.draft1.wifiintranetoverlay;

import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginSuccess extends Activity {
	//@SupressLint("NewAPI")
	private static String username;
	private static String password;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_success);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		Intent intent = getIntent();
		setContentView(R.layout.activity_login_success);	
		username = intent.getExtras().get("username").toString();
		password = intent.getExtras().getString("password").toString();
		TextView textview = (TextView) findViewById(R.id.textView9);
		
		textview.setText("Hi " + password);
		textview.setTextSize(15);
		textview.setTextColor(android.graphics.Color.WHITE);
		//textview.setTextColor(1);
		//TextView textview2 = new TextView(this);
		//textview2.setText("Hi ");
		//textview2.setTextSize(40);
		
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater menuinflator = getMenuInflater();
		menuinflator.inflate(R.menu.action_buttons, menu);
		menuinflator.inflate(R.menu.login_success, menu);
		return true;
	}
	public void campusnews(View view){
		Intent intent1 = new Intent(this, Campus_News.class);
		intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		startActivity(intent1);
	}
	public void courses(View view){
		Intent intent1 = new Intent(this, COURSE_LIST.class);
		intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		startActivity(intent1);
	}
	public void web_services(View view){
		//Intent intent1 = new Intent(this, COURSE_LIST.class);
		//intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		//startActivity(intent1);
		//Toast.makeText(this, " Under Constuction ", Toast.LENGTH_LONG).show();
		//Button button_webservice = (Button) findViewById(R.id.imageButton4);
		//Pattern pattern = Pattern.compile("www.google.com");
		Intent i = new Intent();
		i.setAction(Intent.ACTION_VIEW);
		i.addCategory(Intent.CATEGORY_BROWSABLE);
		i.setData(Uri.parse("http://universe.bits-pilani.ac.in:12349/Login.aspx"));
		startActivity(i);
	}
	public void oasis(View view){
		Intent intent1 = new Intent(this, COURSE_LIST.class);
		intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		//startActivity(intent1);
		//Toast.makeText(this, " Under Constuction ", Toast.LENGTH_LONG).show();
		
		//new code
		
//		Intent i = new Intent(Intent.ACTION_MAIN);
//		PackageManager manager = getPackageManager();
//		i = manager.getLaunchIntentForPackage("com.example.myfirstapplication");
//		i.addCategory(Intent.CATEGORY_LAUNCHER);
//		startActivity(i);
		Intent i = new Intent();
		i.setAction(Intent.ACTION_VIEW);
		i.addCategory(Intent.CATEGORY_BROWSABLE);
		i.setData(Uri.parse("http://www.bits-oasis.org/"));
		startActivity(i);
		
	}
	public void mess_signings(View view){
		Intent intent1 = new Intent(this, MESS_SIGNING.class);
		intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		//startActivity(intent1);
		//Toast.makeText(this, " Under Constuction ", Toast.LENGTH_LONG).show();
		startActivity(intent1);
		//Intent intent1 = new Intent(this, Campus_News.class);
		//intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		
	}
	public void apogee(View view){
		//Intent intent1 = new Intent(this, COURSE_LIST.class);
		//intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		//startActivity(intent1);
		//Toast.makeText(this, " Under Constuction ", Toast.LENGTH_LONG).show();
		Intent i = new Intent();
		i.setAction(Intent.ACTION_VIEW);
		i.addCategory(Intent.CATEGORY_BROWSABLE);
		i.setData(Uri.parse("http://bits-apogee.org/2014/#"));
		startActivity(i);
	}
	public void bosm(View view){
		//Intent intent1 = new Intent(this, COURSE_LIST.class);
		//intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		//startActivity(intent1);
		//Toast.makeText(this, " Under Constuction ", Toast.LENGTH_LONG).show();
		Intent i = new Intent();
		i.setAction(Intent.ACTION_VIEW);
		i.addCategory(Intent.CATEGORY_BROWSABLE);
		i.setData(Uri.parse("http://bits-bosm.org/2012"));
		startActivity(i);
	}
	public void embryo(View view){
		//Intent intent1 = new Intent(this, COURSE_LIST.class);
		//intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		//startActivity(intent1);
		//Toast.makeText(this, " Under Constuction ", Toast.LENGTH_LONG).show();
		Intent i = new Intent();
		i.setAction(Intent.ACTION_VIEW);
		i.addCategory(Intent.CATEGORY_BROWSABLE);
		i.setData(Uri.parse("http://embryo.bits-pilani.ac.in/"));
		startActivity(i);
	}

}
