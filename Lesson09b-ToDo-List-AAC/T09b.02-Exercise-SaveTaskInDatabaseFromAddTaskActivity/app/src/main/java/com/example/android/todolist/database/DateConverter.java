package com.example.android.todolist.database;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

public class DateConverter {
    /**
     * Room will use this method to READING FROM Db
     * @param timestamp
     * @return
     */
    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    /**
     * Room will use this method when WRITING TO Db
     * @param date
     * @return
     */
    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
