package com.fengyun.atm.model.exception;

public class BalanceNotEnoughException extends ATMException
{

	/**
	 * ԭ��д��ƪ�����ʱ��ֻ���Һ��ϵ�֪�����Ǹ����
	 * ����ֻ���ϵ�֪����
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BalanceNotEnoughException()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public BalanceNotEnoughException(String message, Throwable cause)
	{
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BalanceNotEnoughException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BalanceNotEnoughException(Throwable cause)
	{
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
