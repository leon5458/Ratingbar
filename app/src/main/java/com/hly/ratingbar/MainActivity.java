package com.hly.ratingbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    private com.hly.ratingbar.RatingBar testrating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar = findViewById(R.id.rating);


        //1,获取图片的高度
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.xing);
        int starsImgHeight = bmp.getHeight();

        //2,将获取的图片高度设置给RatingBar
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) ratingBar.getLayoutParams();
        lp.width = LinearLayout.LayoutParams.WRAP_CONTENT;
        lp.height = starsImgHeight;
        ratingBar.setLayoutParams(lp);


        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RatingActivity.class);
                startActivity(intent);
            }
        });

    }


}
