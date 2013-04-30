package jp.yokomark.android.commons.content;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import proton.inject.Proton;

public abstract class ProtonAsyncTaskLoader<D> extends AsyncTaskLoader<D> {
    public ProtonAsyncTaskLoader(Context context) {
        super(context);

        Proton.getInjector(context).inject(this);
    }
}