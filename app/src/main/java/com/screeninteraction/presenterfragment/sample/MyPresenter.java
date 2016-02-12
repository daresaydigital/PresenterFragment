package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.Presenter;

import android.os.Bundle;
import android.view.View;

/**
 * Example on how parent and view can be interfaces.
 */
public class MyPresenter extends Presenter<IMyParent, IMyView> {

    @Override
    public void onViewCreated(IMyView view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenterView().setButtonText("Start other fragment!");
        getPresenterView().setButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParent().showMyOtherPresenter();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenterView().setText("Hello world");
    }

    @Override
    public void onPause() {
        super.onPause();
        getPresenterView().setText("Bye world");
    }

    public void showMyOtherPresenter() {
        getParent().showMyOtherPresenter();
    }
}
