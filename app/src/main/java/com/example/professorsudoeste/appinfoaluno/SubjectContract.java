package com.example.professorsudoeste.appinfoaluno;

import android.provider.BaseColumns;

/**
 * Created by thiag on 13/03/2018.
 */

public class SubjectContract {
    public static abstract class SubjectEntry implements BaseColumns{
        public static final String TABLE_NAME = "Usuario";


        public static final String _IDSUBJECT = "_idsubject ";
        public static final String COLUMN_SUBJECTNAME = " SUBJECT NAME ";
        public static final String COLUMN_GRADE1 = " GRADE 1 ";
        public static final String COLUMN_GRADE2 = " GRADE 2 ";
        public static final String COLUMN_GRADE3 = " GRADE 3 ";
        public static final String COLUMN_GRADE4 = " GRADE 4 ";
        public static final String COLUMN_STATUS = " USER STATUS ";



    }

}
