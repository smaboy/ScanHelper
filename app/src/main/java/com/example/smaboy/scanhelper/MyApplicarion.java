package com.example.smaboy.scanhelper;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * 类名: MyApplicarion
 * 类作用描述: java类作用描述
 * 作者: Smaboy
 * 创建时间: 2018/11/12 15:15
 */
public class MyApplicarion extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ZXingLibrary.initDisplayOpinion(this);
    }
}
