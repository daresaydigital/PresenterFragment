package com.screeninteraction.presenterfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class Presenter<F extends PresenterFragment, V extends View> {

    private V view;

    private F fragment;

    public F getFragment(){
        return fragment;
    }

    public abstract V onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    public void onViewCreated(V view, Bundle savedInstanceState) {
        this.view = view;
    }

    public V getPresenterView(){
        return view;
    }


    public void onCreate(Bundle savedInstanceState) {

    }

    public void onStart() {

    }

    public void onResume() {

    }

    public void onPause() {

    }

    public void onStop() {

    }

    public void onDestroyView() {

    }

    public void onDestroy() {

    }

    public void onAttach(F fragment){
        this.fragment = fragment;
    }

    public void onDetach(){
        this.fragment = null;
    }
}
