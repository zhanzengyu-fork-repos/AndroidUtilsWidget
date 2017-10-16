package com.nesger.androidutils;

import android.graphics.Rect;
import android.view.View;

/**
 * Created by GT on 2017/10/16.
 */

public class ViewUtils {

    /**
     * get the view top location
     *
     * @param v
     * @return
     */
    public static Rect locateView(View v) {
        if (v == null) return null;
        int[] loc_int = new int[2];
        try {
            v.getLocationOnScreen(loc_int);
        } catch (NullPointerException npe) {
            //Happens when the view doesn't exist on screen anymore.
            return null;
        }
        Rect location = new Rect();
        location.left = loc_int[0];
        location.top = loc_int[1];
        location.right = location.left + v.getWidth();
        location.bottom = location.top - v.getHeight();
        return location;
    }

}
