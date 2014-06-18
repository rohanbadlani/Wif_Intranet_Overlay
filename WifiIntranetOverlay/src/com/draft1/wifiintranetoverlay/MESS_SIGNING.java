package com.draft1.wifiintranetoverlay;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MESS_SIGNING extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mess__signing);
		Button button_signup = (Button) findViewById(R.id.signup); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mess__signing, menu);
		return true;
	}

	public void signup(View view){
		//Intent intent1 = new Intent(this, COURSE_LIST.class);
		//intent1.putExtra("username", username);
		//intent1.putExtra("password", password);
		//startActivity(intent1);
		Toast.makeText(this, " Your response has been recorded. ", Toast.LENGTH_LONG).show();
	}
}
