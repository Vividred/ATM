package com.fengyun.atm.model.exception;

public class ATMException extends Exception
{

	/**
	 * ԭ��д��ƪ�����ʱ��ֻ���Һ��ϵ�֪�����Ǹ����
	 * ����ֻ���ϵ�֪����
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ATMException()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public ATMException(String message, Throwable cause)
	{
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ATMException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ATMException(Throwable cause)
	{
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
