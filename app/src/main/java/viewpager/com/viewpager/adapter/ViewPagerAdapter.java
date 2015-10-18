package viewpager.com.viewpager.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import viewpager.com.viewpager.R;
import viewpager.com.viewpager.fragment.Fragment_A;
import viewpager.com.viewpager.fragment.Fragment_B;
import viewpager.com.viewpager.fragment.Fragment_C;
import viewpager.com.viewpager.fragment.Fragment_D;
import viewpager.com.viewpager.fragment.Fragment_E;

/**
 * Created by Dell on 10/18/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    Context context;
    private int count;
    public ViewPagerAdapter(FragmentManager fm , int count , Context context) {
        super(fm);
        this.count = count;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return Fragment_A.newInstance();
            case 1:
                return Fragment_B.newInstance();
            case 2:
                return Fragment_C.newInstance();
            case 3:
                return Fragment_D.newInstance();
            case 4:
                return Fragment_E.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return context.getResources().getStringArray(R.array.tabs)[position];
    }
}
