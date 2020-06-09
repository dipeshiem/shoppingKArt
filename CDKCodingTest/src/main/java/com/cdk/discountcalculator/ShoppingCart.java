/**
 * 
 */
package com.cdk.discountcalculator;

import java.math.BigDecimal;

import com.cdk.discountcalculator.model.BillingContext;

/**
 * @author dipgarg
 *
 */
public class ShoppingCart {
	
	public ShoppingCart(ICalculatorStrategy calculatorStrategy) {
		super();
		this.calculatorStrategy = calculatorStrategy;
	}

	private ICalculatorStrategy calculatorStrategy;
	
	public void setCalculatorStrategy(ICalculatorStrategy calculatorStrategy) {
		this.calculatorStrategy = calculatorStrategy;
	}

	public BigDecimal calculateFinalAmount(BillingContext billingContext){
		
		return  calculatorStrategy.calculateFinalBill(billingContext);
		
	}
		

}
