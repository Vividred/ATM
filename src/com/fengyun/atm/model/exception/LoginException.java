package com.fengyun.atm.model.exception;

public class LoginException extends ATMException
{

	/**
	 * ԭ��д��ƪ�����ʱ��ֻ���Һ��ϵ�֪�����Ǹ����
	 * ����ֻ���ϵ�֪����
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginException()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginException(String message, Throwable cause)
	{
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LoginException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	public LoginException(Throwable cause)
	{
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
