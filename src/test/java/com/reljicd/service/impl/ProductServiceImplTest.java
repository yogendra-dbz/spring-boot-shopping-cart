package com.reljicd.service.impl;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner; 

import com.reljicd.model.Product;
import com.reljicd.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

	@InjectMocks
	private ProductServiceImpl productService;

	@Mock
	private ProductRepository repository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testFetchProduct() {
		Product product = new Product();
		product.setName("Composition Notebook");
		product.setId(1L);
		product.setDescription("Quick notes? We have you covered!");
		product.setPrice(new BigDecimal(12.99));
		product.setQuantity(10);
		Mockito.when(repository.findOne(1L)).thenReturn(product);
		assertEquals(product, productService.findById(1L));
	}

	@Test
	public void testFetchProductNull() {
		Product product = new Product();
		product.setName("Composition Notebook");
		product.setId(1L);
		product.setDescription("Quick notes? We have you covered!");
		product.setPrice(new BigDecimal(12.99));
		product.setQuantity(10);
		Mockito.when(repository.findOne(1L)).thenReturn(product);
		assertEquals(null, productService.findById(11L));
	}

}
