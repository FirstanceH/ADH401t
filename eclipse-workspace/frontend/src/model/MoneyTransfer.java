package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entity.moneyEntity;

@ManagedBean(name="moneytransfer")
@SessionScoped
public class MoneyTransfer {
	
	private String name;
	private String sourcePassport;
	private String destPassport;
	private String destBank;
	private String destCountry;
	private Integer accountNumber;
	private Double amount;
	private Integer transCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestPassport() {
		return destPassport;
	}
	public void setDestPassport(String destPassport) {
		this.destPassport = destPassport;
	}
	public String getDestBank() {
		return destBank;
	}
	public void setDestBank(String destBank) {
		this.destBank = destBank;
	}
	public String getDestCountry() {
		return destCountry;
	}
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getTransCode() {
		
		int transCode;
		For(transCode = 0; transCode < 9999; transCode++)
		{
			System.out.println(transCode);
		}
		return transCode;
	}
	public void setTransCode(Integer transCode) {
		this.transCode = transCode;
	}
	
	
	public moneyEntity getEntity()
	{
		moneyEntity moneyentity = new moneyEntity();
		moneyentity.setName(name);
		moneyentity.setSourcePassport(sourcePassport);
		moneyentity.setDestPassport(destPassport);
		moneyentity.setDestBank(destBank);
		moneyentity.setDestCountry(destCountry);
		moneyentity.setAccountNumber(accountNumber);
		moneyentity.setAmount(amount);
		moneyentity.setTransCode(transCode); 
		
		return moneyentity;
		
	}
	
	

}
