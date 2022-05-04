package com.chawki.carbon;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.chawki.carbon.menu1.Category1;
import com.chawki.carbon.menu1.Category2;
import com.chawki.carbon.menu1.Category3;

/**
 * Created by DEV-PC on 30/08/2017.
 */
class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Category1();
        } else if (position == 1) {
            return new Category2();
        } else if (position == 2) {
            return new Category3();
        }   else {
            return new Category1();
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
                return "CATEGORY1";
            case 1:
                return "CATEGORY2";
            case 2:
                return "CATEGORY3";



            default:
                return null;
        }
    }


}
