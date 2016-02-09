package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.Presenter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class MyPresenter extends Presenter<MyView> {

    @Override
    public void onResume() {
        super.onResume();
        getPresenterView().setText("Hello world");
    }

    @Override
    public MyView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (MyView) inflater.inflate(R.layout.my_view, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
        getPresenterView().setText("Bye world");
    }

    public void doFragmentStuff() {
        getFragment().startActivity(new Intent("test.package"));
    }

    public void doActivityStuff() {
        getFragment().getActivity().deleteFile("test.file");
    }
}
