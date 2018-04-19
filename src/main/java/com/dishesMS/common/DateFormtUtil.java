package com.dishesMS.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by aa123 on 2018/4/18.
 */
public class DateFormtUtil {

    public static Date dateFormt(Date date)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh-mm-ss");
        try {
            date = simpleDateFormat.parse(simpleDateFormat.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
