package com.draft1.wifiintranetoverlay;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyListAdapter  extends BaseAdapter{
    
    private Context mContext;
    Cursor cursor;
    public MyListAdapter(Context context, Cursor cur) 
    {
            super();
            mContext=context;
            cursor=cur;
           
    }
       
    public int getCount() 
    {
        // return the number of records in cursor
        return cursor.getCount();
    }

    // getView method is called for each item of ListView
    public View getView(int position,  View view, ViewGroup parent) 
    {
                    // inflate the layout for each item of listView
                    LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    view = inflater.inflate(R.layout.rowlayout, null);
            
                    // move the cursor to required position 
                    cursor.moveToPosition(position);
                    
                    // fetch the sender number and sms body from cursor
                    String name=cursor.getString(cursor.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME));
                    String id=cursor.getString(cursor.getColumnIndex(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID));
                   
                    // get the reference of textViews
                    TextView textViewId=(TextView) view.findViewById(R.id.label);
                    TextView textViewName=(TextView) view.findViewById(R.id.desc);
                    
                    // Set the Sender number and smsBody to respective TextViews 
                    textViewId.setText("id");
                    textViewName.setText("name");
                    
        
                    return view;
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
}
