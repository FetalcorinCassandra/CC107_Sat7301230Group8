package com.example.group8_sqlite;

import android.content.Context;
import android.widget.Toast;

public class message {
    public static void message(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
