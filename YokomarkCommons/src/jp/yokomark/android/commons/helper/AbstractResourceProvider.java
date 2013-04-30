package jp.yokomark.android.commons.helper;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

import java.io.File;

import javax.inject.Inject;

public class AbstractResourceProvider {
    @Inject
    private Context mContext;

    public Context getApplicationContext() {
        return getContext().getApplicationContext();
    }

    public boolean getBoolean(int id) {
        return getResources().getBoolean(id);
    }

    public File getCacheDir() {
        return getContext().getCacheDir();
    }

    public int getColor(int id) {
        return getResources().getColor(id);
    }

    public ColorStateList getColorStateList(int id) {
        return getResources().getColorStateList(id);
    }

    public Configuration getConfiguration() {
        return getResources().getConfiguration();
    }

    public ContentResolver getContentResolver() {
        return getContext().getContentResolver();
    }

    public Context getContext() {
        return mContext;
    }

    public float getDimension(int id) {
        return getResources().getDimension(id);
    }

    public DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    public Drawable getDrawable(int id) {
        return getResources().getDrawable(id);
    }

    public File getExternalCacheDir() {
        return getContext().getExternalCacheDir();
    }

    public int[] getIntArray(int id) {
        return getResources().getIntArray(id);
    }

    public int getInteger(int id) {
        return getResources().getInteger(id);
    }

    public String getQuantityString(int id, int quantity) {
        return getResources().getQuantityString(id, quantity);
    }

    public String getQuantityString(int id, int quantity, Object... formatArgs) {
        return getResources().getQuantityString(id, quantity, formatArgs);
    }

    public Resources getResources() {
        return getContext().getResources();
    }

    public SharedPreferences getSharedPreferences(String name, int mode) {
        return getContext().getSharedPreferences(name, mode);
    }

    public String getString(int resId) {
        return getContext().getString(resId);
    }

    public String getString(int resId, Object... formatArgs) {
        return getContext().getString(resId, formatArgs);
    }

    public String[] getStringArray(int id) {
        return getResources().getStringArray(id);
    }
}