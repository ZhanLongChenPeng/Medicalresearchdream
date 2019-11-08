package com.example.medicalresearchdream.utils;

import android.view.View;

import com.google.android.material.snackbar.Snackbar;

/**
 * Snackbar  https://www.jianshu.com/p/f38a20b8aa32
 */

public class SnackbarUtil {

    public static void show(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show();
    }

    public static void showShort(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
    }
}
