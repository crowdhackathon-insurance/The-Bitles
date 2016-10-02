package com.example.insurance;

import tabListeners.*;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class AccidentActivity extends FragmentActivity {
	ViewPager mViewPager;
	AdministratorTabPageAdapter AdminTabAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_accident);
		mViewPager = (ViewPager) findViewById(R.id.pager);
		AdminTabAdapter = new AdministratorTabPageAdapter(getSupportFragmentManager());
		mViewPager.setAdapter(AdminTabAdapter);
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		ActionBar.TabListener tabListener = new ActionBar.TabListener() {
			public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
				mViewPager.setCurrentItem(tab.getPosition());
			}

			public void onTabUnselected(ActionBar.Tab tab,
					FragmentTransaction ft) {
				// hide the given tab
			}

			public void onTabReselected(ActionBar.Tab tab,
					FragmentTransaction ft) {
				// probably ignore this event
			}
		};

		actionBar.addTab(actionBar.newTab().setText("Βημα 1 απο 3")
				.setTabListener(tabListener));
		actionBar.addTab(actionBar.newTab().setText("Βημα 2 απο 3")
				.setTabListener(tabListener));
		actionBar.addTab(actionBar.newTab().setText("Βημα 3 απο 3")
				.setTabListener(tabListener));

		//
		mViewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						getActionBar().setNavigationMode(
								ActionBar.NAVIGATION_MODE_TABS);
						getActionBar().setSelectedNavigationItem(position);
					}
				});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		getMenuInflater().inflate(R.menu.main, menu);
		CharSequence text = "You are on the Accident Activity";
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
			Intent intent = new Intent(getBaseContext(), ProfileActivity.class);
			if (intent != null)
				startActivity(intent);
		} else if (id == R.id.action_Accident) {
			// We are in Accident

		} else if (id == R.id.action_NewInsurance) {
			Intent intent = new Intent(getBaseContext(),
					NewInsuranceActivity.class);
			if (intent != null)
				startActivity(intent);
		} else if (id == R.id.action_findBrokers) {
			Intent intent = new Intent(getBaseContext(),
					FindBrokersActivity.class);
			if (intent != null)
				startActivity(intent);
		} else if (id == R.id.action_exit) {
			System.exit(0);
		} else if (id == R.id.menu_home) {
			Intent intent = new Intent(getBaseContext(), MainActivity.class);
			if (intent != null)
				startActivity(intent);

		}
		return super.onOptionsItemSelected(item);
	}
}
