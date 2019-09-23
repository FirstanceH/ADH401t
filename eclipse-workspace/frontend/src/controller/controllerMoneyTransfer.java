package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.MoneyTransfer;
import service.moneyEJB;

@ManagedBean(name="controllermoneytransfer")
@SessionScoped

public class controllerMoneyTransfer {
	
	@EJB
	moneyEJB moneyservices;
	
	@ManagedProperty(value="#{moneytransfer}")
	
	private MoneyTransfer moneytransfer;
	
	
	public void AddTransaction()
	{
		System.out.println("is in use");
		moneyservices.addNewTransaction(moneytransfer.getEntity());
	}


	public MoneyTransfer getMoneytransfer() {
		return moneytransfer;
	}


	public void setMoneytransfer(MoneyTransfer moneytransfer) {
		this.moneytransfer = moneytransfer;
	}
	
	

}
