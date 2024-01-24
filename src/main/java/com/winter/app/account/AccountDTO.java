package com.winter.app.account;

import java.sql.Date;

import com.winter.app.product.ProductDTO;

public class AccountDTO {
//	ACCOUNTNUM	NUMBER
//	USERNAME	VARCHAR2(20)
//	PRODUCTNUM	NUMBER
//	ACCOUNTPW	NUMBER(4)
//	ACCOUNTDATE	DATE
//	ACCOUNTBALANCE	NUMBER
	private Long accountNum;
	private String userName;
	private Long productNum;
	private Long accountpw;
	private Date accountDate;
	private Long accountBalance;
	
	private ProductDTO productDTO;
	
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(Long accountNum) {
		this.accountNum = accountNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public Long getAccountpw() {
		return accountpw;
	}
	public void setAccountpw(Long accountpw) {
		this.accountpw = accountpw;
	}
	public Date getAccountDate() {
		return accountDate;
	}
	public void setAccountDate(Date accountDate) {
		this.accountDate = accountDate;
	}
	public Long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
