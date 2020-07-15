package com.example.currencyconverterupdate;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

public class UI extends View {
    public UI(Context context) {
        super(context);
    }

    void updateTargetAmount(double amount) {
        TextView textView = (TextView)findViewById(R.id.targetAmount);
        textView.setText(String.format("%.2f", amount));
    }

    void updateSourceMoney(double amount) {
        TextView textView = (TextView)findViewById(R.id.sourceAmount);
        textView.setText(String.format("%.2f", amount));
    }

    String getTargetCurrency() {
        TextView textView = (TextView)findViewById(R.id.targetCurrency);
        return textView.getText().toString();
    }

    void updateTargetCurrency(String currency) {
        TextView textView = (TextView)findViewById(R.id.targetCurrency);
        textView.setText(currency);
        convert();
    }

    double getSourceAmount() {
        TextView textView = (TextView)findViewById(R.id.sourceAmount);
        String s = textView.getText().toString();
        return Double.valueOf(s);
    }

    public void convert() {
        String targetCurrency = getTargetCurrency();
        double result = getSourceAmount();

        switch (targetCurrency) {
            case "USD":
                result = result / 23000;
                break;
            case "JPY":
                result = result / 216;
                break;
            case "AUD":
                result = result / 16074;
                break;
            default:
                break;
        }

        updateTargetAmount(result);
    }
}
