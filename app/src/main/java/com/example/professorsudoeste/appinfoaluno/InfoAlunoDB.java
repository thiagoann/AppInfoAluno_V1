package com.example.professorsudoeste.appinfoaluno;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by thiag on 08/03/2018.
 */

public class InfoAlunoDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "infoaluno.db";

    public InfoAlunoDB(Context context){

        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        String sqlTabelaUsuario = " CREATE TABLE " + UsuarioContract.UsuarioEntry.TABLE_NAME + " (" +
                UsuarioContract.UsuarioEntry._IDUSER + " INTEGERS PRIMARY KEY " +
                UsuarioContract.UsuarioEntry.COLUMN_NAME + " TEXT NOT NULL, " +
                UsuarioContract.UsuarioEntry.COLUMN_EMAIL + " TEXT NOT NULL, " +
                UsuarioContract.UsuarioEntry.COLUMN_PASSWORD + " TEXT NOT NULL, " ;


}


}




