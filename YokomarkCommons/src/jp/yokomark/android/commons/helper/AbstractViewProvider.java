package jp.yokomark.android.commons.helper;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockFragmentActivity;

import javax.inject.Inject;

public class AbstractViewProvider {
    @Inject
    private Context mContext;

    public Context getContext() {
        return mContext;
    }

    public Activity getActivity() {
        try {
            return (Activity) mContext;
        } catch (ClassCastException e) {
            throw new IllegalStateException("You need to use this with activity context: ", e);
        }
    }

    public View findViewById(int id) {
        return getActivity().findViewById(id);
    }

    public boolean hasActionBar() {
        return getActivity() instanceof SherlockActivity ||
                getActivity() instanceof SherlockFragmentActivity;
    }
}