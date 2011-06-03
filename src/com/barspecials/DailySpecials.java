package com.barspecials;


import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import com.snorkip.campustownbar.R;

public class DailySpecials extends ListActivity {
	/** Called when the activity is first created. */
	
	
	
	
	@Override
	public void onCreate(Bundle DayState) {
		super.onCreate(DayState);
			    

	    final ArrayAdapter<String> daylist = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.day_array));
	    final ArrayAdapter<String> barlist = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.bar_array));
		final ArrayAdapter<String> estas = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.estas));
		final ArrayAdapter<String> mickeys = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.mickeys));
		final ArrayAdapter<String> welchavestation = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.welchavestation));
		final ArrayAdapter<String> element = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.element));
		final ArrayAdapter<String> chasers = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.chasers));
		final ArrayAdapter<String> outlaws = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.outlaws));
		final ArrayAdapter<String> headliners = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.headliners));
		final ArrayAdapter<String> mothers = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.mothers));
		final ArrayAdapter<String> thumbs = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.thumbs));
		final ArrayAdapter<String> paddys = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.paddys));
		final ArrayAdapter<String> sips = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.sips));
		final ArrayAdapter<String> capones = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.capones));
		final ArrayAdapter<String> sgtpepper = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.sgtpeppers));
		final ArrayAdapter<String> cafeB = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.cafeB));
		final ArrayAdapter<String> cysroost = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.cysroost));
		final ArrayAdapter<String> lostandfound = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.lostandfound));
		final ArrayAdapter<String> project2020 = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.project2020));
		final ArrayAdapter<String> elpatron = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.elpatron));
		final ArrayAdapter<String> legends = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.legends));
	    
	    /*final ArrayAdapter<String> monday_specials = new ArrayAdapter<String>(this, R.layout.list_item,getResources().getStringArray(R.array.monday_specials));
	    final ArrayAdapter<String> tuesday_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.tuesday_specials));
	    final ArrayAdapter<String> wednesday_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.wednesday_specials));
	    final ArrayAdapter<String> thursday_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.thursday_specials));
	    final ArrayAdapter<String> friday_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.friday_specials));
	    final ArrayAdapter<String> saturday_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.saturday_specials));
	    final ArrayAdapter<String> sunday_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.sunday_specials));*/
		
		final ArrayAdapter<String> monday_specials = new ArrayAdapter<String>(this, R.layout.list_item);
		final ArrayAdapter<String> tuesday_specials = new ArrayAdapter<String>(this, R.layout.list_item);
		final ArrayAdapter<String> wednesday_specials = new ArrayAdapter<String>(this, R.layout.list_item);
		final ArrayAdapter<String> thursday_specials = new ArrayAdapter<String>(this, R.layout.list_item);
		final ArrayAdapter<String> friday_specials = new ArrayAdapter<String>(this, R.layout.list_item);
		final ArrayAdapter<String> saturday_specials = new ArrayAdapter<String>(this, R.layout.list_item);
		final ArrayAdapter<String> sunday_specials = new ArrayAdapter<String>(this, R.layout.list_item);
	    
	    ArrayAdapter bars[] = new ArrayAdapter[19];
	    bars[0] = cafeB;	bars[1] = capones;
		bars[2] = chasers;	bars[3] = cysroost;
		bars[4] = elpatron;	bars[5] = element;
		bars[6] = estas;	bars[7] = headliners;
		bars[8] = legends;	bars[9] = lostandfound;
		bars[10] = mickeys;	bars[11] = mothers;
		bars[12] = outlaws;	bars[13] = paddys;
		bars[14] = project2020;	bars[15] = sgtpepper;
		bars[16] = sips;	bars[17] = thumbs;
		bars[18] = welchavestation;
	    
	    for(int i = 0; i < bars.length; i++){
	    	for(int k = 0; k < bars[i].getCount(); k++){
	    		if(bars[i].getItem(k).equals("Monday")){
	    			monday_specials.add(barlist.getItem(i));
	    			monday_specials.add((String) bars[i].getItem(k+1));
	    		}
	    		if(bars[i].getItem(k).equals("Tuesday")){
	    			tuesday_specials.add(barlist.getItem(i));
	    			tuesday_specials.add((String) bars[i].getItem(k+1));
	    		}
	    		if(bars[i].getItem(k).equals("Wednesday")){
	    			wednesday_specials.add(barlist.getItem(i));
	    			wednesday_specials.add((String) bars[i].getItem(k+1));
	    		}
	    		if(bars[i].getItem(k).equals("Thursday")){
	    			thursday_specials.add(barlist.getItem(i));
	    			thursday_specials.add((String) bars[i].getItem(k+1));
	    		}
	    		if(bars[i].getItem(k).equals("Friday")){
	    			friday_specials.add(barlist.getItem(i));
	    			friday_specials.add((String) bars[i].getItem(k+1));
	    		}
	    		if(bars[i].getItem(k).equals("Saturday")){
	    			saturday_specials.add(barlist.getItem(i));
	    			saturday_specials.add((String) bars[i].getItem(k+1));
	    		}
	    		if(bars[i].getItem(k).equals("Sunday")){
	    			sunday_specials.add(barlist.getItem(i));
	    			sunday_specials.add((String) bars[i].getItem(k+1));
	    		}
	    	}
	    }
      
	    
	    
        setListAdapter(daylist);
		
		final ListView lv = getListView();
        lv.setTextFilterEnabled(true);
        
        lv.setOnItemClickListener(new OnItemClickListener(){
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        	    
        		
        	
        	if(((TextView) view).getText().equals("Monday")){
        			setListAdapter(monday_specials);
        	}
        	else if(((TextView) view).getText().equals("Tuesday")){
        			setListAdapter(tuesday_specials);
        	}
        	else if(((TextView) view).getText().equals("Wednesday")){
        			setListAdapter(wednesday_specials);
        	}
        	else if(((TextView) view).getText().equals("Thursday")){
        			setListAdapter(thursday_specials);
        	}
        	else if(((TextView) view).getText().equals("Friday")){
        			setListAdapter(friday_specials);
        	}
        	else if(((TextView) view).getText().equals("Saturday")){
        			setListAdapter(saturday_specials);
        	}
        	else if(((TextView) view).getText().equals("Sunday")){
        			setListAdapter(sunday_specials);
        	}
        }   
        }); 
	}
	  @Override
      public void onBackPressed(){
      	
      	onCreate(null);
      	
      	return;
      }
}
