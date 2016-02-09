package com.screeninteraction.fragmentpresetntertests;

import com.screeninteraction.presenterfragment.PresenterFragment;

import org.mockito.InOrder;
import org.mockito.Matchers;
import org.mockito.Mockito;

import android.app.Activity;
import android.os.Bundle;
import android.test.ActivityInstrumentationTestCase2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PresenterFragmentTest extends ActivityInstrumentationTestCase2<TestActivity> {

    public PresenterFragmentTest(){
        super(TestActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestUtils.presenter = Mockito.spy(new TestPresenter());
    }

    public void testLifeCycle_StartActivity(){
        InOrder inOrder = Mockito.inOrder(TestUtils.presenter);

        getActivity();
        getInstrumentation().waitForIdleSync();

        inOrder.verify(TestUtils.presenter).onAttach(Matchers.any(PresenterFragment.class));
        inOrder.verify(TestUtils.presenter).onCreate(Matchers.any(Bundle.class));
        inOrder.verify(TestUtils.presenter).onCreateView(Matchers.any(LayoutInflater.class), Matchers.any(ViewGroup.class), Matchers
                .isNull(Bundle.class));
        inOrder.verify(TestUtils.presenter).onViewCreated(Matchers.any(View.class), Matchers.any(Bundle.class));
        inOrder.verify(TestUtils.presenter).onStart();
        inOrder.verify(TestUtils.presenter).onResume();
    }

    public void testLifeCycle_FinishActivity(){
        Activity activity = getActivity();
        InOrder inOrder = Mockito.inOrder(TestUtils.presenter);

        activity.finish();
        getInstrumentation().waitForIdleSync();

        inOrder.verify(TestUtils.presenter).onPause();
        inOrder.verify(TestUtils.presenter).onStop();
        inOrder.verify(TestUtils.presenter).onDestroyView();
        inOrder.verify(TestUtils.presenter).onDestroy();
        inOrder.verify(TestUtils.presenter).onDetach();
    }


}
