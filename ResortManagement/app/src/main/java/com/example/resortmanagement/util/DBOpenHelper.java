package com.example.resortmanagement.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Class used to open database file
 */
public
class
DBOpenHelper
        extends
        SQLiteOpenHelper {
    public
    DBOpenHelper(Context context, String path,
                 int
                         version){
        super
                (context, path,
                        null
                        , version);
    }
    @Override
    public
    void
    onCreate(SQLiteDatabase db) {
        Log.d("openhelper","on create");
    }
    @Override
    public
    void
    onUpgrade(SQLiteDatabase db,
              int
                      oldVersion,
              int
                      newVersion) {
        Log.d("openhelper","on upgrade"+oldVersion+newVersion);

    }
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        db.disableWriteAheadLogging();
    }
}
