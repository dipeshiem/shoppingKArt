/**
 * 
 */
package com.cdk.discountcalculator.normaldiscount;

import java.math.BigDecimal;

import com.cdk.discountcalculator.discountdecorator.Discount;


/**
 * @author dipgarg
 * this class is for slab between 5000 to 10000
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
		if(billAmountDouble>Constant.SLAB_RANGE_3 && billAmountDouble<=Constant.MAX_SLAB_RANGE)
			discount =  (billAmountDouble-Constant.SLAB_RANGE_3)*(.1);
		else if(billAmountDouble>Constant.MAX_SLAB_RANGE) 
			discount = Constant.SLAB2_MAXDISCOUNT;
		return new BigDecimal(discount).add(calculateOtherDiscount(billAmount));
	}

}
