package com.hly.ratingbar;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/10/23~~~~~~
 * ~~~~~~更改时间:2018/10/23~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class RatingActivity extends AppCompatActivity{

    private RatingBar ratingBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rating_activity_layout);
        ratingBar = findViewById(R.id.star);
        initData();
    }

    private void initData() {
        ratingBar.setClickable(false);
        ratingBar.setStar(3);
    }
}
