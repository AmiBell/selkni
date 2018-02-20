package com.example.aspirev.selki;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by AspireV on 2018-02-20.
 */

public class DataBaseCovoiturage extends SQLiteOpenHelper {

    public DataBaseCovoiturage(Context context) {
        super(context,"", null, 0);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
