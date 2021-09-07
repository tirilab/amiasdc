package com.example.mamia;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String USER_TABLE = "USER_TABLE";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_CUSTOMER_AGE = "CUSTOMER_AGE";
    public static final String COLUMN_CUSTOMER_RACE = "CUSTOMER_RACE";
    public static final String COLUMN_CUSTOMER_ETHNICITY = "CUSTOMER_ETHNICITY";
    public static final String COLUMN_CUSTOMER_LMP = "CUSTOMER_LMP";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "user.db", null, 1);
    }

    // called first time database is access, create database here
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + USER_TABLE + " (" + COLUMN_ID + " INTERGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_CUSTOMER_AGE + " TEXT, " + COLUMN_CUSTOMER_RACE + " TEXT, " + COLUMN_CUSTOMER_ETHNICITY+ " TEXT, " + COLUMN_CUSTOMER_LMP + " TEXT)";
        db.execSQL(createTableStatement);

    }

    // called if database version number changes
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean addOne(UserModel userModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COLUMN_CUSTOMER_AGE, userModel.getAge());
        cv.put(COLUMN_CUSTOMER_RACE, userModel.getRace());
        cv.put(COLUMN_CUSTOMER_ETHNICITY, userModel.getEthnicity());
        cv.put(COLUMN_CUSTOMER_LMP, userModel.getLmp());

        long insert = db.insert(USER_TABLE, null, cv);
        if (insert == -1) {
            return false;
        }
        return true;
    }

    public boolean addLMP(UserModel userModel) {
        SQLiteDatabase db = this.getWritableDatabase();
        return true;
    }
}
