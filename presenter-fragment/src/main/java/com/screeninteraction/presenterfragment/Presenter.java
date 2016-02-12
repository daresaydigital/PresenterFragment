package com.screeninteraction.presenterfragment;

import android.os.Bundle;

/**
 *
 * @param <P> a parent, typically a Fragment or an Activity. Something attached to lifecycle.
 * @param <V> a view.
 */
public abstract class Presenter<P extends Object, V extends Object> {

    private V view;

    private P parent;

    public P getParent(){
        return parent;
    }

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

    public void onAttach(P parent){
        this.parent = parent;
    }

    public void onDetach(){
        this.parent = null;
    }
}
