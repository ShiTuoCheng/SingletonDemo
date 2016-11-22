package com.shituocheng.innerhandler.com.singletondemo;

import android.content.Context;

/**
 * Created by shituocheng on 2016/11/22.
 */

public class Singleton {

    private Context mContext;

    private static Singleton singleton;

    private Singleton(Context mContext) {
        this.mContext = mContext;
    }

    public static synchronized Singleton getSingletonInstance(Context context){

        if (singleton == null){
            singleton = new Singleton(context.getApplicationContext());
        }

        return singleton;
    }
}
