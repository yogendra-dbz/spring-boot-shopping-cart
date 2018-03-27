package com.reljicd.service.impl;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.reljicd.model.Role;
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
       
       User user = new User();

       @Before
       public void setUp() throws Exception {
             MockitoAnnotations.initMocks(this);
             Collection<Role> roles = new Collection<Role>() {
                    
                    @Override
                    public <T> T[] toArray(T[] arg0) {
                          // TODO Auto-generated method stub
                          return null;
                    }
                    
                    @Override
                    public Object[] toArray() {
                          // TODO Auto-generated method stub
                          return null;
                    }
                    
                    @Override
                    public int size() {
                          // TODO Auto-generated method stub
                          return 0;
                    }
                    
                    @Override
                    public boolean retainAll(Collection<?> arg0) {
                          // TODO Auto-generated method stub
                          return false;
                    }
                    
                    @Override
                    public boolean removeAll(Collection<?> arg0) {
                          // TODO Auto-generated method stub
                          return false;
                    }
                    
                    @Override
                    public boolean remove(Object arg0) {
                          // TODO Auto-generated method stub
                          return false;
                    }
                    
                    @Override
                    public Iterator<Role> iterator() {
                          // TODO Auto-generated method stub
                          return null;
                    }
                    
                    @Override
                    public boolean isEmpty() {
                          // TODO Auto-generated method stub
                          return false;
                    }
                    
                    @Override
                    public boolean containsAll(Collection<?> arg0) {
                          // TODO Auto-generated method stub
                          return false;
                    }
                    
                    @Override
                    public boolean contains(Object arg0) {
                          // TODO Auto-generated method stub
                          return false;
                    }
                    
                    @Override
                    public void clear() {
                          // TODO Auto-generated method stub
                          
                    }
                    
                    @Override
                    public boolean addAll(Collection<? extends Role> arg0) {
                          // TODO Auto-generated method stub
                          return false;
                    }
                    
                    @Override
                    public boolean add(Role arg0) {
                          // TODO Auto-generated method stub
                          return false;
                    }
             };
             
             user.setActive(1);
             user.setEmail("name@gmail.com");
             user.setId(1L);
             user.setLastName("abc");
             user.setName("def");
             user.setPassword("abdjs");
             user.setUsername("username");
             user.setRoles(roles);
       }      

       @Test
       public void testFindByUserName() {
             assertEquals(Matchers.any(User.class), userService.findByUsername("user"));
       }
       
       @Test
       public void testFindByEmail() {
       Mockito.when(userService.findByEmail("name@gmail.com")).thenReturn(user);
       }

       @Test
       public void testFindByEmailUserNotFound() {
       Mockito.when(userService.findByEmail("user@mail.com")).thenReturn(null);
       }

}
