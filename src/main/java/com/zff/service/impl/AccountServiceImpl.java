package com.zff.service.impl;

import com.zff.domain.Account;
import com.zff.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户...");
        return null;
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户...");
    }
}
