package com.screeninteraction.presenterfragment;

import org.mockito.InOrder;
import org.mockito.Mockito;

import android.app.Activity;
import android.os.Bundle;
import android.test.ActivityInstrumentationTestCase2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.spy;

public class PresenterFragmentTest extends ActivityInstrumentationTestCase2<TestActivity> {

    public PresenterFragmentTest(){
        super(TestActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        TestUtils.presenter = spy(new TestPresenter());
    }

    public void testLifeCycle_StartActivity(){
        InOrder inOrder = Mockito.inOrder(TestUtils.presenter);

        getActivity();
        getInstrumentation().waitForIdleSync();

        inOrder.verify(TestUtils.presenter).onAttach(any(PresenterFragment.class));
        inOrder.verify(TestUtils.presenter).onCreate(any(Bundle.class));
        inOrder.verify(TestUtils.presenter).onCreateView(any(LayoutInflater.class), any(ViewGroup.class), isNull(Bundle.class));
        inOrder.verify(TestUtils.presenter).onViewCreated(any(View.class), any(Bundle.class));
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
