package com.google.ads.mediation.mytarget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.my.target.nativeads.views.MediaAdView;

public class MedAdView extends MediaAdView {
    public MedAdView(Context context) {
        super(context);
    }

    public MedAdView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MedAdView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }
}