package com.swpuiot.imageselecter.view.presenter;

/**
 * Created by 羊荣毅_L on 2017/2/28.
 */
public interface MainHolder {
    interface view {
        void setImageResource(int imageId);
    }

    interface presenter {
        void onImageClick();
    }

}
