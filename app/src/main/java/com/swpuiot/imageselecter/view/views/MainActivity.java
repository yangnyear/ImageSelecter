package com.swpuiot.imageselecter.view.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.swpuiot.imageselecter.R;
import com.swpuiot.imageselecter.view.presenter.MainHolder;
import com.swpuiot.imageselecter.view.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainHolder.view {
    private ImageView mImageViewSelecter;
    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainPresenter=new MainPresenter(this, this);

        mImageViewSelecter= (ImageView) findViewById(R.id.image_selecter);
        mImageViewSelecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPresenter.onImageClick();
            }
        });
    }

    @Override
    public void setImageResource(int imageId) {
        mImageViewSelecter.setImageResource(imageId);
    }
}
