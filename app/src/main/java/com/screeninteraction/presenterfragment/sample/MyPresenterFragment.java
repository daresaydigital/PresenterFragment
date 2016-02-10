package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.PresenterFragment;

public class MyPresenterFragment extends PresenterFragment<MyPresenter> {

    public MyPresenterFragment(){
        setPresenter(new MyPresenter());
    }

    public void showMyOtherFragment() {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_activity_container, new MyOtherPresenterFragment())
                .addToBackStack(null)
                .commit();
    }
}
