package com.draft1.wifiintranetoverlay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Welcome extends Activity {
	private static final String LOGCAT = null;
	private static SQLiteController controller;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		controller = new SQLiteController(this, "WifiIntranet1.db", null, 1);
		controller.insertData();
		controller.insertData2();
		controller.insertData3();
		controller.insertData4();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}
	
	public void login_check(View view){
			Intent intent = new Intent(this, LoginSuccess.class);
			EditText edittext1 = (EditText) findViewById(R.id.username);
			EditText edittext2 = (EditText) findViewById(R.id.password);
			String username = edittext1.getText().toString();
			String password = edittext2.getText().toString();
			intent.putExtra("username", username);
			intent.putExtra("password", password);
			ArrayList<HashMap<String, String>> studentData = controller.getAllStudents();
			Iterator itr = studentData.iterator();
			int flag = 0;
			while(itr.hasNext()){
				HashMap <String,String> data = (HashMap<String,String>) itr.next();
				String db_id = data.get(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID);
				String db_password = data.get(FeedReaderContract.FeedEntry.COLUMN_NAME_PASSWORD);
				if(db_id.equals(username) && db_password.equals(password)){
					Log.d(LOGCAT,"EQUAL");
					flag=1;
					break;
				}
				else{
					Log.d(LOGCAT,"NOTEQUAL");
				}
						
			}
			if(flag==1){
				Toast.makeText(this, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show();
				startActivity(intent);
			}
			else{
				Toast.makeText(this, "INVALID LOGIN ID/PASSWORD", Toast.LENGTH_LONG).show();
			}

	}
}