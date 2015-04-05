package com.abbapluit.homcalendar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence titles[];
    int numberOfTabs;

    public ViewPagerAdapter(FragmentManager fragmentManager, CharSequence titles[], int numberOfTabs) {
        super(fragmentManager);
        this.titles = titles;
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Tab1();
        } else if (position == 1) {
            return new Tab2();
        } else if (position == 2) {
            return new Tab3();
        } else {
            return new Tab4();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
