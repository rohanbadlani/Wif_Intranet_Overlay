package com.draft1.wifiintranetoverlay;


import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Campus_News extends ListActivity {
	private static String LOGCAT = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			SQLiteController controller = new SQLiteController(this, "This", null, 2);
			Cursor c = controller.getData4();
			final int size = c.getCount();
			String[] id= new String[size];
			String[] dept= new String[size];
			String[] title= new String[size];
			String[] desc= new String[size];
			int iid=c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID);
			int idept=c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT);
			int ititle=c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE);
			int idesc=c.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC);
			
			int i;
			for(c.moveToFirst(),i=0;!c.isAfterLast();c.moveToNext(),i++){
				
				id[i] = c.getString(iid);
				dept[i] = c.getString(idept);
				title[i] = c.getString(ititle);
				desc[i] = c.getString(idesc); 
				
			}
			
//		
			
			Log.d(LOGCAT," \nDONE DONE DONE !!!");
			
			
			
			
			String[] values1 = new String[] { "Android", "iPhone", "WindowsMobile",
		        "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
		        "Linux", "OS/2" };
		    String[] values2 = new String[] { "Android2", "iPhone2", "WindowsMobile2",
		            "Blackberry2", "WebOS2", "Ubuntu2", "Windows72", "Max OS X2",
		            "Linux2", "OS/22" };
		    
		    MySimpleArrayAdapter1 adapter = new MySimpleArrayAdapter1(this, title, desc, dept);
		    //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.rowlayout, R.id.label, values);
		    setListAdapter(adapter);
		    
		  }

		  @Override
		  protected void onListItemClick(ListView l, View v, int position, long id) {
		    String item = (String) getListAdapter().getItem(position);
		    Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
		  }

}
