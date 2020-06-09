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
public class NoDiscount extends Discount {

	public NoDiscount() {
		super();
	}

	public NoDiscount(Discount discount) {
		super(discount);
	}

	@Override
	public BigDecimal calculate(BigDecimal billAmount) {
		double billAmountDouble = billAmount.doubleValue();
		double discount = Constant.ZERO_DISCOUNT;
		if( billAmountDouble<=Constant.SLAB_RANGE_2)
			discount =  (billAmountDouble)*(.1);
		else if(billAmountDouble>Constant.SLAB_RANGE_2) 
			discount = Constant.SLAB0_MAXDISCOUNT;
		return new BigDecimal(discount).add( this.calculateOtherDiscount(billAmount));
	}
	
}

