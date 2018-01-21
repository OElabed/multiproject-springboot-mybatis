package com.zeldan.service2.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.zeldan.model.Role;
import com.zeldan.service2.repository.RoleRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(value = RoleController.class, secure = false)
public class RoleControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private RoleRepository roleRepository;

	Role role = new Role();

	@Before
	public void initPrivilege() {
		role.setId(1L);
		role.setName("NAME_TEST");
		role.setDescription("DESCRIPTION");
	}

	@Test
	public void testGetPrivilege() throws Exception {
		Mockito.when(roleRepository.selectRoleById(Mockito.anyInt())).thenReturn(role);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/role").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		String expected = "{id:1,name:NAME_TEST,description:DESCRIPTION}";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}
	
	@SpringBootApplication
	static class TestConfiguration {
	}

}
