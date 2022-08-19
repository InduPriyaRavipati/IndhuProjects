package com.banking.model;

public class bankModel {
	private int accNum;
	private int accBal;
	private String accHolderName;
	private String accPassword;
	private int pinNumber;
	//generate setters and getters
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum2) {
		this.accNum = accNum2;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccPassword() {
		return accPassword;
	}
	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}
	
	
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public void depositAmount(int amount) { //deposit
		this.accBal +=amount;
	}
	public void withDrawAmount(int amount) { //withdraw
		this.accBal -=amount;
	}
	
	
	
	@Override
	public String toString() {
		return "bankModel [accNum=" + accNum + ", accBal=" + accBal + ", accHolderName=" + accHolderName
				+ ", accPassword=" + accPassword + "]";
	}

	
	
	

}
