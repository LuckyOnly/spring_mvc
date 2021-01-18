package com.zff.dao;

import com.zff.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
    @Select("select * from account")
    public List<Account> findAll();
}
