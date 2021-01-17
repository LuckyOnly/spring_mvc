package com.zff.dao;

import com.zff.domain.Account;

import java.util.List;

public interface AccountDao {
    public void saveAccoun(Account account);
    public List<Account> findAll();
}
