package com.zff.domain;

import java.io.Serializable;
import java.util.Date;

public class UserDate implements Serializable {
    private String uname;
    private Integer age;
    private Date birthday;

    @Override
    public String toString() {
        return "UserDate{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
