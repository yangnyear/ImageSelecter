package com.swpuiot.imageselecter.view.presenter;

import android.content.Context;

import com.swpuiot.imageselecter.view.data.Images;

/**
 * Created by 羊荣毅_L on 2017/2/28.
 */
public class MainPresenter implements MainHolder.presenter {
    private Context mContext;
    private MainHolder.view mView;
    private Images images;

    public MainPresenter(Context context, MainHolder.view v) {
        this.mContext = context;
        this.mView = v;
        images = new Images();
    }

    int id = 0;

    @Override
    public void onImageClick() {

        int[] imageIds = images.getImageIds();
        if (imageIds != null) {
            if (id < 4) {
                mView.setImageResource(imageIds[id]);
                id++;
            } else {
                id = 0;
            }
        }

    }
}
