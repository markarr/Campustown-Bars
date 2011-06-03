package com.barspecials;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.snorkip.campustownbar.R;

public class specials extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] days = getResources().getStringArray(R.array.day_array);
        String[] bars = getResources().getStringArray(R.array.bar_array);
        String[] Inital_Choice = getResources().getStringArray(R.array.choice);
        String[] mondayspecials = getResources().getStringArray(R.array.monday_specials);
        String[] tuesdayspecials = getResources().getStringArray(R.array.tuesday_specials);
        String[] wednesdayspecials = getResources().getStringArray(R.array.wednesday_specials);
        String[] thursdayspecials = getResources().getStringArray(R.array.thursday_specials);
        String[] fridayspecials = getResources().getStringArray(R.array.friday_specials);
        String[] saturdayspecials = getResources().getStringArray(R.array.saturday_specials);
        String[] sundayspecials = getResources().getStringArray(R.array.sunday_specials);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.list_item, Inital_Choice));
        final ArrayAdapter<?> barlist = new ArrayAdapter<String>(this,R.layout.list_item, bars);
        final ArrayAdapter<?> daylist = new ArrayAdapter<String>(this,R.layout.list_item, days);
        final ArrayAdapter<?> monday_specials = new ArrayAdapter<String>(this,R.layout.list_item, mondayspecials);
        final ArrayAdapter<?> tuesday_specials = new ArrayAdapter<String>(this,R.layout.list_item, tuesdayspecials);
        final ArrayAdapter<?> wednesday_specials = new ArrayAdapter<String>(this,R.layout.list_item, wednesdayspecials);
        final ArrayAdapter<?> thursday_specials = new ArrayAdapter<String>(this,R.layout.list_item, thursdayspecials);
        final ArrayAdapter<?> friday_specials = new ArrayAdapter<String>(this,R.layout.list_item, fridayspecials);
        final ArrayAdapter<?> saturday_specials = new ArrayAdapter<String>(this,R.layout.list_item, saturdayspecials);
        final ArrayAdapter<?> sunday_specials = new ArrayAdapter<String>(this,R.layout.list_item, sundayspecials);
        
        Toast.makeText(getApplicationContext(), "We do not garuntee these specials. They are everchanging.", Toast.LENGTH_LONG).show();
        
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);
        
        lv.setOnItemClickListener(new OnItemClickListener(){
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        	if(((TextView) view).getText().equals("By Day")){
        		setListAdapter(daylist);
        	}
        	else if(((TextView) view).getText().equals("Monday")){
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
        	        	
        	else if(((TextView) view).getText().equals("By Bar")){
        		setListAdapter(barlist);
        	}
        	else if(((TextView) view).getText().equals("")){
        		
        	}
        	else if(((TextView) view).getText().equals("")){
        		
        	}
         }
       });
    }
}