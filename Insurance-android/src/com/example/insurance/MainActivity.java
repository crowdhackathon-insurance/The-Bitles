package com.example.insurance;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.main, menu);
        CharSequence text = "You are on the Home Page";
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
        	Intent intent = new Intent(getBaseContext(),FindBrokersActivity.class);
        	if(intent!=null)
        		startActivity(intent);
        }
        else if(id == R.id.action_exit){
        	finish();
        }
        else if(id == R.id.menu_home){
        	//We are in Home
        	
        }
        return super.onOptionsItemSelected(item);
    }
}
