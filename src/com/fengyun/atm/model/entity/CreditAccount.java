package com.fengyun.atm.model.entity;

import com.fengyun.atm.model.exception.BalanceNotEnoughException;

public class CreditAccount extends Account
{
	private double ceiling;
	public CreditAccount()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditAccount(Long id, String password, String name,
			String personId, String email, double balance)
	{
		super(id, password, name, personId, email, balance);
		// TODO Auto-generated constructor stub
	}
	
	public double getCeiling()
	{	
		return this.ceiling;
	}
	
	public void setCeiling(double ceil)
	{
		this.ceiling = ceil;
	}

	@Override
	public Account withdraw(double money) throws BalanceNotEnoughException
	{
		// TODO Auto-generated method stub
		if(this.getBalance() + this.ceiling - money >= 0)
		{
			this.setBalance(this.getBalance()-money);
			System.out.println("�ɹ�ȡ��"+money+"Ԫ,ʣ����Ϊ"+this.getBalance());
		}
		else {
			throw new BalanceNotEnoughException("͸֧����");
		}
		return this;

	}

	@Override
	public String toString()
	{
		return "CreditAccount [ceiling=" + ceiling + ", getId()=" + getId() + ", getPassword()="
				+ getPassword() + ", getName()=" + getName()
				+ ", getPersonId()=" + getPersonId() + ", getEmail()="
				+ getEmail() + ", getBalance()=" + getBalance()
				+  "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(ceiling);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditAccount other = (CreditAccount) obj;
		if (Double.doubleToLongBits(ceiling) != Double
				.doubleToLongBits(other.ceiling))
			return false;
		return true;
	}
	
	
	

}
