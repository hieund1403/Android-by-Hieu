package com.kodeq.hieunguyen.sunshine.data;

import android.provider.BaseColumns;
import android.text.format.Time;
/**
 * Created by Nguyen Duc Hieu
 */
public class MucThoiTiet {
    public static long normalizeDate(long startDate) {
        // normalize the start date to the beginning of the (UTC) day
        Time time = new Time();
        time.set(startDate);
        int julianDay = Time.getJulianDay(startDate, time.gmtoff);
        return time.setJulianDay(julianDay);
    }
    public static final class LocationEntry implements BaseColumns {
        public static final String TABLE_NAME = "location";

    }
    public static final class WeatherEntry implements BaseColumns{
        
    }
}
