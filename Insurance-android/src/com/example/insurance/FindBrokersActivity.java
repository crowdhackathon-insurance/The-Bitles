package com.example.insurance;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class FindBrokersActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_brokers);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.main, menu);
        CharSequence text = "You are on the Find A Broker Activity";
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
        	Intent intent = new Intent(getBaseContext(),ProfileActivity.class);
        	if(intent!=null)
        		startActivity(intent);
        }
        else if(id == R.id.action_Accident){
        	Intent intent = new Intent(getBaseContext(),AccidentActivity.class);
        	if(intent!=null)
        		startActivity(intent);
        	
        }
        else if(id == R.id.action_NewInsurance){
        	Intent intent = new Intent(getBaseContext(),NewInsuranceActivity.class);
        	if(intent!=null)
        		startActivity(intent);
        }
        else if(id == R.id.action_findBrokers){
        	//we are in findBrokers
        }
        else if(id == R.id.action_exit){
        	System.exit(0);
        }
        else if(id == R.id.menu_home){
        	Intent intent = new Intent(getBaseContext(),MainActivity.class);
        	if(intent!=null)
        		startActivity(intent);
        	
        }
		return super.onOptionsItemSelected(item);
	}
}
