package tabListeners;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.insurance.R;
import com.example.insurance.R.layout;

/**
 * A placeholder fragment containing a simple view.
 */
public  class Step2Fragment extends ListFragment {


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.activity_step2_fragment,container, false);

		
		return rootView;
	}
}