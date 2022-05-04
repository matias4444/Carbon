package com.chawki.carbon;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chawki.carbon.menu3.Category7;
import com.chawki.carbon.menu3.Category8;
import com.chawki.carbon.menu3.Category9;

/**
 * Created by DEV-PC on 04/09/2017.
 */

class SimpleFragmentPagerAdapter3 extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter3(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Category7();
        } else if (position == 1) {
            return new Category8();
        } else if (position == 2) {
            return new Category9();
        } else {
            return new Category7();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 3;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "CATEGORY7";
            case 1:
                return "CATEGORY8";

            case 2:
                return "CATEGORY9";



            default:
                return null;
        }
    }


}
