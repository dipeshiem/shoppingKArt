/**
 * 
 */
package com.cdk.discountcalculator.normaldiscount;

import java.math.BigDecimal;

import com.cdk.discountcalculator.discountdecorator.Discount;



/**
 * @author dipgarg
 * 
 * this class is for max slab discount 
 *
 */
public class Slab2Discount extends Discount {

	public Slab2Discount(Discount discount) {
		super(discount);
	}

	@Override
	public BigDecimal calculate(BigDecimal billAmount) {
		double billAmountDouble = billAmount.doubleValue();
		double discount =Constant.ZERO_DISCOUNT ;
		 if(billAmountDouble>Constant.MAX_SLAB_RANGE) 
			discount = (billAmountDouble-Constant.MAX_SLAB_RANGE)*(.2);
		return new BigDecimal(discount).add(calculateOtherDiscount(billAmount));
	}

}
