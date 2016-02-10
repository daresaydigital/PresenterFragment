package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.PresenterFragment;

public class MyOtherPresenterFragment extends PresenterFragment<MyOtherPresenter> {

    public MyOtherPresenterFragment(){
        setPresenter(new MyOtherPresenter());
    }

    public void goBack() {
        getFragmentManager().popBackStack();
    }
}
