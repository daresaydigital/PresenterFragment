package com.screeninteraction.fragmentpresetntertests;

import com.screeninteraction.presenterfragment.Presenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TestPresenter extends Presenter<View> {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.test_view, container, false);
    }
}