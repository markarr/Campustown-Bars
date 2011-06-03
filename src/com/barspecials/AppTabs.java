package com.barspecials;

import android.content.Context;
import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class AppTabs {

	public static void setMyTabs(TabHost tabHost, Context context){
		

		
        TabSpec firstTabSpec = tabHost.newTabSpec("tid1");
        TabSpec secondTabSpec = tabHost.newTabSpec("tid1");

        firstTabSpec.setIndicator("Bars");
        secondTabSpec.setIndicator("Days");
        
        firstTabSpec.setContent(new Intent(context, BarSpecials.class));
        secondTabSpec.setContent(new Intent(context, DailySpecials.class));
        
        tabHost.addTab(firstTabSpec);
        tabHost.addTab(secondTabSpec);
     
        tabHost.getTabWidget().setCurrentTab(0);
        
	}

}
