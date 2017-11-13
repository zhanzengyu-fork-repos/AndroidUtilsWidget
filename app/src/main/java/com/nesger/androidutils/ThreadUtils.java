package com.nesger.androidutils;

import android.os.Looper;

/**
 * Created by nesger.zhan on 2017/11/13.
 */

public class ThreadUtils {

    /**
     * 判断调用位置的线程是否是主线程
     *
     * @return
     */
    public static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

}
