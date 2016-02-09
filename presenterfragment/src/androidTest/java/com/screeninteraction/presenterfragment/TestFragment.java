package com.screeninteraction.presenterfragment;

public class TestFragment extends PresenterFragment<TestPresenter> {

    public TestFragment(){
        setPresenter(TestUtils.presenter);
    }

}
