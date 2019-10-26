package com.google.douban.viewpagerdrag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerDragPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerDragPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        final DragableFragment f = new DragableFragment();
        Bundle bundle = new Bundle();
        bundle.putString("page_color", getPageColor(position));
        bundle.putInt("page_index", position);
        f.setArguments(bundle);
        return f;
    }

    private String getPageColor(int position) {
        final int i = position % 3;
        String color = "#ffffffff";
        switch (i) {
            case 0:
                color = "#008577";
                break;
            case 1:
                color = "#00574B";
                break;
            case 2:
                color = "#D81B60";
                break;
        }
        return color;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
