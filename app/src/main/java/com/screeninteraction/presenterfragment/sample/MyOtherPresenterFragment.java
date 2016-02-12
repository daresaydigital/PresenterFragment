package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.PresenterFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyOtherPresenterFragment extends PresenterFragment<MyOtherPresenter> {

    public MyOtherPresenterFragment(){
        setPresenter(new MyOtherPresenter());
    }

    public void goBack() {
        getFragmentManager().popBackStack();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_view, container, false);
    }
}
