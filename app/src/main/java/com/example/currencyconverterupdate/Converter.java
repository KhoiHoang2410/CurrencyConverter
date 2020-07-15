package com.example.currencyconverterupdate;

import android.content.Context;
import android.view.View;

public class Converter {
    numpad listNumpad = null;

    public Converter(Context context) {
        listNumpad = new numpad(context);
    }

    public void process() {
        listNumpad.numpadListener();
    }
}
