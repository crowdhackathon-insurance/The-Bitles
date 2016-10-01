package com.example.insurance;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class ProfileActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		getMenuInflater().inflate(R.menu.main, menu);
		CharSequence text = "You are on the Profile Activity";
    	int duration = Toast.LENGTH_SHORT;
    	Context context = getApplicationContext();
    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		 int id = item.getItemId();
	        if (id == R.id.action_profile) {
	        	//We are in Profile
	        }
	        else if(id == R.id.action_Accident){
	        	Intent intent = new Intent(getBaseContext(),ProfileActivity.class);
	        	if(intent!=null)
	        		startActivity(intent);
	        	
	        }
	        else if(id == R.id.action_NewInsurance){
	        	
	        }
	        else if(id == R.id.action_findBrokers){
	        	
	        }
	        else if(id == R.id.action_exit){
	        	
	        }
	        else if(id == R.id.menu_home){
	        	Intent intent = new Intent(getBaseContext(),MainActivity.class);
	        	if(intent!=null)
	        		startActivity(intent);
	        	
	        }
	        return super.onOptionsItemSelected(item);
	}
}
