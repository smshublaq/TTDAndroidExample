package com.app.testdrivendevelopmentexample;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements LoginView{
    EditText etUsername;
    EditText etPassword;
    Button btnLogin;
    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializePresenter();
        initializeView();
    }

    public void initializePresenter(){

        loginPresenter = new LoginPresenter(this);
    }

    public void initializeView(){
        etPassword = findViewById(R.id.etpassword);
        etUsername = findViewById(R.id.etUsername);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.doLogin("123","4");
            }
        });
    }

    @Override
    public void showMessageForErrorUsernamePassword() {
        Snackbar.make(btnLogin,"Please Check Username or Password",Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void showMessageForExceedLoginAttempts() {
        Snackbar.make(btnLogin,"showMessageForExceedLoginAttempts",Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void showMessageForLoginSuccess() {
        Snackbar.make(btnLogin,"LoggedIn",Snackbar.LENGTH_LONG).show();

    }
}
