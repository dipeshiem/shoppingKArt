/**
 * 
 */
package com.cdk.discountcalculator;

import java.math.BigDecimal;

import com.cdk.discountcalculator.model.BillingContext;

/**
 * @author dipgarg
 * this is interface for different strategy based in type of Customer , different type of customer will implement this interface. for now giving inplementation for Normal 
 * and premium customer but going forward any new customer can be added  
 *
 */
public interface ICalculatorStrategy {
	
    /**
	 * method  will give final amount after calculating discount  
	 *
     * @param billingContext {@link BillingContext} 
     * @return final Bigdecimal value 
     */
	BigDecimal calculateFinalBill(BillingContext billingContext);

}
