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
public class Slab2Discount extends Discount {

	public Slab2Discount(Discount discount) {
		super(discount);
	}

	@Override
	public BigDecimal calculate(BigDecimal billAmount) {
		double billAmountDouble = billAmount.doubleValue();
		double discount = 0;
		if(billAmountDouble>Constant.SLAB_RANGE_3 && billAmountDouble<=Constant.MAX_SLAB_RANGE)
			discount =  (billAmountDouble-Constant.SLAB_RANGE_3)*(.2);
		else if(billAmountDouble>Constant.MAX_SLAB_RANGE) 
			discount = Constant.SLAB2_MAXDISCOUNT;
		return new BigDecimal(discount).add(calculateOtherDiscount(billAmount));
	}

}
