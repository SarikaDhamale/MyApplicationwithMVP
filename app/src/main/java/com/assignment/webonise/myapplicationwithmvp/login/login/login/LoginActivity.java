package com.assignment.webonise.myapplicationwithmvp.login.login.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

import com.assignment.webonise.myapplicationwithmvp.R;

public class LoginActivity extends Activity implements LoginView , OnClickListener{

    private EditText edtEmail,edtPassword;
    private Activity activity;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        presenter = new LoginPresenterImpl(this);
    }

    private void init() {
        activity=LoginActivity.this;
        edtEmail= (EditText) findViewById(R.id.edtloginemail);
        edtPassword= (EditText) findViewById(R.id.edtloginpassword);
        findViewById(R.id.btnLogin).setOnClickListener(this);

    }


    @Override
    public void showProgress() {


    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setUsernameError() {
        edtEmail.setError(getString(R.string.username_error));

    }

    @Override
    public void setPasswordError() {
        edtPassword.setError(getString(R.string.password_error));
    }

    @Override
    public void navigateToHome() {

        Toast.makeText(activity, "Success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {
        presenter.validateCredentials(edtEmail.getText().toString(), edtPassword.getText().toString());
    }
}
