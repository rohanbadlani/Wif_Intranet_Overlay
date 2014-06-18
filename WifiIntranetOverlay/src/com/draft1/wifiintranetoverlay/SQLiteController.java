package com.draft1.wifiintranetoverlay;
import java.util.ArrayList;
import java.util.HashMap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SQLiteController extends SQLiteOpenHelper{
	private static final String LOGCAT = null;
	public SQLiteController(Context context, String name, CursorFactory factory, int version) {
		super(context, "actualdb10.db", null, 1);
		// TODO Auto-generated constructor stub
		 Log.d(LOGCAT," DATABASE Created");
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		// TODO Auto-generated method stub
		database.execSQL("DROP TABLE IF EXISTS "+FeedReaderContract.FeedEntry.TABLE_NAME);
		String query,query2,query3,query4;
        query = "CREATE TABLE "+FeedReaderContract.FeedEntry.TABLE_NAME+" ( "+FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID+" TEXT PRIMARY KEY, "+FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME+" TEXT,"+FeedReaderContract.FeedEntry.COLUMN_NAME_PASSWORD +" TEXT)";
        database.execSQL(query);
        Log.d(LOGCAT,"TABLE Created");
 
        query2 = "CREATE TABLE "+FeedReaderContract.FeedEntry.TABLE_NAME_2+" ( "+FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID+" TEXT , "+FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME+" TEXT,"+FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID +" TEXT, "+FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME+" TEXT)";
        database.execSQL(query2);
        Log.d(LOGCAT," 2nd TABLE Created");
 
        query3 = "CREATE TABLE "+FeedReaderContract.FeedEntry.TABLE_NAME_3+" ( "+FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID+" TEXT PRIMARY KEY, "+FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME+" TEXT,"+FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC +" TEXT, "+FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_IC+" TEXT)";
        database.execSQL(query3);
        Log.d(LOGCAT," 3rd TABLE Created");
        
        query4 = "CREATE TABLE "+FeedReaderContract.FeedEntry.TABLE_NAME_4+" ( "+FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID+" INTEGER PRIMARY KEY, "+FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT +" TEXT, "+FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID+" TEXT, "+FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE+" TEXT, "+FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC+" TEXT)";
        database.execSQL(query4);
        Log.d(LOGCAT," 4th TABLE Created");
 
        
	}

	@Override
	 public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL("DROP TABLE IF EXISTS "+FeedReaderContract.FeedEntry.TABLE_NAME);
        onCreate(db);
        
        db.execSQL("DROP TABLE IF EXISTS "+FeedReaderContract.FeedEntry.TABLE_NAME_2);
        onCreate(db);
        

        db.execSQL("DROP TABLE IF EXISTS "+FeedReaderContract.FeedEntry.TABLE_NAME_3);
        onCreate(db);
        
        db.execSQL("DROP TABLE IF EXISTS "+FeedReaderContract.FeedEntry.TABLE_NAME_4);
        onCreate(db);
	}
	
	public void insertData(){
		SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7101P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Rohan Badlani");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_PASSWORD, "rohan");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7209P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditya Mangla");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_PASSWORD, "aditya");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        

        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7011P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Shuchita Banthia");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_PASSWORD, "shuchita");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7268P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditi Gupta");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_PASSWORD, "aditi");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A3133P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Prakhar Kumar");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_PASSWORD, "prakhar");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        
        database.close();

	}
	
	public void insertData2(){
		SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A3133P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Prakhar Kumar");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "EEE F241");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "MICRO PROCESSORS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A3133P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Prakhar Kumar");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "ECO F211");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "PRINC OF ECO");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
    
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A3133P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Prakhar Kumar");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "EEE F242");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "CONTROL SYSTEMS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A3133P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Prakhar Kumar");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "EEE F243");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "SIGNALS AND SYS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7101P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Rohan Badlani");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "ECO F211");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "PRINC OF ECO");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7101P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Rohan Badlani");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F211");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DSA");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7101P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Rohan Badlani");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F212");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DATABASE SYS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7101P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Rohan Badlani");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F241");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "MICRO PROCESSORS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7101P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Rohan Badlani");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F415");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DATA MINING");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7209P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditya Mangla");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "ECO F211");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "PRINC OF ECO");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7209P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditya Mangla");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F211");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DSA");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7209P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditya Mangla");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F212");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DATABASE SYS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7209P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditya Mangla");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F241");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "MICRO PROCESSORS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        

        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7209P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditya Mangla");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F415");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DATA MINING");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        

        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7011P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Shuchita Banthia");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "ECO F211");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "PRINC OF ECO");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7011P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Shuchita Banthia");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F211");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DSA");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7011P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Shuchita Banthia");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F212");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DATABASE SYS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7011P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Shuchita Banthia");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F241");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "MICRO PROCESSORS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        

        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7268P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditi Gupta");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "ECO F211");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "PRINC OF ECO");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7268P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditi Gupta");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F211");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DSA");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7268P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditi Gupta");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F212");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DATABASE SYS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7268P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditi Gupta");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F241");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "MICRO PROCESSORS");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_2, null, values);
        Log.d(LOGCAT,"Inserted data Created");
        values.clear();
        
        
		database.close();
	}
	
	public void insertData3(){
		SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        
	      //values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, "2012A7268P");
	       // values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_STUDENT_NAME, "Aditi Gupta");
        
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F241");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "MICRO PROCESSORS");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC, "pre requistite:DD");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_IC, "Dr Pawan Kr Sharma");
	        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_3, null, values);
	        Log.d(LOGCAT,"Inserted data Created");
	        values.clear();
	  
	        
	        
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F212");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DATABASE SYS");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC, "basic understanding of relational dbms");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_IC, "Dr Navneet Goyal");
	        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_3, null, values);
	        Log.d(LOGCAT,"Inserted data Created");
	        values.clear();
	        

	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F211");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DSA");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC, "data structures and algorithms , pre req:DISCO");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_IC, "Dr Murali P.");
	        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_3, null, values);
	        Log.d(LOGCAT,"Inserted data Created");
	        values.clear();
	        

	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "ECO F211");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "PRINC OF ECO");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC, "basic understanding of economics");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_IC, "Mr AK Giri");
	        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_3, null, values);
	        Log.d(LOGCAT,"Inserted data Created");
	        values.clear();
	        

	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "CS F415");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "DATA MINING");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC, "data clustering , classificaion algorithms");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_IC, "Dr Poonam Goyal");
	        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_3, null, values);
	        Log.d(LOGCAT,"Inserted data Created");
	        values.clear();
	        

	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "EEE F241");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "MICRO PROCESSORS");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC, "pre requistite:DD");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_IC, "Dr Pawan Kr Sharma");
	        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_3, null, values);
	        Log.d(LOGCAT,"Inserted data Created");
	        values.clear();
	        
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "EEE F242");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "CONTROL SYSTEMS");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC, "basic control systems");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_IC, "Dr Hari Om Bansal");
	        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_3, null, values);
	        Log.d(LOGCAT,"Inserted data Created");
	        values.clear();
	        
	        
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID, "EEE F243");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME, "SIGNALS AND SYS");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC, "basic communication signals");
	        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_IC, "Dr Rikmantra Basu");
	        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_3, null, values);
	        Log.d(LOGCAT,"Inserted data Created");
	        values.clear();
	          
	        database.close();
		
		
		}
	
	void insertData4(){
		SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID, 1);
        //values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DATA_TIME, getDateTime());
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "EMBRYO");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012A7101P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "<9 CG MS IN CS IN US");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "SPEAKER: ANJISHNU KUMAR");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();
       
        //values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DATA_TIME, getDateTime());
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,2);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "CSA");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012A7122P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "SWEATSHIRT SIGNING");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "IN CHARGE:MAYUR SAXENA");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();    
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,3);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "ACM");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012A7125P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "STOCK MARKET SIMULATION");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "IN CHARGE: HASIL SHARMA");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();    
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,4);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "TAMIL GRUB");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012A3010P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "SWEATSHIRT SIGNING");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "IN CHARGE: MR SUBRAMANIAN");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();    
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,5);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "CSA");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012AB201P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "ART TALK : MAYANK MOHTA TALK");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "IN CHARGE:MAYUR SAXENA , COME AND SEE WHAT IT MEANS TO DO AN MS !");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();    
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,6);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "EMBRYO");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012A7101P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "TALK : HOW TO CRACK CODING INETRVIEW");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "IN CHARGE: NITISH PRATIK  , WANT TO CRACK THE CODING INTERVIEWS FOR GOOGLE AND FACEBOOK ??");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();    
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,7);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "DEPT OF VISUAL MEDIA");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012A7122P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "SWEATSHIRT SIGNING");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "IN CHARGE: NIHAV JAIN , THE TIME TO UNLEASH THE CODDER WITHIN YOU IS HERE !!");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();    
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,8);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "CSA");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012A3001P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "QRIOUS LAUNCH ");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "IN CHARGE: DANISH PRUTHI , COME TEST YOUR WITS AGAINST THE WORLD !!");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();    
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,9);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "MUSIC CLUB");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012A3210P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "MUSIC NITE");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "IN CHARGE: YUDHAJEET : SING , DANCE & LIVE :) !!");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();    
        
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,10);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT, "DOPY");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_UPLOADER_ID, "2012A3210P");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE, "BATCH SNAP SESSIONS");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DESC, "IN CHARGE: SAURABH : A PICTURE CAN SAY A MILLION WORDS , COME CREATE MEMORIES FOREVER :) !!");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME_4, null, values);
        values.clear();    
        
        
        
        database.close();
        
        Log.d(LOGCAT," Latest : Inserted data Created");
        
       
	
	}
	
		public ArrayList<HashMap<String, String>> getAllStudents() {
			ArrayList<HashMap<String, String>> wordList;
			wordList = new ArrayList<HashMap<String, String>>();
			String selectQuery = "SELECT " + FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID + ", " + FeedReaderContract.FeedEntry.COLUMN_NAME_PASSWORD + " FROM " + FeedReaderContract.FeedEntry.TABLE_NAME;
			SQLiteDatabase database = this.getWritableDatabase();
			Cursor cursor = database.rawQuery(selectQuery, null);
			if (cursor.moveToFirst()) {
				do {
					HashMap<String, String> map = new HashMap<String, String>();
					map.put(FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID, cursor.getString(0));
					map.put(FeedReaderContract.FeedEntry.COLUMN_NAME_PASSWORD, cursor.getString(1));
					wordList.add(map);
				} while (cursor.moveToNext());
        }
      
			
        // return contact list
        return wordList;
    }

		
		public Cursor getData2(){
			Log.d(LOGCAT," QUERY ON TABLE 2 STARTING TO RUN !!!\n");
			SQLiteDatabase database = this.getWritableDatabase();
			String columns[]=new String[]{FeedReaderContract.FeedEntry.COLUMN_NAME_ENTRY_ID,FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID,FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME};
			Cursor c= database.query(true, FeedReaderContract.FeedEntry.TABLE_NAME_2, columns, null, null, null, null, null, null);
			return c;
			
			
		}
		
		public Cursor getData3(){
			Log.d(LOGCAT," QUERY ON TABLE 3 STARTING TO RUN !!!\n");
			SQLiteDatabase database = this.getWritableDatabase();
			String columns[]=new String[]{FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID,FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_ID,FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_NAME,FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC};
			Cursor c= database.query(true, FeedReaderContract.FeedEntry.TABLE_NAME_4, columns, null, null, FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID, null, null, null);
			return c;
			
		}

		
		
	public Cursor getData4(){
			Log.d(LOGCAT," QUERY ON TABLE 4 STARTING TO RUN !!!\n");
			SQLiteDatabase database = this.getWritableDatabase();
			String columns[]=new String[]{FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID,FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_DEPT,FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_TITLE,FeedReaderContract.FeedEntry.COLUMN_NAME_COURSE_DESC};
			Cursor c= database.query(true, FeedReaderContract.FeedEntry.TABLE_NAME_4, columns, null, null, FeedReaderContract.FeedEntry.COLUMN_NAME_NOTICE_ID, null, null, null);
			return c;
			
		}

	
	
	
}


