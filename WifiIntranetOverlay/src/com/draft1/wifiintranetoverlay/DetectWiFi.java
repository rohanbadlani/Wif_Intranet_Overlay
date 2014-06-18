package com.draft1.wifiintranetoverlay;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.view.Gravity;
import android.widget.TextView;
import android.widget.Toast;


public class DetectWiFi extends BroadcastReceiver
{

	@Override
	public void onReceive(Context context, Intent intent)
	{
		try
		{
			String action = intent.getAction();


			//			showToast("Entered onReceive", context);
			//			if (action.equalsIgnoreCase(WifiManager.SUPPLICANT_STATE_CHANGED_ACTION)) 
			//			{
			//				if (intent.getParcelableExtra(WifiManager.EXTRA_NEW_STATE) == SupplicantState.COMPLETED) 
			//				{
			//					showToast("Entered in if's", context);
			//
			//WiFi is associated
			//WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
			//WifiInfo wi = wifiManager.getConnectionInfo();
			final ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
			final android.net.NetworkInfo wifi = connMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
			if(wifi.isAvailable())
			{
				WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
				WifiInfo wi = wifiManager.getConnectionInfo();

				if (wi != null) 
				{
					// Wifi info available
					if (wi.getIpAddress() != 0) 
					{
						//when a connection is complete
						showToast("Inside IpAddress", context);
						Intent intenton = new Intent(context.getApplicationContext(), Welcome.class);
						intenton.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
						context.startActivity(intenton);

						//							if (wi.getBSSID().equals("mac/ip")) 
						//							{
						//								Intent intentone = new Intent(context.getApplicationContext(), MainActivity.class);
						//								intentone.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
						//								context.startActivity(intentone);
						//							}
					}                
				}
			}
		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			showToast(e.getMessage(), context);
		}

	}



	protected void showToast(String s, Context context)
	{
		TextView textView = new TextView(context);
		textView.setBackgroundColor(Color.BLACK);
		textView.setTextColor(Color.WHITE);
		textView.setPadding(10,10,10,10);
		textView.setText(s);
		Toast toastView = new Toast(context);
		toastView.setDuration(Toast.LENGTH_SHORT);
		toastView.setGravity(Gravity.CENTER, 0,0);
		toastView.setView(textView);
		toastView.show();
	}



}
