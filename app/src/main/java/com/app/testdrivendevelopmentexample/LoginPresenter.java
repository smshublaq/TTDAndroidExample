package com.app.testdrivendevelopmentexample;

import android.util.Log;

/**
 * Created by iSaleem on 12/20/17.
 */

public class LoginPresenter {

    final int MAX_ATTEMPTS_NO = 3;
    private final LoginView loginView;
    int loginAttempts;

    LoginPresenter(LoginView loginView){
        this.loginView = loginView;
    }

    public int incrementAttempts() {
        loginAttempts = loginAttempts + 1;
        return loginAttempts;
    }

    public boolean isLoginAttemptsExceeded() {
        return loginAttempts >= MAX_ATTEMPTS_NO;
    }

    public void doLogin(String username,String password) {
        if(isLoginAttemptsExceeded()) {
            loginView.showMessageForExceedLoginAttempts();
            return ;
        }

        if(username.equals("ahmed") && password.equals("123")){
            loginView.showMessageForLoginSuccess();
            return ;
        }

        incrementAttempts();
        loginView.showMessageForErrorUsernamePassword();
        return ;
    }
}
