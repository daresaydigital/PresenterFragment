package com.screeninteraction.presenterfragment.sample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MyView extends FrameLayout {

    public MyView(Context context) {
        this(context, null, 0);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setText(String text){
        ((TextView)findViewById(R.id.my_view_text)).setText(text);
    }

    public void setButtonClickListener(OnClickListener listener){
        findViewById(R.id.my_view_button).setOnClickListener(listener);
    }

    public void setButtonText(String text){
        ((Button)findViewById(R.id.my_view_button)).setText(text);
    }
}
