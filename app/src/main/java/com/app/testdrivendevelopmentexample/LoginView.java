package com.app.testdrivendevelopmentexample;

/**
 * Created by iSaleem on 12/20/17.
 */

public interface LoginView {
     void showMessageForErrorUsernamePassword();
     void showMessageForExceedLoginAttempts();
     void showMessageForLoginSuccess();
}
