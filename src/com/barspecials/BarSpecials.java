package com.barspecials;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import com.admob.android.ads.AdView;
import com.snorkip.campustownbar.R;

	public class BarSpecials extends ListActivity {
		/** Called when the activity is first created. */
		//private AdView PepAdView;
		@Override
		public void onCreate(Bundle BarState) {
			super.onCreate(BarState);
			
			//PepAdView = (AdView) findViewById(R.id.ad);
			//PepAdView.setVisibility(AdView.VISIBLE);
			
			
			 final ArrayAdapter<String> barlist = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.bar_array));
			 final ArrayAdapter<String> estas_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.estas));
			 final ArrayAdapter<String> mickeys_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.mickeys));
			 final ArrayAdapter<String> welchavestation_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.welchavestation));
			 final ArrayAdapter<String> element_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.element));
			 final ArrayAdapter<String> chasers_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.chasers));
			 final ArrayAdapter<String> outlaws_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.outlaws));
			 final ArrayAdapter<String> headliners_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.headliners));
			 final ArrayAdapter<String> mothers_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.mothers));
			 final ArrayAdapter<String> thumbs_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.thumbs));
			 final ArrayAdapter<String> paddys_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.paddys));
			 final ArrayAdapter<String> sips_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.sips));
			 final ArrayAdapter<String> capones_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.capones));
			 final ArrayAdapter<String> sgtpepper_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.sgtpeppers));
			 final ArrayAdapter<String> cafeB_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.cafeB));
			 final ArrayAdapter<String> cysroost_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.cysroost));
			 final ArrayAdapter<String> lostandfound_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.lostandfound));
			 final ArrayAdapter<String> project2020_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.project2020));
			 final ArrayAdapter<String> elpatron_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.elpatron));
			 final ArrayAdapter<String> legends_specials = new ArrayAdapter<String>(this,R.layout.list_item, getResources().getStringArray(R.array.legends));
			 
			 	setListAdapter(barlist);
			 
			 	ListView lv = getListView();
		        lv.setTextFilterEnabled(true);
		        
		        lv.setOnItemClickListener(new OnItemClickListener(){
		        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
		        	if(((TextView) view).getText().equals("Es Tas")){
		        		setListAdapter(estas_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Chasers")){
	        			setListAdapter(chasers_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Element")){
	        			setListAdapter(element_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Mother\'s")){
	        			setListAdapter(mothers_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Thumbs")){
	        			setListAdapter(thumbs_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Welch Ave Station")){
	        			setListAdapter(welchavestation_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Paddy\'s")){
	        			setListAdapter(paddys_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Sips")){
	        			setListAdapter(sips_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Cy\'s Roost")){
	        			setListAdapter(cysroost_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Lost and Found")){
	        			setListAdapter(lostandfound_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Mickey\'s")){
	        			setListAdapter(mickeys_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Capones")){
	        			setListAdapter(capones_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Headliners")){
	        			setListAdapter(headliners_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Cafe Beaudelaire")){
	        			setListAdapter(cafeB_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Outlaws")){
	        			setListAdapter(outlaws_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Sgt. Peppers \"Remix\"")){
	        			setListAdapter(sgtpepper_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Project 2020")){
	        			setListAdapter(project2020_specials);
		        	}
		        	else if(((TextView) view).getText().equals("El Patron")){
	        			setListAdapter(elpatron_specials);
		        	}
		        	else if(((TextView) view).getText().equals("Legends")){
		        		setListAdapter(legends_specials);
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


