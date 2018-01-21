package com.zeldan.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.zeldan.model.Privilege;
import com.zeldan.repository.PrivilegeRepository;

@RunWith(SpringRunner.class)
@MybatisTest
public class PrivilegeRepositoryTest {

	@Autowired
	private PrivilegeRepository mapper;

	@Test
	public void contextLoads() throws Exception {
		assertThat(mapper).isNotNull();
	}

	@Test
	public void testSelectPrivilegeById() {
		Privilege result = mapper.selectPrivilegeById(1);
		assertThat(result.getId()).isEqualTo(1);
	}

}
