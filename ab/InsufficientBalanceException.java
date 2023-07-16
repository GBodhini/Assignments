package com.ab;
public class InsufficientBalanceException extends RuntimeException
{
	String message;
	public InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	public String toString()
	{
		return " com.ab.InsufficientBalancException : " + message;
	}
}

