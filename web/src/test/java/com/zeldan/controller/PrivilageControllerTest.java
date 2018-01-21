package com.zeldan.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.zeldan.model.Privilege;
import com.zeldan.repository.PrivilegeRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(value = PrivilageController.class, secure = false)
public class PrivilageControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private PrivilegeRepository privilegeRepository;

	Privilege privilege = new Privilege();

	@Before
	public void initPrivilege() {
		privilege.setId(1);
		privilege.setName("NAME_TEST");
		privilege.setGender("GENDER_TEST");
	}

	@Test
	public void testGetPrivilege() throws Exception {
		Mockito.when(privilegeRepository.selectPrivilegeById(Mockito.anyInt())).thenReturn(privilege);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/privilege").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		String expected = "{id:1,name:NAME_TEST,gender:GENDER_TEST}";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
	}

}
