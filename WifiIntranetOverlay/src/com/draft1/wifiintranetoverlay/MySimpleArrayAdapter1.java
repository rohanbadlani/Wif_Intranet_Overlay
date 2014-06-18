package com.draft1.wifiintranetoverlay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MySimpleArrayAdapter1 extends ArrayAdapter<String> {
	  private final Context context;
	  private final String[] values1;
	  private final String[] values2;
	  private final String[] values3;
	  public MySimpleArrayAdapter1(Context context, String[] values1, String[] values2, String[] values3) {
	    super(context, R.layout.rowlayout, values1);
	    this.context = context;
	    this.values1 = values1;
	    this.values2 = values2;
	    this.values3 = values3;
	    
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
		  LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		  View rowView;
		  rowView = inflater.inflate(R.layout.rowlayout, parent, false);
	    if(position%2==0){
	    	 //rowView = inflater.inflate(R.layout.rowlayout, parent, false);
	    }
	    else{
	    	//rowView = inflater.inflate(R.layout.rowlayout2, parent, false);
	    }    
	    TextView textView = (TextView) rowView.findViewById(R.id.label);
	    ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
	    TextView description = (TextView) rowView.findViewById(R.id.desc);
	    textView.setText(values1[position]);
	    //description.setText("This is the description for this event.This is the description for this event.This is the description for this event.This is the description for this event.This is the description for this event");
	    // Change the icon for Windows and iPhone
	    description.setText(values2[position]);
	    String s = values3[position];
	    if (s.startsWith("EMBRYO")) {
	      imageView.setImageResource(R.drawable.embryo);
	    } 
	    else if(s.startsWith("CSA")){
	      imageView.setImageResource(R.drawable.csa);
	    }
	    else if(s.startsWith("ACM")){
		      imageView.setImageResource(R.drawable.acm2);
		    }
	    else if(s.startsWith("TAMIL GRUB")){
		      imageView.setImageResource(R.drawable.tamil);
		    }
	    else if(s.startsWith("DEPT OF VISUAL MEDIA")){
		      imageView.setImageResource(R.drawable.dvm);
		    }
	    else if(s.startsWith("MUSIC CLUB")){
		      imageView.setImageResource(R.drawable.music_club);
		    }
	    else if(s.startsWith("DOPY")){
		      imageView.setImageResource(R.drawable.dopy);
		    }
	    else{
	    	imageView.setImageResource(R.drawable.convo_icon);
	    }
	    return rowView;
	  }
	} 