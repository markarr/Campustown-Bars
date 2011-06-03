package com.barspecials;


import android.app.TabActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.Toast;

import com.admob.android.ads.AdManager;
import com.admob.android.ads.AdView;
import com.admob.android.ads.SimpleAdListener;
import com.snorkip.campustownbar.R;

public class TabWidget extends TabActivity {
		
		TabHost tabHost;
		
		//private AdView PepAdView;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        Log.i("AdMobTest", "onCreate");
	        
	        Toast.makeText(getApplicationContext(),"We do not guarantee these specials. Bars Reserve the Right to change or deny specials.", Toast.LENGTH_LONG).show();
	        //AdManager.setTestDevices( new String[] {AdManager.TEST_EMULATOR});
	        AdView adView = new AdView(this);
	        adView.requestFreshAd(); 
	        /*adView.setAdListener( new SimpleAdListener()
	        {
	    		public void onFailedToReceiveAd(com.admob.android.ads.AdView adView)
	    		{
	    			Log.d("AdListener", "onFailedToReceiveAd: " + adView.toString());
	    			super.onFailedToReceiveAd(adView);
	    		}

	    		public void onFailedToReceiveRefreshedAd(com.admob.android.ads.AdView adView)
	    		{
	    			Log.d("AdListener", "onFailedToReceiveRefreshedAd: " + adView.toString());
	    			super.onFailedToReceiveRefreshedAd(adView);
	    		}

	    		public void onReceiveAd(com.admob.android.ads.AdView adView)
	    		{
	    			Log.d("AdListener", "onReceiveAd: " + adView.toString());
	    			super.onReceiveAd(adView);
	    		}

	    		public void onReceiveRefreshedAd(com.admob.android.ads.AdView adView)
	    		{
	    			Log.d("AdListener", "onReceiveRefreshedAd: " + adView.toString());
	    			super.onReceiveRefreshedAd(adView);
	    		}
	        } );*/
	        
	        setContentView(R.layout.tab);
	        	        
	        
	        tabHost = (TabHost)findViewById(android.R.id.tabhost);
	        AppTabs.setMyTabs(tabHost, this);
	        
	  
	    }      
	}
