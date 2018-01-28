package com.zeldan.security.repository.mybatis;

import com.zeldan.model.Account;

public interface AccountMapper {

	public Account findByUsername(String name);
}
