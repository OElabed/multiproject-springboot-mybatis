package com.zeldan.service1.repository.mybatis;

import com.zeldan.model.Account;

public interface AccountMapper {

	public Account selectAccountById(int id);
}
