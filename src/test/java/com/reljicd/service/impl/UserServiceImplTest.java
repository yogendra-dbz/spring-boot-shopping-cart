package com.reljicd.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner; 

import com.reljicd.model.User;
import com.reljicd.repository.RoleRepository;
import com.reljicd.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	@Mock
	private UserServiceImp userService;

	@Mock
	private RoleRepository roleRepository;

	@Mock
	private UserRepository userRepository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}	

	@Test
	public void testFindByUserName() {
		assertEquals(Matchers.any(User.class), userService.findByUsername("user"));
	}
	
	@Test
	public void testFindByEmail() {
		Mockito.when(userService.findByEmail("name@gmail.com")).thenReturn(Matchers.any(User.class));
	}

	@Test
	public void testFindByEmailUserNotFound() {
		Mockito.when(userService.findByEmail("user@mail.com")).thenReturn(null);
	}

}
