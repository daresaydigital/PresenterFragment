package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.Presenter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyOtherPresenter extends Presenter<MyOtherPresenterFragment, MyView> {



    @Override
    public MyView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (MyView) inflater.inflate(R.layout.my_view, container, false);
    }

    @Override
    public void onViewCreated(MyView view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenterView().setButtonText("Go back");
        getPresenterView().setButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragment().goBack();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        getPresenterView().setText("This is an other fragment!");
    }

    @Override
    public void onPause() {
        super.onPause();
        getPresenterView().setText("Bye bye");
    }

}
