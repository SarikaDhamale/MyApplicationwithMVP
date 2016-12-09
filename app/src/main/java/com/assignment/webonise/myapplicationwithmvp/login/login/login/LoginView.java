
package com.assignment.webonise.myapplicationwithmvp.login.login.login;

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
