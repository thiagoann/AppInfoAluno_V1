package com.example.professorsudoeste.appinfoaluno;

import android.provider.BaseColumns;

/**
 * Created by Professor Sudoeste on 08/03/2018.
 */

public class UsuarioContract {
    public static abstract class UsuarioEntry implements BaseColumns{
        public static final String TABLE_NAME = "Usuario";

        public static final String _IDUSER = "_iduser";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_EMAIL = "Email";
        public static final String COLUMN_PASSWORD = "Password";
    }


}
