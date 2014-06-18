package com.draft1.wifiintranetoverlay;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class COURSE_LIST extends ListActivity {
	private static String LOGCAT = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			SQLiteController controller = new SQLiteController(this, "This", null, 2);
			Cursor c = controller.getData2();
			Intent intent= getIntent();
			String user_id=intent.getExtras().get("username").toString();
			
			final int size = c.getCount();
		
			//String[] student_id= new String[size];
			String check_id;
			String[] course_id= new String[size];
			String[] course_name= new String[size];
			//String[] desc= new String[size];
			
			int isid=c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID);
			int icid=c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID);
			int ititle=c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME);
			//int idesc=c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC);
			
			int i=0;
			
			
			
			for(c.moveToFirst();!c.isAfterLast();c.moveToNext()){
				
				check_id =  c.getString(isid);
				
				if(check_id.equals(user_id)){
					
					course_id[i] = c.getString(icid);
					course_name[i] = c.getString(ititle);
					i++;
					
				}
				
				
				//desc[i] = c.getString(idesc); 
				
			}
			final int temp_size = i;
			
			String[] temp_isid= new String[temp_size];
			String[] temp_icid= new String[temp_size];
			
			for(int j=0;j<temp_size;j++){
				temp_isid[j]=course_id[j];
				temp_icid[j]=course_name[j];
				
			}
			
	
			
			/*
			 * 
		//lite additions	 
			for(c.moveToFirst(),i=0;!c.isAfterLast();c.moveToNext(),i++){
				
				course_id[i] = c.getString(icid);
				course_name[i] = c.getString(ititle);
				//title[i] = c.getString(ititle);
				///desc[i] = c.getString(idesc); 
				
			}
			
			
			Log.d(LOGCAT," \nDONE DONE DONE !!!");
			
			
			
			
			String[] values1 = new String[] { "Android", "iPhone", "WindowsMobile",
		        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		        "Linux", "OS/2" };
		    String[] values2 = new String[] { "Android2", "iPhone2", "WindowsMobile2",
		            "Blackberry2", "WebOS2", "Ubuntu2", "Windows72", "Max OS X2",
		            "Linux2", "OS/22" };
		
		    */
		    MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, temp_isid, temp_icid);
		    //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.rowlayout, R.id.label, values);
		    setListAdapter(adapter);

		    
		
		    
		  }



		  @Override
		  protected void onListItemClick(ListView l, View v, int position, long id) {
		    String item = (String) getListAdapter().getItem(position);
		    Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
		  }

}
