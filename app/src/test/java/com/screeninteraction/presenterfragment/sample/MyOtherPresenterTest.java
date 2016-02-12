package com.screeninteraction.presenterfragment.sample;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import android.view.View;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class MyOtherPresenterTest {

    private MyOtherPresenter presenter;

    @Mock
    MyView view;

    @Mock
    MyOtherPresenterFragment parent;

    View.OnClickListener buttonClick;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        keepClick();

        presenter = spy(new MyOtherPresenter());
        presenter.onAttach(parent);
        presenter.onViewCreated(view, null);
    }

    private void keepClick() {
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                buttonClick = ((View.OnClickListener)invocation.getArguments()[0]);
                return null;
            }
        }).when(view).setButtonClickListener(any(View.OnClickListener.class));
    }

    @Test
    public void testOnResume(){
        presenter.onResume();
        verify(view).setText("This my other presenter!");
    }

    @Test
    public void testOnPause() {
        presenter.onPause();
        verify(view).setText("Bye bye");
    }

    @Test
    public void testOnBack(){
        buttonClick.onClick(null);
        verify(parent).goBack();
    }

}