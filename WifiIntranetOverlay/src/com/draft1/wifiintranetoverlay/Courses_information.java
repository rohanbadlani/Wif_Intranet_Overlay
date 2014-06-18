package com.draft1.wifiintranetoverlay;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class Courses_information extends Activity {
	private static final String LOGCAT = null;
	private static Context context;
	@SuppressWarnings("deprecation")
	protected void onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_courses_information);
		Intent intent = getIntent();
		String id = intent.getExtras().get("username").toString();
		Log.d(LOGCAT, "Username is" + id);
		SQLiteController controller = new SQLiteController(this, "This", null, 2);
		Cursor cursor = controller.getReadableDatabase().rawQuery("Selection * from " + FeedReaderContract.FeedEntry.TABLE_NAME, null);
		
		// which columns map to which layout controls
		String[] fromColumns = new String[] {FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME};
		int[] toControlIDs = new int[] {R.id.label, R.id.desc};
		// use a SimpleCursorAdapter
		ListView listView = (ListView) findViewById(R.id.listView1);
		
		
		
		context=this;
		String[] columns = new String[]{FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME};
        Cursor cursor1 = controller.getWritableDatabase().query(true, FeedReaderContract.FeedEntry.TABLE_NAME, columns, null, null, FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, null, null, null);
        
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.rowlayout, cursor, columns, toControlIDs);
        listView.setAdapter(adapter);
        
        // Create the Adapter
        //MyListAdapter myListAdapter=new MyListAdapter(context,cursor);
        
        // Set The Adapter to ListView
        //listView.setAdapter(myListAdapter);
        
        // to handle click event on listView item
        listView.setOnItemClickListener(new OnItemClickListener()
        {
                public void onItemClick(AdapterView<?> arg0, View v,int position, long arg3)
                {
                    // when user clicks on ListView Item , onItemClick is called 
                    // with position and View of the item which is clicked
                    // we can use the position parameter to get index of clicked item
                    TextView textViewId=(TextView)v.findViewById(R.id.label);
                    TextView textViewName=(TextView)v.findViewById(R.id.desc);
                    String smsSender=textViewId.getText().toString();
                    String smsBody=textViewName.getText().toString();
                    
                    // Show The Dialog with Selected SMS 
                    AlertDialog dialog = new AlertDialog.Builder(context).create();
                    dialog.setTitle("SMS From : "+smsSender);
                    dialog.setIcon(android.R.drawable.ic_dialog_info);
                    dialog.setMessage(smsBody);
                    dialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK",
                            new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) 
                        {
                        
                                dialog.dismiss();
                                return;
                    }    
                    });
                    dialog.show();
                }
            });

	}
}


