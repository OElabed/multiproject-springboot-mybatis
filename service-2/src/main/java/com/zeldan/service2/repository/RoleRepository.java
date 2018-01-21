package com.zeldan.service2.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zeldan.service2.repository.mybatis.RoleMapper;

@Repository
@Mapper
public interface RoleRepository extends RoleMapper {

}
