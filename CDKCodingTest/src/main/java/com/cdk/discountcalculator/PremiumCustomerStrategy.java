/**
 * 
 */
package com.cdk.discountcalculator;

import java.math.BigDecimal;

import com.cdk.discountcalculator.discountdecorator.Discount;
import com.cdk.discountcalculator.model.BillingContext;
import com.cdk.discountcalculator.premiumdiscount.NoDiscount;
import com.cdk.discountcalculator.premiumdiscount.Slab1Discount;
import com.cdk.discountcalculator.premiumdiscount.Slab2Discount;
import com.cdk.discountcalculator.premiumdiscount.Slab3Discount;

/**
 * @author dipgarg
 * this is strategy class for premium customer 
 *
 */
public class PremiumCustomerStrategy implements ICalculatorStrategy {

	@Override
	public BigDecimal calculateFinalBill(BillingContext billingContext) {
		//Calculate Discount based on normal discount decorator
	    Discount discount =  new Slab3Discount(new Slab2Discount(new Slab1Discount(new NoDiscount())));
		return billingContext.getBillAmount().subtract((discount.calculate(billingContext.getBillAmount())));
	}

}
