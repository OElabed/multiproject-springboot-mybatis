package com.zeldan.security.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zeldan.security.repository.mybatis.AccountMapper;

@Repository
@Mapper
public interface AccountRepository extends AccountMapper {

}
