package com.screeninteraction.fragmentpresetntertests;

import com.screeninteraction.presenterfragment.PresenterFragment;

public class TestFragment extends PresenterFragment<TestPresenter> {

    public TestFragment(){
        setPresenter(TestUtils.presenter);
    }

}
