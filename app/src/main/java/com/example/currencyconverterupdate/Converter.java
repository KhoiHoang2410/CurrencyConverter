package com.example.currencyconverterupdate;

import android.content.Context;
import android.view.View;

public class Converter {
    numpad listNumpad = null;

    public Converter(Context context, View parentView) {
        listNumpad = new numpad(context, parentView);
    }

    public void process() {
        listNumpad.numpadListener();
    }
}
