/**
 * 
 */
package com.cdk.discountcalculator.model;

import java.math.BigDecimal;

/**
 * @author dipgarg
 *
 */
public class BillingContext {
	
	public BillingContext(String customerType, BigDecimal billAmount) {
		super();
		CustomerType = customerType;
		this.billAmount = billAmount;
	}
	public String getCustomerType() {
		return CustomerType;
	}
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}
	public BigDecimal getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	private String CustomerType;
	private BigDecimal billAmount;

}
