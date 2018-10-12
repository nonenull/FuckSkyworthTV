package com.coocaa.homeshell;

import android.app.AlertDialog;
import android.content.Context;

class MyDialog {
    private Context mContext;

    MyDialog(Context c) {
        mContext = c;
    }

    void Show(String text) {
        AlertDialog alertDialog1 = new AlertDialog.Builder(mContext)
                .setTitle("提示")
                .setMessage(text)
                .setIcon(R.mipmap.ic_launcher)
                .create();
        alertDialog1.show();
    }
}
