package com.screeninteraction.presenterfragment.sample;

import com.screeninteraction.presenterfragment.PresenterFragment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import android.app.Activity;
import android.content.Intent;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class MyPresenterTest {

    private MyPresenter presenter;

    @Mock
    MyView view;

    @Mock
    PresenterFragment fragment;

    @Mock
    Activity activity;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        when(fragment.getActivity()).thenReturn(activity);
        when(fragment.getContext()).thenReturn(activity);

        presenter = spy(new MyPresenter());
        presenter.onAttach(fragment);
        presenter.onViewCreated(view, null);
    }

    @Test
    public void testOnResume(){
        presenter.onResume();
        verify(view).setText("Hello world");
    }

    @Test
    public void testOnPause() {
        presenter.onPause();
        verify(view).setText("Bye world");
    }

    @Test
    public void testFragmentStuff(){
        presenter.doFragmentStuff();
        verify(fragment).startActivity(any(Intent.class));
    }

    @Test
    public void testActivityStuff(){
        presenter.doActivityStuff();
        verify(activity).deleteFile(eq("test.file"));
    }

}