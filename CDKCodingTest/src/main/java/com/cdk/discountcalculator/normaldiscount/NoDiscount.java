/**
 * 
 */
package com.cdk.discountcalculator.normaldiscount;

import java.math.BigDecimal;

import com.cdk.discountcalculator.discountdecorator.Discount;


/**
 * @author dipgarg
 * this class if for no discount till bill 5000
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
		return new BigDecimal(Constant.ZERO_DISCOUNT).add( this.calculateOtherDiscount(billAmount));
	}
	
}

