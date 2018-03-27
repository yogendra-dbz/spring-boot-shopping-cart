package com.reljicd.service.impl;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner; 

import com.reljicd.model.Product;
import com.reljicd.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingCartServiceImplTest {

	@Mock
	private ShoppingCartServiceImpl shoppingCartService;

	@Mock
	private ProductRepository repository;

	Map<Product, Integer> products = new HashMap<>();

	@Before
	public void setUp() throws Exception {
		Product product = new Product();
		product.setName("Composition Notebook");
		product.setId(1L);
		product.setDescription("Quick notes? We have you covered!");
		product.setPrice(new BigDecimal(12.99));
		product.setQuantity(10);
		products.put(product, 1);
		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void testAddProduct() {
		Product product = new Product();
		product.setName("Subject Notebook");
		product.setId(2L);
		product.setDescription("Make notes lesuirely!");
		product.setPrice(new BigDecimal(15.99));
		product.setQuantity(7);
		Mockito.doNothing().when(shoppingCartService).addProduct(product);
	}

	@Test
	public void testRemoveProduct() {
		Product product = new Product();
		product.setName("Subject Notebook");
		product.setId(2L);
		product.setDescription("Make notes lesuirely!");
		product.setPrice(new BigDecimal(15.99));
		product.setQuantity(7);
		Mockito.doNothing().when(shoppingCartService).removeProduct(product);

	}

}
