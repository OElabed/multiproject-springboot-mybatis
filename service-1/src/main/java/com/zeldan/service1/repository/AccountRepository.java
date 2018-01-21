package com.zeldan.service1.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zeldan.service1.repository.mybatis.AccountMapper;

@Repository
@Mapper
public interface AccountRepository extends AccountMapper {

}
