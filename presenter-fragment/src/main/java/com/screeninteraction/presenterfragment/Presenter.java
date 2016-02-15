package com.screeninteraction.presenterfragment;

import android.os.Bundle;

/**
 *
 * @param <Parent> typically a Fragment or an Activity. Something attached to lifecycle.
 * @param <View> a view.
 */
public abstract class Presenter<Parent, View> {

    private View view;

    private Parent parent;

    public Parent getParent(){
        return parent;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        this.view = view;
    }

    public View getPresenterView(){
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

    public void onAttach(Parent parent){
        this.parent = parent;
    }

    public void onDetach(){
        this.parent = null;
    }
}
