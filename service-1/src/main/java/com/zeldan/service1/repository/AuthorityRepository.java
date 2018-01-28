package com.zeldan.service1.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zeldan.service1.repository.mybatis.AuthorityMapper;

@Repository
@Mapper
public interface AuthorityRepository extends AuthorityMapper {

}
