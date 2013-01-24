package com.fengyun.atm.model.entity;

import com.fengyun.atm.model.exception.BalanceNotEnoughException;
import com.fengyun.atm.model.exception.LoanException;

//
//requestLoan:����,����money
//payLoan:����,����money
//getLoan:��ȡ�û������ܶ�

public interface Loanable
{
	public abstract void requestLoan(double money);
	public abstract void payLoan(double money) throws LoanException, BalanceNotEnoughException;
	public abstract double getLoan();

}
