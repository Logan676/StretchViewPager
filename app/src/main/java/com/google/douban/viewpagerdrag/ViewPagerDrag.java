package com.google.douban.viewpagerdrag;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerDrag extends ViewPager {
    public static final String TAG = "ViewPagerDrag";

    public ViewPagerDrag(@NonNull Context context) {
        super(context);
    }

    public ViewPagerDrag(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


}
