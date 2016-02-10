package com.screeninteraction.presenterfragment.sample;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;


public class MyPresenterTest {

    private MyPresenter presenter;

    @Mock
    MyView view;

    @Mock
    MyPresenterFragment fragment;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

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
    public void testDoSomethingFragmentRelated(){
        presenter.doSomethingFragmentRelated();
        verify(fragment).somethingFragmentRelated();
    }

}