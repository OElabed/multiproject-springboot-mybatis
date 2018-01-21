package com.zeldan.service2.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

import com.zeldan.model.Role;

@RunWith(SpringRunner.class)
@MybatisTest
public class RoleRepositoryTest {

	@Autowired
	private RoleRepository repository;

	@Test
	public void contextLoads() throws Exception {
		assertThat(repository).isNotNull();
	}

	@Test
	public void testSelectRoleById() {
		Role result = repository.selectRoleById(1);
		assertThat(result.getId()).isEqualTo(1);
	}

	@SpringBootApplication
	static class TestConfiguration {
	}

}
