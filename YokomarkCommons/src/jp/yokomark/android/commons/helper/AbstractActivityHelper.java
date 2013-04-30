package jp.yokomark.android.commons.helper;

import android.app.Activity;
import android.content.Context;

import javax.inject.Inject;

public class AbstractActivityHelper {
    @Inject
    private Context mContext;

    public Activity getActivity() {
        try {
            return (Activity) getContext();
        } catch (ClassCastException e) {
            throw new IllegalStateException("You need to use this with activity context: ", e);
        }
    }

    public Context getApplicationContext() {
        return mContext.getApplicationContext();
    }

    public Context getContext() {
        return mContext;
    }

    public void setContext(Context context) {
        mContext = context;
    }
}