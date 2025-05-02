package com.skilldistillery.designerbrands.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class DesignerBrandTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private DesignerBrand brand;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPADesignerBrands");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		brand = em.find(DesignerBrand.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		brand = null;
	}

	@Test
	void test_DesignerBrand_entity_mapping() {
		assertNotNull(brand);
		assertEquals("Gucci", brand.getName());
	}

}
