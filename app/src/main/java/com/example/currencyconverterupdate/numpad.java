package com.example.currencyconverterupdate;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class numpad extends View implements View.OnClickListener {
    //UI ui = null;

    View _parentView;
    public numpad(Context context, View parentView) {
        super(context);
        _parentView = parentView;

        //ui = new UI(context);
    }

    public void numpadListener() {

// You need to call findViewByID from an parentView.
// Since your button is an element of the main activity view hierarchy (parentView).
// this.findViewById is call by numpad itself, but it do not have any children or elements in it view hierarchy.
        Button num00 = (Button)_parentView.findViewById(R.id.Num00);
        num00.setOnClickListener(this);

        /*Button num01 = (Button)findViewById(R.id.Num01);
        num01.setOnClickListener(this);

        Button num02 = (Button)findViewById(R.id.Num02);
        num02.setOnClickListener(this);

        Button num03 = (Button)findViewById(R.id.Num03);
        num03.setOnClickListener(this);

        Button num04 = (Button)findViewById(R.id.Num04);
        num04.setOnClickListener(this);

        Button num05 = (Button)findViewById(R.id.Num05);
        num05.setOnClickListener(this);

        Button num06 = (Button)findViewById(R.id.Num06);
        num06.setOnClickListener(this);

        Button num07 = (Button)findViewById(R.id.Num07);
        num07.setOnClickListener(this);

        Button num08 = (Button)findViewById(R.id.Num08);
        num08.setOnClickListener(this);

        Button num09 = (Button)findViewById(R.id.Num09);
        num09.setOnClickListener(this);

        Button delete = (Button)findViewById(R.id.Delete);
        delete.setOnClickListener(this);*/
    }

    @Override
    public void onClick(View view) {
        //double source = ui.getSourceAmount();
        double source = 0;
        switch (view.getId()) {
            case R.id.Num00:
                source = source * 10;
                break;
            case R.id.Num01:
                source = source * 10 + 1;
                break;
            case R.id.Num02:
                source = source * 10 + 2;
                break;
            case R.id.Num03:
                source = source * 10 + 3;
                break;
            case R.id.Num04:
                source = source * 10 + 4;
                break;
            case R.id.Num05:
                source = source * 10 + 5;
                break;
            case R.id.Num06:
                source = source * 10 + 6;
                break;
            case R.id.Num07:
                source = source * 10 + 7;
                break;
            case R.id.Num08:
                source = source * 10 + 8;
                break;
            case R.id.Num09:
                source = source * 10 + 9;
                break;
            case R.id.Delete:
                source = (source - source % 10) / 10;
                break;
            default:
                break;
        }

        //ui.updateSourceMoney(source);
        //ui.convert();
    }
}
