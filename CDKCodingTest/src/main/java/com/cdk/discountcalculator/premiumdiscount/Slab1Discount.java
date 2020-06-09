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
public class Slab1Discount extends Discount {

	public Slab1Discount(Discount discount) {
		super(discount);
	}

	@Override
	public BigDecimal calculate(BigDecimal billAmount) {
		double billAmountDouble = billAmount.doubleValue();
		double discount = Constant.ZERO_DISCOUNT;
		if(billAmountDouble>Constant.SLAB_RANGE_2 && billAmountDouble<=Constant.SLAB_RANGE_3)
			discount =  (billAmountDouble-Constant.SLAB_RANGE_2 )*(.15);
		else if(billAmountDouble>Constant.SLAB_RANGE_3) 
			discount = Constant.SLAB1_MAXDISCOUNT;
		return new BigDecimal(discount).add(calculateOtherDiscount(billAmount));
	}

}
