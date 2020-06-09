/**
 * 
 */
package com.cdk.discountcalculator.premiumdiscount;

import java.math.BigDecimal;

import com.cdk.discountcalculator.discountdecorator.Discount;




/**
 * @author dipgarg
 *
 */
public class Slab3Discount extends Discount {
	
	public Slab3Discount(Discount discount) {
		super(discount);
	}

	@Override
	public BigDecimal calculate(BigDecimal billAmount) {
		double billAmountDouble = billAmount.doubleValue();
		double discount =Constant.ZERO_DISCOUNT ;
		 if(billAmountDouble>Constant.MAX_SLAB_RANGE) 
			discount = (billAmountDouble-Constant.MAX_SLAB_RANGE)*(.3);
		return new BigDecimal(discount).add(calculateOtherDiscount(billAmount));
	}

}
