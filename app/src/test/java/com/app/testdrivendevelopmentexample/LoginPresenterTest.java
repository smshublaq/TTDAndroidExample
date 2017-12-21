package com.app.testdrivendevelopmentexample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by iSaleem on 12/20/17.
 */
public class LoginPresenterTest {

    @Test
    public void checkAttemptsIncrements(){
        LoginView loginView = mock(LoginView.class);
        LoginPresenter loginPresenter = new LoginPresenter(loginView);

        Assert.assertEquals(1,loginPresenter.incrementAttempts());
        Assert.assertEquals(2,loginPresenter.incrementAttempts());
        Assert.assertEquals(3,loginPresenter.incrementAttempts());
        Assert.assertTrue(loginPresenter.isLoginAttemptsExceeded());
    }

    @Test
    public void checkIsLoginSuccess(){
        LoginView loginView = mock(LoginView.class);
        LoginPresenter loginPresenter = new LoginPresenter(loginView);
        //Assert.assertTrue();
        loginPresenter.doLogin("ahmed","11");
        verify(loginView).showMessageForLoginSuccess();
    }



}