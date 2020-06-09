/**
 * 
 */
package com.cdk.discountcalculator;

import java.math.BigDecimal;

import com.cdk.discountcalculator.discountdecorator.Discount;
import com.cdk.discountcalculator.model.BillingContext;
import com.cdk.discountcalculator.normaldiscount.NoDiscount;
import com.cdk.discountcalculator.normaldiscount.Slab1Discount;
import com.cdk.discountcalculator.normaldiscount.Slab2Discount;

/**
 * @author dipgarg
 * this class is used for defining strategy for normal Customer
 *
 */
public class NormalCustomerStrategy implements ICalculatorStrategy {

	@Override
	public BigDecimal calculateFinalBill(BillingContext billingContext) {
		
		//Calculate Discount based on normal discount decorator
		Discount discount =  new Slab2Discount(new Slab1Discount(new NoDiscount()));
		return billingContext.getBillAmount().subtract(discount.calculate(billingContext.getBillAmount()));
	}
	
	public static void main(String args[]) {
		NormalCustomerStrategy customerStrategy = new NormalCustomerStrategy();
		BigDecimal output = customerStrategy.calculateFinalBill(new BillingContext("new", new BigDecimal(11000)));
		System.out.println(output.doubleValue());
	}

}
