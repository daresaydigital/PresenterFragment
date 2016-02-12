package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.Presenter;

import android.os.Bundle;
import android.view.View;

/**
 * Example on how parent and view can be more specific.
 */
public class MyOtherPresenter extends Presenter<MyOtherPresenterFragment, MyView> {

    @Override
    public void onViewCreated(MyView view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenterView().setButtonText("Go back");
        getPresenterView().setButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParent().goBack();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenterView().setText("This my other presenter!");
    }

    @Override
    public void onPause() {
        super.onPause();
        getPresenterView().setText("Bye bye");
    }

}
