/**
 * 
 */
package com.cdk.discountcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cdk.discountcalculator.model.BillingContext;

/**
 * @author dipgarg
 *
 */
class ShoppingCartTest1 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.cdk.discountcalculator.ShoppingCart#calculateFinalAmount(com.cdk.discountcalculator.model.BillingContext)}.
	 */
	@Test
	void testCalculateFinalAmount() {
		BillingContext billingContext = new BillingContext("Normal", new BigDecimal(5000));
		ShoppingCart shoppingCart = new ShoppingCart(new NormalCustomerStrategy());
		BigDecimal output = shoppingCart.calculateFinalAmount(billingContext);
		assertEquals(5000, output.doubleValue());

	}

	@Test
	void testCalculateFinalAmount1() {
		BillingContext billingContext = new BillingContext("Normal", new BigDecimal(10000));
		ShoppingCart shoppingCart = new ShoppingCart(new NormalCustomerStrategy());
		BigDecimal output = shoppingCart.calculateFinalAmount(billingContext);
		assertEquals(9500, output.doubleValue());

	}

	@Test
	void testCalculateFinalAmount2() {
		BillingContext billingContext = new BillingContext("Normal", new BigDecimal(15000));
		ShoppingCart shoppingCart = new ShoppingCart(new NormalCustomerStrategy());
		BigDecimal output = shoppingCart.calculateFinalAmount(billingContext);
		assertEquals(13500, output.doubleValue());

	}

	@Test
	void testCalculateFinalAmount4() {
		BillingContext billingContext = new BillingContext("Premium", new BigDecimal(4000));
		ShoppingCart shoppingCart = new ShoppingCart(new PremiumCustomerStrategy());
		BigDecimal output = shoppingCart.calculateFinalAmount(billingContext);
		assertEquals(3600, output.doubleValue());

	}

	@Test
	void testCalculateFinalAmount5() {
		BillingContext billingContext = new BillingContext("Premium", new BigDecimal(8000));
		ShoppingCart shoppingCart = new ShoppingCart(new PremiumCustomerStrategy());
		BigDecimal output = shoppingCart.calculateFinalAmount(billingContext);
		assertEquals(7000, output.doubleValue());

	}

	@Test
	void testCalculateFinalAmount6() {
		BillingContext billingContext = new BillingContext("Premium", new BigDecimal(12000));
		ShoppingCart shoppingCart = new ShoppingCart(new PremiumCustomerStrategy());
		BigDecimal output = shoppingCart.calculateFinalAmount(billingContext);
		assertEquals(10200, output.doubleValue());

	}

	@Test
	void testCalculateFinalAmount7() {
		BillingContext billingContext = new BillingContext("Premium", new BigDecimal(20000));
		ShoppingCart shoppingCart = new ShoppingCart(new PremiumCustomerStrategy());
		BigDecimal output = shoppingCart.calculateFinalAmount(billingContext);
		assertEquals(15800, output.doubleValue());

	}

}
