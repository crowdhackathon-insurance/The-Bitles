package tabListeners;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class AdministratorTabPageAdapter extends FragmentStatePagerAdapter {
	private FragmentManager mFragmentManager;

	// private Step1Fragment mFragmentAtPos0;

	public AdministratorTabPageAdapter(FragmentManager fm) {
		super(fm);
		mFragmentManager = fm;
	}

	@Override
	public Fragment getItem(int position) {
		
		if (position == 0) {
			return new Step1Fragment();
		}
		if (position == 1) {
			return new Step2Fragment();
		}
		if (position == 2) {
			return new Step3Fragment();
		}
		return null;
	}

	@Override
	public int getItemPosition(Object object) {
		return POSITION_NONE;
	}

	public FragmentManager getmFragmentManager() {
		return mFragmentManager;
	}

	public void setmFragmentManager(FragmentManager mFragmentManager) {
		this.mFragmentManager = mFragmentManager;
	}

	@Override
	public int getCount() {
		return 3;
	}

}
