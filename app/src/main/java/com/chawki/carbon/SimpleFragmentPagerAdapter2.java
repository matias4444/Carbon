package com.chawki.carbon;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chawki.carbon.menu2.Category4;
import com.chawki.carbon.menu2.Category5;
import com.chawki.carbon.menu2.Category6;

/**
 * Created by DEV-PC on 04/09/2017.
 */

class SimpleFragmentPagerAdapter2 extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter2(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Category4();
        } else if (position == 1) {
            return new Category5();
        } else if (position == 2) {
            return new Category6();
        } else {
            return new Category4();
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
                return "CATEGORY4";
            case 1:
                return "CATEGORY5";

            case 2:
                return "CATEGORY6";



            default:
                return null;
        }
    }


}
