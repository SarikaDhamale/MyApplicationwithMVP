package com.assignment.webonise.myapplicationwithmvp.login.login.login;

import android.os.Handler;
import android.text.TextUtils;

class LoginInteractorImpl implements LoginInteractor {

    private static final int DELAY_MILLIS = 2000;

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    return;
                }
                listener.onSuccess();
            }
        }, DELAY_MILLIS);
    }
}
