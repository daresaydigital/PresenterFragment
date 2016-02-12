package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.PresenterFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyPresenterFragment extends PresenterFragment<MyPresenter> implements IMyParent {

    public MyPresenterFragment(){
        setPresenter(new MyPresenter());
    }

    @Override
    public void showMyOtherPresenter() {
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.main_activity_container, new MyOtherPresenterFragment())
                .addToBackStack(null)
                .commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_view, container, false);
    }
}
