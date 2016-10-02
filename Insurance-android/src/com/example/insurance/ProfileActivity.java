package com.example.insurance;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
		TextView name= (TextView) findViewById(R.id.textView1);
  		 TextView surname= (TextView) findViewById(R.id.textView2);
  		 TextView mobile= (TextView) findViewById(R.id.textView3);
  		 TextView phone= (TextView) findViewById(R.id.textView4);
  		 TextView mail= (TextView) findViewById(R.id.textView5);
  		 TextView afm= (TextView) findViewById(R.id.textView6);
  		 name.setText("Όνομα: \n");
  		 surname.setText("Επίθετο: \n");
  		 mobile.setText("Κινητό: \n");
  		 phone.setText("Σταθερό: \n");
  		 mail.setText("Ηλεκτρονικό Ταχυδρομείο: \n");
  		 afm.setText("ΑΦΜ: \n");
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
	        	Intent intent = new Intent(getBaseContext(),FindBrokersActivity.class);
	        	if(intent!=null)
	        		startActivity(intent);
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
