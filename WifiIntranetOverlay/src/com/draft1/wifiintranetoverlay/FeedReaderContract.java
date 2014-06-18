package com.draft1.wifiintranetoverlay;

import android.provider.BaseColumns;

public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
public FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static abstract class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "student";
        public static final String TABLE_NAME_2="registration";
        public static final String TABLE_NAME_3="courses";
        public final static String COLUMN_NAME_COURSE_ID="course_id";
        public final static String COLUMN_NAME_COURSE_DESC="description";
        public final static String COLUMN_NAME_COURSE_IC="course_ic";
        public final static String COLUMN_NAME_COURSE_NAME="course_name";
        public static final String COLUMN_NAME_ENTRY_ID = "id";
        public static final String COLUMN_NAME_STUDENT_NAME = "name";
        public static final String COLUMN_NAME_PASSWORD = "password";
        public static final String TABLE_NAME_4="notices";
        public static final String COLUMN_NAME_NOTICE_ID = "notice_id";
        public static final String COLUMN_NAME_NOTICE_DATA_TIME = "entry_time";
        public static final String COLUMN_NAME_NOTICE_DEPT = "dept_club";
        public static final String COLUMN_NAME_NOTICE_UPLOADER_ID = "uploader_id";
        public static final String COLUMN_NAME_NOTICE_TITLE = "title";
        public static final String COLUMN_NAME_NOTICE_DESC = "description";
    }
}