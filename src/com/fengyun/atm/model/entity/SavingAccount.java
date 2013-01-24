package com.fengyun.atm.model.entity;

import com.fengyun.atm.model.exception.BalanceNotEnoughException;

public class SavingAccount extends Account
{

	public SavingAccount()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(Long id, String password, String name,
			String personId, String email, double balance)
	{
		super(id, password, name, personId, email, balance);
		// TODO Auto-generated constructor stub
	}
	
	// ȡ��
	@Override
	public Account withdraw(double money) throws BalanceNotEnoughException
	{
		// TODO Auto-generated method stub
		if(money <= this.getBalance() )
		{
			this.setBalance(this.getBalance() - money);
			System.out.println("�ɹ�ȡ��"+money+"Ԫ,ʣ����Ϊ"+this.getBalance());
		}else {
			throw new BalanceNotEnoughException("����");
		}
		
		return this;
	}

	@Override
	public String toString()
	{
		return "SavingAccount [getId()=" + getId() + ", getPassword()="
				+ getPassword() + ", getName()=" + getName()
				+ ", getPersonId()=" + getPersonId() + ", getEmail()="
				+ getEmail() + ", getBalance()=" + getBalance() + "]";
	}
	

}
