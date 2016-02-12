package com.screeninteraction.presenterfragment.sample;

import android.view.View;

public interface IMyView {
    void setText(String text);
    void setButtonText(String text);
    void setButtonClickListener(View.OnClickListener onClickListener);
}
