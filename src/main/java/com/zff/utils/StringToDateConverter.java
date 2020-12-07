package com.zff.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    public Date convert(String s) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        try {
//            System.out.println(s);
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转化错误");
        }

    }
}
