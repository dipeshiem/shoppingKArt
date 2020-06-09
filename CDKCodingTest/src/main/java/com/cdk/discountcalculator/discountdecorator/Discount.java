/**
 * 
 */
package com.cdk.discountcalculator.discountdecorator;

import java.math.BigDecimal;

/**
 * @author dipgarg
 * 
 * this is abstract class for all discount implementation class , 
 * for all slabs there will be one concrete class 
 *
 */
public abstract class Discount {
	
	  private  Discount discount;

	    public Discount(Discount discount) {
	        this.discount = discount;
	    }

	 
	    public Discount() {
	        this.discount = null;
	    }
        
	    /**
	     * 
	     * @param billAmount
	     * @return
	     */
	    protected BigDecimal calculateOtherDiscount(BigDecimal billAmount) {
	        // If don't exist exist
	        if(discount == null) return new BigDecimal(0);
	        return discount.calculate(billAmount);
	    }

	    /**
	     * all implementing class should override this method 
	     * @param billAmount
	     * @return
	     */
	    public abstract BigDecimal calculate(BigDecimal billAmount);

}
