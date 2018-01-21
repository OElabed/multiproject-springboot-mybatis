package com.zeldan.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zeldan.repository.mybatis.PrivilegeMapper;

@Repository
@Mapper
public interface PrivilegeRepository extends PrivilegeMapper {

}
